package com.portfolio.ejz.Service;

import com.portfolio.ejz.Entity.Skills;
import com.portfolio.ejz.Repository.SkillsRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillsService {
    @Autowired
    SkillsRepository skillsRepository;

    public List<Skills> list() {
        return skillsRepository.findAll();
    }

    public Optional<Skills> getOne(int id) {
        return skillsRepository.findById(id);
    }

    public Optional<Skills> getByNombreSkill(String nombreSkill) {
        return skillsRepository.findByNombreSkill(nombreSkill);
    }

    public void save(Skills ski) {
        skillsRepository.save(ski);
    }

    public void delete(int id) {
        skillsRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return skillsRepository.existsById(id);
    }

    public boolean existsByNombreSkill(String nombreSkill) {
        return skillsRepository.existsByNombreSkill(nombreSkill);
    }
}
