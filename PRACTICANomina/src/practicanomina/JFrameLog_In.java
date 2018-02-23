
package practicanomina;

public class JFrameLog_In extends javax.swing.JFrame {
      int a=0,b=0;
      Validar validacion=new Validar();
     
    
    public JFrameLog_In() {
        initComponents();
        validacion.soloLetras(jTxtFUsuario);
        
    
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtFUsuario = new javax.swing.JTextField();
        jPswFContra = new javax.swing.JPasswordField();
        jLblcontra = new javax.swing.JLabel();
        jLblUsuario = new javax.swing.JLabel();
        jBtnAcceder = new javax.swing.JButton();
        LblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTxtFUsuario.setFont(new java.awt.Font("AR BONNIE", 1, 18)); // NOI18N
        jTxtFUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTxtFUsuarioMouseClicked(evt);
            }
        });
        getContentPane().add(jTxtFUsuario);
        jTxtFUsuario.setBounds(220, 110, 290, 70);

        jPswFContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPswFContraMouseClicked(evt);
            }
        });
        getContentPane().add(jPswFContra);
        jPswFContra.setBounds(220, 290, 280, 70);

        jLblcontra.setFont(new java.awt.Font("AR BONNIE", 1, 48)); // NOI18N
        jLblcontra.setText("Contraseña");
        getContentPane().add(jLblcontra);
        jLblcontra.setBounds(220, 230, 250, 50);

        jLblUsuario.setFont(new java.awt.Font("AR BONNIE", 1, 48)); // NOI18N
        jLblUsuario.setText("Usuario");
        getContentPane().add(jLblUsuario);
        jLblUsuario.setBounds(220, 60, 230, 50);
        jLblUsuario.getAccessibleContext().setAccessibleName("Usuario");

        jBtnAcceder.setBackground(new java.awt.Color(255, 204, 204));
        jBtnAcceder.setFont(new java.awt.Font("AR BONNIE", 1, 48)); // NOI18N
        jBtnAcceder.setText("Acceder");
        jBtnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAccederActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnAcceder);
        jBtnAcceder.setBounds(270, 390, 200, 70);

        LblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\cecil\\Downloads\\20840033_481401898901010_65042788_o.jpg")); // NOI18N
        LblImagen.setText("jLabel1");
        getContentPane().add(LblImagen);
        LblImagen.setBounds(0, 0, 720, 530);
        LblImagen.getAccessibleContext().setAccessibleParent(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAccederActionPerformed
        if(jTxtFUsuario.getText().equalsIgnoreCase("") ||jTxtFUsuario.getText().length()<3 || jTxtFUsuario.getText().equalsIgnoreCase("Usuario")){
            javax.swing.JOptionPane.showMessageDialog(null,"Es necesario introducir un nombre de usuario valido");
        }
        else if(jPswFContra.getText().equalsIgnoreCase("")){
            javax.swing.JOptionPane.showMessageDialog(null,"Contraseña requerida");
        }
        else{
       FrameCharly abrir= new FrameCharly();
        abrir.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_jBtnAccederActionPerformed

    private void jTxtFUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTxtFUsuarioMouseClicked
        if(a==0){
        jTxtFUsuario.setText("");
        a++;}
    }//GEN-LAST:event_jTxtFUsuarioMouseClicked

    private void jPswFContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPswFContraMouseClicked
        if(b==0){
        jPswFContra.setText("");
        b++;
        }
    }//GEN-LAST:event_jPswFContraMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameLog_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLog_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLog_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLog_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLog_In().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblImagen;
    private javax.swing.JButton jBtnAcceder;
    private javax.swing.JLabel jLblUsuario;
    private javax.swing.JLabel jLblcontra;
    private javax.swing.JPasswordField jPswFContra;
    private javax.swing.JTextField jTxtFUsuario;
    // End of variables declaration//GEN-END:variables
}
