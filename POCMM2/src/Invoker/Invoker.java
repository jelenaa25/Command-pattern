
package Invoker;

import Client.Kontroler;
import Command.SistemskaOperacija;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;



public class Invoker { // Invoker
   
    public Invoker(SistemskaOperacija so,JButton dugme){
       dugme.addActionListener(new OsluskivacDugme(so)); 
    }
}

class OsluskivacDugme implements ActionListener
{   SistemskaOperacija so;
 
    OsluskivacDugme(SistemskaOperacija so1) {so = so1;}
    
    @Override
    public void actionPerformed(ActionEvent e) {
         so.izvrsiSO();
    }
}

