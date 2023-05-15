package com.portfolio.back.repository;

import com.portfolio.back.model.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaLabRepository extends JpaRepository <ExperienciaLaboral, Long>{
    
}
