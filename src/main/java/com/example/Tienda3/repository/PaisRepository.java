/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.PaisRepository to edit this template
 */
package com.tienda2.repository;

import com.tienda2.entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Keng
 */
@Repository
public interface PaisRepository extends CrudRepository<Pais, Long> {
    
}
