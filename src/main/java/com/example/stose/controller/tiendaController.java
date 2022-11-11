package com.example.stose.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/inicio")
public class tiendaController {
    
    @GetMapping({ "/tienda", "Tienda" })
    public String ControllerTienda(Model model) {
        return "tienda";
    }
}