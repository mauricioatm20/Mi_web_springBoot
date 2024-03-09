package com.atm.primeraweb.service.Impl;

import com.atm.primeraweb.modelo.Persona;
import com.atm.primeraweb.repository.PersonaRepo;
import com.atm.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaImpl implements PersonaService {

    @Autowired
    private PersonaRepo personaRepo;

    @Override
    public List<Persona> obtenerTodas() {

        return personaRepo.findAll();
    }

    @Override
    public Persona obtenerporId(int idPersona) {
        return personaRepo.findById(idPersona).orElse(null);
    }

    @Override
    public Persona crear(Persona persona) {
        return personaRepo.save(persona);
    }

    @Override
    public Persona actualizar(int idPersona, Persona persona) {
        Persona personaBD = personaRepo.findById(idPersona).orElse(null);
        if(personaBD != null){
            personaBD.setNombre(persona.getNombre());
            personaBD.setEdad(persona.getEdad());
            return personaRepo.save(personaBD);
        }

        return null;
    }

    @Override
    public void eliminar(int idPersona) {
        personaRepo.deleteById(idPersona);
    }


}
