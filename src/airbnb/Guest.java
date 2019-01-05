/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and  open the template in the editor.
 */
package airbnb;

import java.text.ParseException;
import java.text.SimpleDateFormat;   // para fazer a data do regito da viatura
import java.util.List;
import java.util.Date;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author USER
 */
public class Guest extends People {

    public Guest(String name, String address, int fiscal_number, String birthdate) {
        super(name, address, fiscal_number, birthdate);
    }


    

    
// verificar se tem mais de 18 anos se não dizer que não pode arrendar
// verificar se não foi posta uma data futura por erro.     
    
 public int getAge(Date dateOfBirth) {
    int age = 0;
    Calendar born = Calendar.getInstance();
    Calendar now = Calendar.getInstance();
    if(dateOfBirth!= null) {
        now.setTime(new Date());
        born.setTime(dateOfBirth);  
        if(born.after(now)) {
            throw new IllegalArgumentException("Can't be born in the future");
        }
        age = now.get(Calendar.YEAR) - born.get(Calendar.YEAR);             
        if(now.get(Calendar.DAY_OF_YEAR) < born.get(Calendar.DAY_OF_YEAR))  {
            age-=1;
        }
    }  
    return age;

//Modificado

    
    
   
}
}

