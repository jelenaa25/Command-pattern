
package ConcreteCommand;

import Command.SistemskaOperacija;
import Receiver.ObrisiDomenskiObjekat;



  public class SOObrisi implements  SistemskaOperacija// ConcreteCommand
{   ObrisiDomenskiObjekat odo;
 
    public SOObrisi(ObrisiDomenskiObjekat odo1) 
      {odo=odo1;}
    
       
    @Override // execute(){receiver.action()}
    public void izvrsiSO()
    {odo.obrisiDomenskiObjekat();}
}  
