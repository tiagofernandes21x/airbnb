/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class Viatura {
    private String plate;   // Matricula
    private String model;    // Modelo
    private String brand;    // Marca
    

  
      
  
    
    //construtor

    public Viatura(String plate, String model, String brand) {
        this.plate = plate;
        this.model = model;
        this.brand = brand;
        
            }
    

    
    
    
    
    
    //encapsulamento

    /**
     * @return the plate
     */
    public String getPlate() {
        return plate;
    }

    /**
     * @param plate the plate to set
     */
    public void setPlate(String plate) {
        this.plate = plate;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

 
    
    
    
 
        
}
    
    
