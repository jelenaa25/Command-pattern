/* Sef.java
 * @autor  prof. dr Sinisa Vlajic,
 * Univerzitet u Beogradu
 * Fakultet organizacionih nauka 
 * Katedra za softversko inzenjerstvo
 * Laboratorija za softversko inzenjerstvo
 * 06.11.2017
 */

package Direktor;

import Builder.*;


public class Sef { // Director
        Projektant proj; // Builder   
        
Sef (Projektant proj1){proj = proj1; }   
public static void main(String args[])  {  
Sef sef;                    
// ConcreteBuilder
Projektant proj = new Projektant1(); // promenljivo!!!
sef = new Sef(proj);
sef.Konstruisi();
}

void Konstruisi()     {   
      proj.kreirajSoftverskiSistem();
      proj.kreirajEkranskuFormu();
      proj.kreirajBrokerBazePodataka();
      proj.kreirajKontroler();
      proj.prikaziEkranskuFormu();
} 
    
}
