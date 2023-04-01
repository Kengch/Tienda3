/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda2.service;

import com.tienda2.entity.Persona;
import com.tienda2.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.stereotype.Service;

/**
 *
 * @author Keng
 */
@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepository personaRepository;
    
    @Override
    public List<Persona> getAllPersona() {
        //return (List<Persona>)personaRepository.findAll();
        return null;
    }

    @Override
    public Persona getPersonaById(long id) {
        //return personaRepository.findById(id).orElse(null);
        return null;
    }

    @Override
    public void savePersona(Persona persona) {
        //personaRepository.save(persona);
    }

    @Override
    public void delete(long id) {
        personaRepository.deleteById(id);
    }
    
    @Override
    public Persona findByNombre(String username) {
        return personaRepository.findByNombre(username);
    }
}
