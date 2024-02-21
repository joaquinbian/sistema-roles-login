package com.mycompany.sistema.roles.logica;

import com.mycompany.sistema.roles.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersist = new ControladoraPersistencia();
    
    
    public List<Usuario> getUsuarios(){
        return controlPersist.getUsuarios();
    }
}
