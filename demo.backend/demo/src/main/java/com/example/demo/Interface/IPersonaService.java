package com.example.demo.Interface;

import com.example.demo.entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas 
    public List<Persona> getPersona();
    
    //Guardar un objeto persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto persona por ID 
    public void deletePersona(Long id);
    
    //Buscar un objeto persona por ID 
    public Persona findPersona(Long id); 
}
