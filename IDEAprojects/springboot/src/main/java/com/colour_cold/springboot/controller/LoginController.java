package com.colour_cold.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;


@Controller
//在templates下的所有页面，只能通过controller来跳转，但需要模板引擎的支持
public class LoginController {
    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session) {
        if (!StringUtils.isEmpty(username) && password.equals("123456")) {
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";

        } else {
            model.addAttribute("msg", "用户名或密码错误");
            return "index";
        }
    }

    @RequestMapping("/user/logout")
    public String logOut(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
