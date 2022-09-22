package com.springfield.demo.controller;

import com.springfield.demo.entity.Transport;
import com.springfield.demo.repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MapController {

    @GetMapping("map")
    public String map(Model model) {
        model.addAttribute("latitude", 37.504449);
        model.addAttribute("longitude", 127.048860);
        return "map";
    }
}
