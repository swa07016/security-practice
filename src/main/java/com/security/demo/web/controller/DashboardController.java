package com.security.demo.web.controller;

import com.security.demo.domain.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String getDashboard(@AuthenticationPrincipal User user, Model model) {
        System.out.println(user);
        model.addAttribute("user", user);
        return "dashboard";
    }
}
