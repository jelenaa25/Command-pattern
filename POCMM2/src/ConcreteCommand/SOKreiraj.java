
package ConcreteCommand;

import Command.SistemskaOperacija;
import Receiver.KreirajDomenskiObjekat;



  public class SOKreiraj implements  SistemskaOperacija// ConcreteCommand
{   KreirajDomenskiObjekat kdo;
 
    public SOKreiraj(KreirajDomenskiObjekat kdo1) 
      {kdo = kdo1;}
    
       
    @Override // execute(){receiver.action()}
    public void izvrsiSO()
    {kdo.kreirajDomenskiObjekat();}
}  
