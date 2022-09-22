package com.springfield.demo.controller;

import com.springfield.demo.entity.Transport;
import com.springfield.demo.repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class MapController {

    @Autowired
    private TransportRepository transportRepository;

    @GetMapping("map")
    public String map(Model model) {

        return "map";
    }

    @GetMapping("/map/{partitionid}")
    public String map(@PathVariable(name = "partitionid") Long partitionid, Model model) {

        Optional<Transport> transport = transportRepository.findById(partitionid);

        model.addAttribute("latitude", transport.get().getLatitude());
        model.addAttribute("longitude", transport.get().getLongitude());
        return "map";
    }
}
