
package Receiver;

import Client.Kontroler;

 public class ZapamtiDomenskiObjekat { // Receiver
    
    Kontroler kon;
    
    
    public ZapamtiDomenskiObjekat(Kontroler kon1){kon=kon1;} 
     
    public boolean zapamtiDomenskiObjekat(){
    kon.napuniDomenskiObjekatIzGrafickogObjekta();
    kon.getBrokerBazePodataka().makeConnection();
    boolean signal = kon.getBrokerBazePodataka().insertRecord(kon.getDomenskiObjekat());
    if (signal==true) 
        { kon.getBrokerBazePodataka().commitTransation();
          kon.setPoruka("Систем je запамтио поруџбину."); // Promenljivo!!!
        }
        else
        { kon.getBrokerBazePodataka().rollbackTransation();
          kon.isprazniGrafickiObjekat();
          kon.setPoruka("Систем не може да запамти поруџбину."); // Promenljivo!!!
        }
    kon.prikaziPoruku();
    kon.getBrokerBazePodataka().closeConnection();
    return signal;   
}
    
}
