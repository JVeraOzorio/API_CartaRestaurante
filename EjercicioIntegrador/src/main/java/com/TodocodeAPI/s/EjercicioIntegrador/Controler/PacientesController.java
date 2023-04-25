
package com.TodocodeAPI.s.EjercicioIntegrador.Controler;

import com.TodocodeAPI.s.EjercicioIntegrador.domain.Paciente;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PacientesController {
    
    @GetMapping("/pacientes")
    public List<Paciente> listarPacientes(){
       
        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente(1,"94004818","Jorge Martin","Vera Ozorio", LocalDate.of(1997,6,17)));
        pacientes.add(new Paciente(2,"36019851","Adriana Antonella","Orrego Garcia", LocalDate.of(1991,07,22)));
        pacientes.add(new Paciente(3,"42880627","Osvaldo","Vera",LocalDate.of(2010,2,3)));
       return pacientes; 
    }
}
