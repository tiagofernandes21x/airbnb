/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airbnb;

import java.text.ParseException;
import java.text.SimpleDateFormat;   // para fazer a data do regito da viatura
import java.time.LocalDate;      //Saber a data Actual
import java.util.List;
import java.util.Date;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author USER
 */
public abstract class People {
    String name;
    private String address; 
    private int fiscal_number; 
    private String birthdate; 

 
// Construtor

    public People(String name, String address, int fiscal_number, String birthdate) {
        this.name = name;
        this.address = address;
        this.fiscal_number = fiscal_number;
        this.birthdate = birthdate;
        //try {
            //this.birthdate = new SimpleDateFormat("dd/MM/yyyy").parse(birthdate);
       //} catch (ParseException ex) {
            //Logger.getLogger(People.class.getName()).log(Level.SEVERE, null, ex);
        //}
    }
  
    

    
    
    
}
