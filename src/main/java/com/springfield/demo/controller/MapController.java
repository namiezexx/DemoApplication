package com.springfield.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {
    
    @GetMapping("map")
    public String map(Model model) {
        model.addAttribute("latitude", 37.504449);
        model.addAttribute("longitude", 127.048860);
        return "map";
    }
}
