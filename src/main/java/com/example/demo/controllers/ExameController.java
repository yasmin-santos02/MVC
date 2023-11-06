package com.example.demo.controllers;

import com.example.demo.models.Consulta;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/consulta")
public class ExameController {
    private static final List<Consulta> consulta = new ArrayList<Consulta>();

    public ExameController() {
        consulta.add(new Consulta("Dr. Joaquim Manuel","Maria",100));
        consulta.add(new Consulta("Dra. Manuela Santos","Luiza Souza",55));
        consulta.add(new Consulta("Dr. Luiz Lopes","Penelope",50));
    }

    @GetMapping
    public String getConsulta(Model model)
    {
        model.addAttribute("consulta",consulta);
        return "consulta";
    }
}

