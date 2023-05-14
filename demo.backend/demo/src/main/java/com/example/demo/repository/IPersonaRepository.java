package com.example.demo.repository;

import com.example.demo.entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {

    public void deleteById(Long id);

    public void save(Persona persona);

    public List<Persona> findAll();

    public Object findBy(Long id);

}
