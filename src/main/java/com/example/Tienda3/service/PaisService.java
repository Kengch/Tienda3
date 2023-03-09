/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda2.service;

import com.tienda2.entity.Pais;
import com.tienda2.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Keng
 */
@Service
public class PaisService {
    @Autowired
    private PaisRepository PaisRepository;
    
    public List<Pais> ListCountry() {
        return (List<Pais>)PaisRepository.findAll();
    }
}
