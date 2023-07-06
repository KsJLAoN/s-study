package com.samsung.sds.study.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/init")
public class HomeController {
    @GetMapping
    public String init(Model model) {
        model.addAttribute("name", "하제_온");
        return "index.html";
    }
}
