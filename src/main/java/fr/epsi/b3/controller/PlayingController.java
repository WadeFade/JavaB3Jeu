package fr.epsi.b3.controller;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet(urlPatterns = "/playing")
public class PlayingController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String expression = GenerateExpression(7);
        try {
            int eval = EvaluateExpression(expression);
        } catch (ScriptException e) {
            e.printStackTrace();
        }

        String shuffle = GenerateShuffle(expression);

        req.setAttribute("expression", expression);
        req.getRequestDispatcher("/WEB-INF/views/playing.jsp").forward(req, resp);
    }


    int EvaluateExpression(String expression) throws ScriptException {


        List<String> letters = Arrays.asList(expression.toString().split(""));

        int count = 0;
        Integer temp = null;
        String opperators = "";


        for (int i = 0; i < letters.size(); i++) {


            String item = letters.get(i);

            if (temp != null) {
                if (!opperators.equals("")) {
                    switch (opperators) {
                        case "-":
                            count = temp - Integer.parseInt(item);
                            break;
                        case "+":
                            count = temp + Integer.parseInt(item);
                            break;
                        case "*":
                            count = temp * Integer.parseInt(item);
                            break;
                    }
                    temp = count;
                    opperators = "";
                } else {
                    opperators = item;
                }
            } else {
                temp = Integer.parseInt(item);
            }
        }
        return count;
    }


    String GenerateExpression(int size) {

        List<String> opperators = Arrays.asList("*", "+", "-");
        Random r = new Random();

        StringBuilder expression = new StringBuilder();

        for (int i = 0; i < size; i++) {
            int number = r.nextInt(10);
            if (i % 2 == 0) {
                expression.append(Integer.toString(number));
            } else {
                expression.append(opperators.get(r.nextInt(opperators.size())));
            }
        }


        return expression.toString();
    }

    String GenerateShuffle(String expression) {

        StringBuilder generated = new StringBuilder();

        List<String> letters = Arrays.asList(expression.toString().split(""));
        Collections.shuffle(letters);
        for (String letter : letters) {
            generated.append(letter);
        }

        return generated.toString();
    }

}
