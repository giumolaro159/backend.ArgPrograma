package com.example.demo.security.Service;

import com.example.demo.security.Repository.iRollRepository;
import com.example.demo.security.entity.Roll;
import com.example.demo.security.enums.RollNombre;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RollService {
    @Autowired
    iRollRepository irollRepository;
    
    public Optional<Roll> getByRolNombre(RollNombre rollNombre){
        return irollRepository.findbyRollNombre(rollNombre);
    }
    
    public void save(Roll roll){
        irollRepository.save(roll);
    }
}