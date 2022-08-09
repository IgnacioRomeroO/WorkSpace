package com.practicaprueba.Ignacio.Repository;

import com.practicaprueba.Ignacio.Models.Prueba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroRepository extends JpaRepository<Prueba, Long> {
}
