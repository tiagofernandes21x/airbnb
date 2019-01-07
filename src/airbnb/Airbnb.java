
package airbnb;

import java.util.ArrayList;
import java.util.List;

public class Airbnb {
    
    public static void main(String[] args) {
       
        ArrayList<Employees> empregados = new ArrayList<Employees>();      
               
        empregados.add(new Employees("Tiago", "Rua de marte", 24587309, "10-10-1990"));
        empregados.add(new Employees("Gilmar", "Rua de jupiter", 325987201, "09-09-1989"));
        empregados.add(new Employees("Jailson", "Rua de Urano", 324874082, "02-01-1968"));
        empregados.add(new Employees("Joana", "Rua da Guine", 38740224, "06-09-1990"));
        empregados.add(new Employees("Nuno", "Praceta das flores", 88733324, "11-09-1994"));
        empregados.add(new Employees("Maria", "Rua das violetas", 324993729, "22-09-1970"));
        
        for(int i =0; i < empregados.size(); i++ ){
            
           System.out.println(empregados.get(i).name);
            
        }
        
        
        
        ArrayList<Viatura> carros = new ArrayList<Viatura>();
        
        carros.add(new Viatura("30-bc-10", "Audi", "Benz,", empregados.get(0)));
        carros.add(new Viatura("40-cc-30", "Lexus", "JAL", empregados.get(1)));
        carros.add(new Viatura("17-xa-34", "Mercedes", "CLA", empregados.get(2)));
        carros.add(new Viatura("30-bc-10", "Audi", "Benz", empregados.get(3)));
        carros.add(new Viatura("30-45-12", "Fiat", "Punto", empregados.get(4)));
        
        System.out.println(carros.get(0).getEmploye().name);
            
        for(int i =0; i < carros.size(); i++ ){
            
           System.out.println(carros.get(i).getModel().equals("Mercedes"));
            
        }
        
       
        
        
        
        
        
        
        
    }
    
}
