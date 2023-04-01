/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Tienda3.service;

import com.tienda2.entity.Persona;
import com.tienda2.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Keng
 */
@Service
public class UserService implements UserDetailsService{
    @Autowired
    public IPersonaService PersonaService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         Persona persona = this.PersonaService.finByNombre(username);
        UserPrincipal userPrincipal = new UserPrincipal(persona);
        return userPrincipal;
    }
}
