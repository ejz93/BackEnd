package com.portfolio.ejz.Service;

import com.portfolio.ejz.Entity.Experiencia;
import com.portfolio.ejz.Repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService {
    @Autowired
    ExperienciaRepository experienciaRepository;
    
    public List<Experiencia> list(){
        return experienciaRepository.findAll();
    }
    
    public Optional<Experiencia> getOne(int id){
        return experienciaRepository.findById(id);
    }
    
    public Optional<Experiencia> getByNombreExp(String nombreExp){
        return experienciaRepository.findByNombreExp(nombreExp);
    }
    
    public void save(Experiencia expe){
        experienciaRepository.save(expe);
    }
    
    public void delete(int id){
        experienciaRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return experienciaRepository.existsById(id);
    }
    
    public boolean existsByNombreExp(String nombreExp){
        return experienciaRepository.existsByNombreExp(nombreExp);
    }
}
