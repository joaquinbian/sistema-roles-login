package com.mycompany.sistema.roles.logica;

import com.mycompany.sistema.roles.persistencia.ControladoraPersistencia;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controladora {
    
    ControladoraPersistencia controlPersist = new ControladoraPersistencia();
    Password passwordManager = new Password();

    
    public List<Usuario> getUsuarios(){
        return controlPersist.getUsuarios();
    }
    
    
    public void crearUsuario(String name, String passwordToHash){
        Usuario usuario = new Usuario();
        String salt = passwordManager.getHash();
        String password = passwordManager.generatePassword(passwordToHash, salt); 
        
        usuario.setName(name);
        usuario.setPassword(password);
        usuario.setSalt(salt);
        controlPersist.crearUsuario(usuario);
    }
    
    
    public boolean comparePasswords(String password, String salt, String hashedPassword){
        return passwordManager.comparePasswords(password, salt, hashedPassword);
    }
}
