package com.atm.primeraweb;

import com.atm.primeraweb.modelo.Persona;
import com.atm.primeraweb.repository.PersonaRepo;
import com.atm.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PrimeraWebSpringbootApplication {

    @Autowired
    private PersonaService personaServ;

    public static void main(String[] args) {
        SpringApplication.run(PrimeraWebSpringbootApplication.class, args);

    }


}
