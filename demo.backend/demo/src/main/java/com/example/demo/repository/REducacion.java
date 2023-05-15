package com.example.demo.repository;

import com.example.demo.entity.Educacion;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface REducacion extends JpaRepository<Educacion, Integer>{
    public Optional<Educacion> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);

    public void deleteById(int id);

    public boolean existsById(int id);

    public void save(Educacion educacion);

    public Optional<Educacion> findById(int id);

    public List<Educacion> findAll();
}