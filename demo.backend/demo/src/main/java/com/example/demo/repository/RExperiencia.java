
package com.example.demo.repository;

import com.example.demo.entity.Experiencia;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
public interface RExperiencia extends JpaRepository<Experiencia, Integer>{
    public Optional<Experiencia> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);

    public void save(Experiencia expe);

    public boolean existsById(int id);

    public void deleteById(int id);

    public Optional<Experiencia> findById(int id);

    public List<Experiencia> findAll();
}