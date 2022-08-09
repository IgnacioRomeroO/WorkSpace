package com.practicaprueba.Ignacio.Services;

import com.practicaprueba.Ignacio.Models.Prueba;
import com.practicaprueba.Ignacio.Repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroService {
    @Autowired
    RegistroRepository registroRepository;

    public void guardarRegistro(Prueba prueba) {
        registroRepository.save(prueba);
    }

    public List<Prueba> buscarDatos() {
        return registroRepository.findAll();
    }
}
