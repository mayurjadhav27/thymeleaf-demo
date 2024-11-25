package com.javabymj.controller;

import com.javabymj.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VariableExpression {

    @GetMapping("/variable-expression")
    public String variableExpression(Model model){
        User user=new User("Mayur","mj@gmail.com","M","Jadhav");
        model.addAttribute("User",user);
        return "variable-expression";
    }
    @GetMapping("/selection-expression")
    public String selectionExpression(Model model){
        User user=new User("Mayur","mj@gmail.com","M","Jadhav");
        model.addAttribute("User",user);
        return "selection-expression";
    }
}
