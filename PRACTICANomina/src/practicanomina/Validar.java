
package practicanomina;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class Validar {
   
     public void soloLetras(JTextField cam){
        cam.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c=e.getKeyChar();
                if(Character.isDigit(c)){
                    e.consume();
                    JOptionPane.showMessageDialog(null,"Solo se pueden introducir letras");
                }
            }
        });
    }
     
     public void soloNumeros(JTextField cam){
        cam.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                int aux=-1;
                char c=e.getKeyChar();
                if(c=='.'){
                        aux++;
                    }
                if((!Character.isDigit(c) && c!='.')  ||(c=='.'&& cam.getText().contains("."))){
                    e.consume();
                    JOptionPane.showMessageDialog(null,"Solo se pueden introducir numeros");
                    
                }
            }
        });
    }
     
}
