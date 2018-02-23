
package practicanomina;


public class JDialogDory extends javax.swing.JDialog {
 Validar validacion=new Validar();
    
   private FrameCharly padre=(FrameCharly)this.getParent();
  public JDialogDory(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        validacion.soloNumeros(jTxtFSueldo);
        validacion.soloLetras(jTxtFNombre);
        validacion.soloLetras(jTxtFPuesto);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblName = new javax.swing.JLabel();
        jLblPuesto = new javax.swing.JLabel();
        jLblSueldo = new javax.swing.JLabel();
        jTxtFNombre = new javax.swing.JTextField();
        jTxtFPuesto = new javax.swing.JTextField();
        jTxtFSueldo = new javax.swing.JTextField();
        jBtnAñadir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLblName.setFont(new java.awt.Font("AR BONNIE", 1, 36)); // NOI18N
        jLblName.setText("Nombre");
        getContentPane().add(jLblName);
        jLblName.setBounds(110, 90, 110, 70);

        jLblPuesto.setFont(new java.awt.Font("AR BONNIE", 1, 36)); // NOI18N
        jLblPuesto.setText("Puesto");
        getContentPane().add(jLblPuesto);
        jLblPuesto.setBounds(110, 190, 110, 40);

        jLblSueldo.setFont(new java.awt.Font("AR BONNIE", 1, 36)); // NOI18N
        jLblSueldo.setText("sueldo");
        getContentPane().add(jLblSueldo);
        jLblSueldo.setBounds(110, 290, 100, 50);

        jTxtFNombre.setFont(new java.awt.Font("AR BONNIE", 1, 18)); // NOI18N
        getContentPane().add(jTxtFNombre);
        jTxtFNombre.setBounds(260, 100, 330, 50);

        jTxtFPuesto.setFont(new java.awt.Font("AR BONNIE", 1, 18)); // NOI18N
        getContentPane().add(jTxtFPuesto);
        jTxtFPuesto.setBounds(260, 190, 320, 50);

        jTxtFSueldo.setFont(new java.awt.Font("AR BONNIE", 1, 18)); // NOI18N
        getContentPane().add(jTxtFSueldo);
        jTxtFSueldo.setBounds(260, 290, 310, 50);

        jBtnAñadir.setFont(new java.awt.Font("AR BONNIE", 1, 36)); // NOI18N
        jBtnAñadir.setForeground(new java.awt.Color(153, 0, 51));
        jBtnAñadir.setText("agregar");
        jBtnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAñadirActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnAñadir);
        jBtnAñadir.setBounds(90, 410, 160, 70);

        jButton1.setFont(new java.awt.Font("AR BONNIE", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 51));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 410, 150, 70);

        jLblImagen.setFont(new java.awt.Font("AR BONNIE", 1, 24)); // NOI18N
        jLblImagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\cecil\\Desktop\\br.jpg")); // NOI18N
        getContentPane().add(jLblImagen);
        jLblImagen.setBounds(0, 0, 720, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAñadirActionPerformed
        if(jTxtFNombre.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null,"Se necesita ingresar nombre");
        }
        else if(jTxtFPuesto.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null,"Se necesita ingresar puesto");
        }
        else if(jTxtFSueldo.getText().equals("") || jTxtFSueldo.getText().equals(".")){
            javax.swing.JOptionPane.showMessageDialog(null,"Se necesita ingresar sueldo");
        }
        else{
            arbolito thor =new arbolito(jTxtFNombre.getText(),jTxtFPuesto.getText(),Double.parseDouble(jTxtFSueldo.getText()));
            this.setVisible(false);
            padre.setVisible(true);
            padre.agregarEmpleado(thor);
                }
    }//GEN-LAST:event_jBtnAñadirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(-1);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogDory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogDory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogDory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogDory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogDory dialog = new JDialogDory(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAñadir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLblImagen;
    private javax.swing.JLabel jLblName;
    private javax.swing.JLabel jLblPuesto;
    private javax.swing.JLabel jLblSueldo;
    private javax.swing.JTextField jTxtFNombre;
    private javax.swing.JTextField jTxtFPuesto;
    private javax.swing.JTextField jTxtFSueldo;
    // End of variables declaration//GEN-END:variables
}
