
package Receiver;


import Client.Kontroler;
import DomainClasses.DKPorudzbina;

 public class NadjiDomenskiObjekat { // Receiver
    
   Kontroler kon;
    
    
    public NadjiDomenskiObjekat(Kontroler kon1){kon=kon1;} 
     
    public boolean nadjiDomenskiObjekat(){
    kon.napuniDomenskiObjekatIzGrafickogObjekta();
    boolean signal;
    kon.getBrokerBazePodataka().makeConnection();
    DKPorudzbina ip = (DKPorudzbina)kon.getBrokerBazePodataka().findRecord(kon.getDomenskiObjekat()); // Promenljivo!!!
    if (ip != null) 
        { kon.napuniGrafickiObjekatIzDomenskogObjekta(ip);
          kon.setPoruka("Систем je нашао поруџбину."); // Promenljivo!!!
          signal = true;
        }
        else
        { kon.isprazniGrafickiObjekat();
          kon.setPoruka("Систем не може да нађе поруџбину."); // Promenljivo!!!
          signal = false;
        }
    kon.prikaziPoruku();
    kon.getBrokerBazePodataka().closeConnection();
    return signal;  
}
    
}
