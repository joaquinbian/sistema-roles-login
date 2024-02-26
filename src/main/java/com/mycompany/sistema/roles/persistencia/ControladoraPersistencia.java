package com.mycompany.sistema.roles.persistencia;

import com.mycompany.sistema.roles.logica.Usuario;
import com.mycompany.sistema.roles.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    
    UsuarioJpaController controlUsuario = new UsuarioJpaController();
    
    
    public List<Usuario> getUsuarios(){
        return controlUsuario.findUsuarioEntities();
    }
    
    public void crearUsuario(Usuario usuario){
        controlUsuario.create(usuario);
    }
    
    public Usuario getUsuario(int id){
        return controlUsuario.findUsuario(id);
    }
    
    public void editarUsuario(Usuario usuario){
        try {
            controlUsuario.edit(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarUsuario(int id){
        try {
            controlUsuario.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
