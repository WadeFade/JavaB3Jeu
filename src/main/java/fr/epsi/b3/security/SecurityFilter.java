//package fr.epsi.b3.security;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//@WebFilter("/*")
//public class SecurityFilter implements Filter {
//
//    public SecurityFilter() {
//    }
//
//    public  void init(FilterConfig filterConfig) {
//        // l'objet filterConfig encapsule les paramètres
//        // d'initialisation de ce filtre
//
//    }
//
//
//    @Override
//    public void destroy() {
//    }
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        HttpServletRequest req = (HttpServletRequest) request;
//        HttpServletResponse res = (HttpServletResponse) response;
//        String servletPath = req.getServletPath();
//
//        System.out.println("TEST");
//        System.out.println(servletPath);
//        chain.doFilter(request,response);
//
//
//        if (servletPath.equals("/")) {
//            chain.doFilter(req, res);
//        }
//        HttpSession session = req.getSession();
//        if (session.getAttribute("user") != null) {
//            chain.doFilter(req, res);
//        }
//
//
//    }
//}
