package com.example.demo.security.Repository;

import com.example.demo.security.entity.Roll;
import com.example.demo.security.enums.RollNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface iRollRepository extends JpaRepository<Roll, Integer>{
    Optional<Roll> findbyRollNombre(RollNombre rollNombre);

    public void save(Roll roll);
    
}