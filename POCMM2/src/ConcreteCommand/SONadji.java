
package ConcreteCommand;

import Command.SistemskaOperacija;
import Receiver.NadjiDomenskiObjekat;



  public class SONadji implements  SistemskaOperacija// ConcreteCommand
{   NadjiDomenskiObjekat ndo;
 
    public SONadji(NadjiDomenskiObjekat ndo1) 
      {ndo=ndo1;}
    
       
    @Override // execute(){receiver.action()}
    public void izvrsiSO()
    {ndo.nadjiDomenskiObjekat();}
}  
