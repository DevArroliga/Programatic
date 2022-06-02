/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programatic;

import Forms.Menu;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Josar
 */
public class Programatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (JOptionPane.showConfirmDialog(null, "¿Primera vez usando Programatic?", "¡Bienvenido!",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (JOptionPane.showConfirmDialog(null, "¿Desea comenzar repasando las lecciones de cada tema?", "Lecciones",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    File file = new File("Lessons\\IntroduccionBasica.html");
                    Desktop.getDesktop().open(file);
                } catch (IOException ex) {
                }
            } else {
                JOptionPane.showMessageDialog(null, "Dirigiéndose al menú principal");
                Menu menu = new Menu();
                menu.setVisible(true);   
            }
        } else {
            Menu menu = new Menu();
            menu.setVisible(true);
        }
    }
    
}
