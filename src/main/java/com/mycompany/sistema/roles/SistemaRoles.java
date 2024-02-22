package com.mycompany.sistema.roles;

import com.mycompany.sistema.roles.gui.Login;
import com.mycompany.sistema.roles.gui.Registrar;
import com.mycompany.sistema.roles.logica.Controladora;
import com.mycompany.sistema.roles.persistencia.ControladoraPersistencia;

public class SistemaRoles {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        ControladoraPersistencia contr = new ControladoraPersistencia();
        
        Registrar registrar = new Registrar();
        
        
        registrar.setVisible(true);
        registrar.setLocationRelativeTo(null);
        
    }
}
