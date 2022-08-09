package com.practicaprueba.Ignacio.Controllers;

import com.practicaprueba.Ignacio.Models.Prueba;
import com.practicaprueba.Ignacio.Services.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/prueba")
public class RegistroController {

    @Autowired
    RegistroService registroService;

    @RequestMapping("")
    public String registro(@ModelAttribute("prueba") Prueba prueba) {

        return "registro.jsp";
    }

    @PostMapping("/guardar")
    public String guardarRegistro(@ModelAttribute("prueba") Prueba prueba, Model model) {
        registroService.guardarRegistro(prueba);
        List<Prueba> listaPrueba = registroService.buscarDatos();
        model.addAttribute("pruebasCapturadas", listaPrueba);

        return "mostrarRegistro.jsp";
    }

    @RequestMapping("/mostrar")
    public String mostrarRegistro(Model model){
        List<Prueba> listaPrueba = registroService.buscarDatos();
        model.addAttribute("pruebasCapturadas", listaPrueba);

        return "mostrarRegistro.jsp";
    }

}
