package org.kodigo.examplemvc.controller;

import org.kodigo.examplemvc.model.Tecnico;
import org.kodigo.examplemvc.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
public class TecnicoController {

    @Autowired
    private TecnicoRepository tecnicoRepository;

    @GetMapping("/tecnicos")
    public String getAllTecnicos(Model model){
        List<Tecnico> tecnicos = tecnicoRepository.findAll();
        model.addAttribute("Tecnicos", tecnicos);
        return "lista-tecnicos";
    }
}
