package com.atm.primeraweb.service;

import com.atm.primeraweb.modelo.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> obtenerTodas();
    Persona obtenerporId(int idPersona);
    Persona crear(Persona persona);
    Persona actualizar(int idPersona , Persona persona);
    void eliminar(int idPersona);
}
