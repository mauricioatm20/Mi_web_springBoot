package com.atm.primeraweb.repository;

import com.atm.primeraweb.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends JpaRepository<Persona,Integer> {
}
