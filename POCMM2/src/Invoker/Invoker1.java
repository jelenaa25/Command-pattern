
package Invoker;


import Command.SistemskaOperacija;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;



public class Invoker1 { // Invoker
   
    public Invoker1(SistemskaOperacija so,JTextField polje){
    {
      polje.addFocusListener(new OsluskivacPolje(so)); 
    }
}}

class OsluskivacPolje implements FocusListener
{    SistemskaOperacija so;
 
    OsluskivacPolje(SistemskaOperacija so1) {so = so1;}
    

    public void focusLost(java.awt.event.FocusEvent e) {
                so.izvrsiSO();
        
    }

    @Override
    public void focusGained(FocusEvent e) {
        
    }
}

