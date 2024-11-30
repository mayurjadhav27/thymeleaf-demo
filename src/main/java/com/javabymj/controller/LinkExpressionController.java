package com.javabymj.controller;

import com.javabymj.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LinkExpressionController {
    @GetMapping("/link-expression")
    public String variableExpression(Model model){

        model.addAttribute("id",1);
        return "link-expression";
    }
}
