package com.saika.controller;

import com.saika.model.AdminAccount;
import com.saika.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String loginPage(@RequestParam(required = false) String logout, Model model) {
        model.addAttribute("pageTitle", "Youtubu Login");
        if (logout != null) {
            model.addAttribute("message", "You have been logged out.");
        }
        return "login";
    }

    @PostMapping("/login")
    public String login(
        @RequestParam String email,
        @RequestParam String password,
        Model model
    ) {
        model.addAttribute("pageTitle", "Youtubu Login");
        model.addAttribute("email", email);

        AdminAccount account = loginService.authenticate(email, password);
        if (account == null) {
            model.addAttribute("errorMessage", "Invalid email or password.");
            return "login";
        }

        model.addAttribute("account", account);
        return "dashboard";
    }
}
