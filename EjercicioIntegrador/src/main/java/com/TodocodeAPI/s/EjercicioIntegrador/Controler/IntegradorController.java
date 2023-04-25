package com.TodocodeAPI.s.EjercicioIntegrador.Controler;


import com.TodocodeAPI.s.EjercicioIntegrador.domain.Plato;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class IntegradorController {
    
    
    
    @GetMapping("/plato/{id}")
    @ResponseBody
    public Plato mostrarPlato(@PathVariable int id){
        Map<Integer,Plato> carta = new HashMap<>();
        carta.put(1, new Plato(1,"Pizza",230D,"Masa con salsa y queso"));
        carta.put(2, new Plato(2,"Malfattis",450D,"Bolitas de masa tipo nhoquis"));
        carta.put(3, new Plato(3,"Fideos",400D,"Fideos con salsa"));
        
        
        
        return carta.get(id);
    }
    
}
