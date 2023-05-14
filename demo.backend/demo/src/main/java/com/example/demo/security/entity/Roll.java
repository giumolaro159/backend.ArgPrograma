package com.example.demo.security.entity;

import com.example.demo.security.enums.RollNombre;
import com.sun.istack.internal.NotNull;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Roll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull 
    @Enumerated(EnumType.STRING)
    private RollNombre rollNombre;
    
    //Constructor 

    public Roll() {
    }

    public Roll(RollNombre rollNombre) {
        this.rollNombre = rollNombre;
    }
   
    //getters y setters 

    public RollNombre getRollNombre() {
        return rollNombre;
    }

    public void setRollNombre(RollNombre rollNombre) {
        this.rollNombre = rollNombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
