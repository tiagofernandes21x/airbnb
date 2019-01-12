/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airbnb;

import java.time.LocalDate;
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
public class CalculateAge {

    
    public void CalculateAge() {
        // setup
        LocalDate birthDate = LocalDate.of(1961, 5, 17);
        // exercise
        int actual = AgeCalculator.calculateAge(birthDate, LocalDate.of(2016, 7, 12));
        // assert
        Assert.assertEquals(55, actual);
    }
    
    
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
}   
    
    
    
    
    
}    
    
}
