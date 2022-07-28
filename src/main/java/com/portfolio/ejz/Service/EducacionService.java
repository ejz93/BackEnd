package com.portfolio.ejz.Service;

import com.portfolio.ejz.Entity.Educacion;
import com.portfolio.ejz.Repository.EducacionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {
    @Autowired
    EducacionRepository educacionRepository;
    
    public List<Educacion> list(){
        return educacionRepository.findAll();
    }
    
    public Optional<Educacion> getOne(int id){
        return educacionRepository.findById(id);
    }
    
    public Optional<Educacion> getByNombreEdu(String nombreEdu){
        return educacionRepository.findByNombreEdu(nombreEdu);
    }
    
    public void save(Educacion edu){
        educacionRepository.save(edu);
    }
    
    public void delete(int id){
        educacionRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return educacionRepository.existsById(id);
    }
    
    public boolean existsByNombreEdu(String nombreEdu){
        return educacionRepository.existsByNombreEdu(nombreEdu);
    }
}
