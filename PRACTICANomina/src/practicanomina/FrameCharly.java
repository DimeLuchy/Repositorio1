
package practicanomina;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FrameCharly extends javax.swing.JFrame{
 DefaultListModel kesha;
    
    public FrameCharly() {
        initComponents();
        kesha=new DefaultListModel();
        jListRegistros.setModel(kesha);
    }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnAñadirEmpleado = new javax.swing.JButton();
        jBtnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListRegistros = new javax.swing.JList<>();
        jLblRegistro = new javax.swing.JLabel();
        jLblIma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jBtnAñadirEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        jBtnAñadirEmpleado.setFont(new java.awt.Font("AR BONNIE", 1, 36)); // NOI18N
        jBtnAñadirEmpleado.setText("Añadir empleado");
        jBtnAñadirEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAñadirEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnAñadirEmpleado);
        jBtnAñadirEmpleado.setBounds(60, 430, 250, 70);

        jBtnExit.setFont(new java.awt.Font("AR BONNIE", 1, 36)); // NOI18N
        jBtnExit.setText("Salir");
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnExit);
        jBtnExit.setBounds(510, 420, 160, 70);

        jListRegistros.setFont(new java.awt.Font("AR BONNIE", 1, 24)); // NOI18N
        jScrollPane1.setViewportView(jListRegistros);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 80, 620, 310);

        jLblRegistro.setFont(new java.awt.Font("AR BONNIE", 1, 36)); // NOI18N
        jLblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLblRegistro.setText("Registro de empleados");
        getContentPane().add(jLblRegistro);
        jLblRegistro.setBounds(210, 20, 330, 40);

        jLblIma.setBackground(new java.awt.Color(51, 0, 51));
        jLblIma.setIcon(new javax.swing.ImageIcon("C:\\Users\\cecil\\Desktop\\cropped-teclado-de-color-rosado-997260.jpg")); // NOI18N
        getContentPane().add(jLblIma);
        jLblIma.setBounds(0, 0, 720, 532);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAñadirEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAñadirEmpleadoActionPerformed
        JDialogDory window=new JDialogDory(this,true);
        window.setVisible(true);
        
    }//GEN-LAST:event_jBtnAñadirEmpleadoActionPerformed

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
       System.exit(-1);
    }//GEN-LAST:event_jBtnExitActionPerformed
    public void agregarEmpleado(arbolito a){
        kesha.addElement(a);
    }
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
            java.util.logging.Logger.getLogger(FrameCharly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCharly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCharly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCharly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCharly().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAñadirEmpleado;
    private javax.swing.JButton jBtnExit;
    private javax.swing.JLabel jLblIma;
    private javax.swing.JLabel jLblRegistro;
    private javax.swing.JList<String> jListRegistros;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
