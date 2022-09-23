
package Receiver;

import AbstractProductB.BrokerBazePodataka;
import Client.Kontroler;


public class ObrisiDomenskiObjekat {
    Kontroler kon;
    
    
    public ObrisiDomenskiObjekat(Kontroler kon1){kon=kon1;} 
    
    public boolean obrisiDomenskiObjekat(){
     kon.napuniDomenskiObjekatIzGrafickogObjekta();
     kon.getBrokerBazePodataka().makeConnection();
     boolean signal = kon.getBrokerBazePodataka().deleteRecord(kon.getDomenskiObjekat());
     if (signal==true) 
        { kon.getBrokerBazePodataka().commitTransation();
          kon.setPoruka("Систем je oбрисао поруџбину."); // Promenljivo!!!
          kon.isprazniGrafickiObjekat();
        }
     else
        { kon.getBrokerBazePodataka().rollbackTransation();
          kon.setPoruka("Систем не може да обрише поруџбину."); // Promenljivo!!!
        }
     kon.prikaziPoruku();
    kon.getBrokerBazePodataka().closeConnection();
    return signal;   
  }   
}
