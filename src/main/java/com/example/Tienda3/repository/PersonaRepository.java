/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda2.repository;

import com.tienda2.entity.Pais;
import com.tienda2.entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Keng
 */
@Repository
public interface PersonaRepository extends CrudRepository<Pais, Long>{
    Persona findByNombre (String nombre);
}
