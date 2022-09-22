package com.springfield.demo.controller;

import com.springfield.demo.entity.Transport;
import com.springfield.demo.repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Controller
public class MapController {

    @Autowired
    private TransportRepository transportRepository;

    @GetMapping("map")
    public String map(@RequestParam(value = "partitionid", required = false) String partitionid, Model model) {

        System.out.println(partitionid);

        Optional<Transport> transport = transportRepository.findById(Long.parseLong(partitionid));

        model.addAttribute("latitude", transport.get().getLatitude());
        model.addAttribute("longitude", transport.get().getLongitude());
        return "map";
    }
}
