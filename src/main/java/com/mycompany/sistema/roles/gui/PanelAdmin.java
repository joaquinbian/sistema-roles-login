package com.mycompany.sistema.roles.gui;

import com.mycompany.sistema.roles.logica.Controladora;
import com.mycompany.sistema.roles.logica.Role;
import com.mycompany.sistema.roles.logica.Usuario;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PanelAdmin extends javax.swing.JFrame {

    Controladora controladora = null;
    private int selected_user_id;
    
    
    public PanelAdmin(int user_id) {
        controladora = new Controladora();
        this.selected_user_id = user_id;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        salirBtn = new javax.swing.JButton();
        cargarUsuarioBtn = new javax.swing.JButton();
        editUsuarioBtn = new javax.swing.JButton();
        deleteUsuarioBtn = new javax.swing.JButton();
        userNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("PANEL ADMINISTRADOR");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(usersTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        salirBtn.setText("Salir");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        cargarUsuarioBtn.setText("Cargar Usuario");
        cargarUsuarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarUsuarioBtnActionPerformed(evt);
            }
        });

        editUsuarioBtn.setText("Editar Usuario");
        editUsuarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUsuarioBtnActionPerformed(evt);
            }
        });

        deleteUsuarioBtn.setText("Eliminar Usuario");
        deleteUsuarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUsuarioBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cargarUsuarioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editUsuarioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteUsuarioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(salirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(cargarUsuarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(editUsuarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteUsuarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarUsuarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarUsuarioBtnActionPerformed
        // TODO add your handling code here:
        
        CargarUsuario cargarUsuario = new CargarUsuario();
        cargarUsuario.setVisible(true);
        cargarUsuario.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_cargarUsuarioBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        //aca hay que cargar la tabla de usuarios...
        cargarTabla();
        getUserSelected();
    }//GEN-LAST:event_formWindowOpened

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_salirBtnActionPerformed

    private void editUsuarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUsuarioBtnActionPerformed
        // TODO add your handling code here:
        
        if(usersTable.getRowCount() > 0){
            if(usersTable.getSelectedRow() != -1){
                
                //obtener el id del usuario seleccionado
                //pasarlo a la pantalla de editar para que lo busque
                
                int user_id = Integer.parseInt(String.valueOf(usersTable.getValueAt(usersTable.getSelectedRow(), 0)));
                
                EditarUsuario editarUsuario = new EditarUsuario(user_id);
                editarUsuario.setVisible(true);
                editarUsuario.setLocationRelativeTo(null);
                
                this.dispose();
                
                
                
            } else {
                mostrarMensaje("No has seleccionado ningun usuario", "Error");
            }
        } else {
            mostrarMensaje("La tabla esta vacia", "Error");
        }
    }//GEN-LAST:event_editUsuarioBtnActionPerformed

    private void deleteUsuarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUsuarioBtnActionPerformed
        // TODO add your handling code here:
        
        if(usersTable.getRowCount() > 0){
            if(usersTable.getSelectedRow() != -1){
                int user_id = Integer.parseInt(String.valueOf(usersTable.getValueAt(usersTable.getSelectedRow(), 0)));
                
                controladora.eliminarUsuario(user_id);
                mostrarMensaje("Usuario eliminado con exito", "Eliminar usuario");
                
                cargarTabla();
                
            } else {
                mostrarMensaje("No has seleccionado ningun usuario", "Error");
            }
        } else {
            mostrarMensaje("La tabla esta vacia", "Error");
        }
    }//GEN-LAST:event_deleteUsuarioBtnActionPerformed

    private void mostrarMensaje(String mensaje, String titulo){
        JOptionPane jOptionPane = new JOptionPane(mensaje);
         jOptionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
         JDialog dialog = jOptionPane.createDialog(titulo);
         dialog.setAlwaysOnTop(true);
         dialog.setVisible(true);
    }

    
    private void cargarTabla(){
        //definir el modelo de la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            //fila y columna no son editables
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        
        String[] titulos = {"Id", "Nombre", "Rol"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //luego aca hay que llamar al controlador para obtener a los usuarios...
        List<Usuario> usuarios = controladora.getUsuarios();
        
        for(Usuario usuario : usuarios){
            String userRol = usuario.getRole() == Role.ADMIN ? "Admin" : "Usuario";
            
            Object[] usuarioRow = {
                usuario.getId(),
                usuario.getName(),
                userRol
            };
            
            modeloTabla.addRow(usuarioRow);
        }
        
        usersTable.setModel(modeloTabla);
    }
    
    
    private void getUserSelected(){
        Usuario usuario = controladora.getUsuario(this.selected_user_id);
        
        userNameLabel.setText(usuario.getName());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargarUsuarioBtn;
    private javax.swing.JButton deleteUsuarioBtn;
    private javax.swing.JButton editUsuarioBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salirBtn;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
