package com.atm.primeraweb.controller;

import com.atm.primeraweb.modelo.Persona;
import com.atm.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/personas")
public class PersonaContr {

    @Autowired
    private PersonaService personaService;
    @GetMapping
    //la clase model se utiliza para transferir objetos del controller a la vista
    public String listarPersonas(Model model){
        List<Persona>personas = personaService.obtenerTodas();
        model.addAttribute("listaPersonas", personas);
        return "listar";

    }

    @GetMapping("/nueva")
    public String formularioNuevaPersonsa(Model model){
        model.addAttribute("persona" , new Persona());
        model.addAttribute("accion","/personas/nueva");
        return "formulario";
    }

    @PostMapping("/nueva")
    public String guardarPersona(@ModelAttribute Persona persona){
        personaService.crear(persona);
        return "redirect:/personas";
    }

}
