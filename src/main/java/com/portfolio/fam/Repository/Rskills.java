
package com.portfolio.fam.Repository;


import com.portfolio.fam.Entity.skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Rskills extends JpaRepository<skills, Integer>{
    Optional<skills> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    
}
