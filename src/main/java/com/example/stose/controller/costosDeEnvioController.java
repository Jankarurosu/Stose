package com.example.stose.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/inicio")
public class costosDeEnvioController {
    
    @GetMapping({ "/costos-de-envio", "Costos-De-Envio" })
    public String ControllerCostosDeEnvio(Model model) {
        return "costos-de-envio";
    }
}