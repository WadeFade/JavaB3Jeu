package fr.epsi.b3.beans;

import javax.script.ScriptException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static java.lang.Math.abs;

public class Expression {

    int result = 0;
    String expression = "";
    String shuffled = "";


    public Expression(int result, String expression, String shuffled) {
        this.result = result;
        this.expression = expression;
        this.shuffled = shuffled;
    }

    public Expression() throws ScriptException {
        this.expression = this.generateExpression(9);
        this.result = this.evaluateExpression(this.expression);
        this.shuffled = this.generateShuffle(this.expression);
    }


    public String toString() {
        return this.shuffled;
    }

    static public float noteExpression(int resultatJoueur, int pastResult) {
        return (float) resultatJoueur - pastResult == 0 ? 1 : 0;
    }

    private int evaluateExpression(String expression) throws ScriptException {


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


    private String generateExpression(int size) {

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

    private String generateShuffle(String expression) {

        ArrayList<Character> shuffled = new ArrayList<Character>();
        int range = 0;
        List<Character> operators = new ArrayList<Character>();
        Random r = new Random();


        for (char c : expression.toCharArray()) {

            switch (c) {
                case '+':
                case '*':
                case '-':
                    operators.add(c);
                    break;
                default:
                    shuffled.add(c);
            }
        }


        for (char c : operators) {
            int i = r.nextInt(shuffled.size() - range) + range;
            range = i + 1;
            shuffled.add(i, c);
        }

        StringBuilder builder = new StringBuilder(shuffled.size());
        for (Character ch : shuffled) {
            builder.append(ch);
        }
        return builder.toString();

    }

    public int getResult() {
        return this.result;
    }
}
