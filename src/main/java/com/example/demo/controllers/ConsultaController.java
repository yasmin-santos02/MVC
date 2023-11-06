package com.example.demo.controllers;

import com.example.demo.models.Consulta;
import com.example.demo.models.Consulta;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("api/consulta")
public class ConsultaController {
    private static final List<Consulta> consulta = new ArrayList<Consulta>();

    public ConsultaController() {
        consulta.add(new Consulta("Dr. Joaquim Manuel","Maria",100));
        consulta.add(new Consulta("Dra. Manuela Santos","Luiza Souza",55));
        consulta.add(new Consulta("Dr. Luiz Lopes","Penelope",50));
    }

    @GetMapping
    public List<Consulta> getConsulta()
    {
        return consulta;
    }

}
