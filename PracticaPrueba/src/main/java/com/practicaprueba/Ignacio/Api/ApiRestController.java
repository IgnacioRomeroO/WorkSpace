package com.practicaprueba.Ignacio.Api;

import com.practicaprueba.Ignacio.Models.Prueba;
import com.practicaprueba.Ignacio.Services.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiRestController {

    @Autowired
    RegistroService registroService;

    @RequestMapping("/obtenerRegistro")
    public List<Prueba> obtenerListaPrueba(){
        List<Prueba> listaPrueba = registroService.buscarDatos();

        return listaPrueba;
    }
}
