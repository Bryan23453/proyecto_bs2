/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_estru_2;

import java.awt.Label;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author bryan
 */

public class Cambio_Menu extends Thread {
    JPanel panel;
    JPanel panel2;
    
    public Cambio_Menu(JPanel pane,JPanel pane4){
        panel=pane;
        panel2=pane4;
        
    }

   
    
    public void run () {
                int w=1230;
                    panel.setLocation(w, 0);
                    panel2.setLocation(w, 0);
                    while (w>88){
                    try {
                            Thread.sleep(1);
                            panel.setLocation(w,0);
                            w=w-3;
                        } catch (InterruptedException ex) {}    
                    }
    }
    
}


