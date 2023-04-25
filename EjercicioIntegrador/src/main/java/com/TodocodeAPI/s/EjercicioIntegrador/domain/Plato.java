
package com.TodocodeAPI.s.EjercicioIntegrador.domain;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class Plato {
    
    int numeroPlato;
    String nombre;
    Double precio;
    String descripcion;

    public Plato(int numeroPlato, String nombre, Double precio, String descripcion) {
        this.numeroPlato = numeroPlato;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

}
