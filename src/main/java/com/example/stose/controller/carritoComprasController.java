package com.example.stose.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/inicio")
public class carritoComprasController {
    
    @GetMapping({ "/carrito-compras", "Carrito-Compras" })
    public String ControllerCarritoCompras(Model model) {
        return "carrito-compras";
    }
}