
package com.TodocodeAPI.s.EjercicioIntegrador.domain;

import java.time.LocalDate;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter 
public class Paciente {
    int id;
    String dni;
    String nombre;
    String apellido;
    LocalDate fechaNacimiento;

    public Paciente() {
    }

    public Paciente(int id, String dni, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
