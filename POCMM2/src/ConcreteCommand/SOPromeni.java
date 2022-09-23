
package ConcreteCommand;

import Command.SistemskaOperacija;
import Receiver.PromeniDomenskiObjekat;



  public class SOPromeni implements  SistemskaOperacija// ConcreteCommand
{   PromeniDomenskiObjekat pdo;
 
    public SOPromeni(PromeniDomenskiObjekat pdo1) 
      {pdo=pdo1;}
    
       
    @Override // execute(){receiver.action()}
    public void izvrsiSO()
    {pdo.promeniDomenskiObjekat();}
}  
