package com.colour_cold.springboot.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登陆成功之后，应该有用户的sessoin
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (loginUser == null) {//没有登陆
            request.setAttribute("msg", "未登录");
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;
        }
        return true;
    }
}
