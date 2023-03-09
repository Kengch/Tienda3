/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Pais to edit this template
 */
package com.tienda2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author Keng
 */
@Entity
@Table (name="paises")
public class Pais implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String pais;
    
    public long getId(){
        return id;
    }
    
    public String getPais(){
        return pais;
    }
    
    public void setID(long i){
        this.id=i;
    }
    
    public void setPais(String p){
        this.pais=p;
    }
}
