package com.mycompany.sistema.roles.persistencia;

import com.mycompany.sistema.roles.logica.Usuario;
import java.util.List;

public class ControladoraPersistencia {
    
    
    UsuarioJpaController controlUsuario = new UsuarioJpaController();
    
    
    public List<Usuario> getUsuarios(){
        return controlUsuario.findUsuarioEntities();
    }
}
