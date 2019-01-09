
package airbnb;

import java.util.ArrayList;
import java.util.List;

public class Airbnb {
    
    public static void main(String[] args) {
       
        ArrayList<Employees> empregados = new ArrayList<>();      
               
        empregados.add(new Employees("Tiago", "Rua de marte", 24587309, "10-10-1990"));
        empregados.add(new Employees("Gilmar", "Rua de jupiter", 325987201, "09-09-1989"));
        empregados.add(new Employees("Jailson", "Rua de Urano", 324874082, "02-01-1968"));
        empregados.add(new Employees("Joana", "Rua da Guine", 38740224, "06-09-1990"));
        empregados.add(new Employees("Nuno", "Praceta das flores", 88733324, "11-09-1994"));
        empregados.add(new Employees("Maria", "Rua das violetas", 324993729, "22-09-1970"));
        
              
        ArrayList<Viatura> carros = new ArrayList<Viatura>();
        
        carros.add(new Viatura("30-bc-10", "Audi", "Benz,"));
        carros.add(new Viatura("40-cc-30", "Lexus", "JAL"));
        carros.add(new Viatura("17-xa-34", "Mercedes", "CLA"));
       
        
        
        ArrayList<ListaCondutores> condutoresDasViatura = new ArrayList<>();
        
        
        
        
        
        
        
        
        
    }
    
}
