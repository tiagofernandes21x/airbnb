/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airbnb;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Reserve {
    private Properties propertie; 
    private Guest guest; 
    private Date dateInicial; 
    private Date dateFinal; 
    private Properties dailycost; 
    

    public Reserve(Properties propertie, Guest guest, Date dateInicial, Date dateFinal) {
        Date date = new Date();
        //if(strtodate(FormatDateTime(dateFinal - dateInicial, date) > strtodate(FormatDateTime('01/MM/yyy',date) ){
           this.propertie = propertie;
        this.guest = guest;
        this.dateInicial = dateInicial;
        this.dateFinal = dateFinal; 
        //}
        
    }
    
    
    
    
}
