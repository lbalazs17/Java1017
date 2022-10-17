/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1017;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author user11
 */
public class Dolgozo_oszt {
    //Encapsulation az osztály saját adatain dolgozik,és ez nem érhető el 
    //csak az osztályon belül.
    //privateként csak megfelelő metódusok (public)metóduson keresztül érjük el.
    
    private String vezeteknev;
    private String keresztnev;
    private int gyerekszam;
    private int kor;
    private final int korhatar = 63;

    public Dolgozo_oszt(String vezeteknev, String keresztnev, int gyerekszam, int kor) {
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
        this.gyerekszam = gyerekszam;
        this.kor = kor;
    }
    
    public int cspotlek()
    {
        int potlek = 0;
        switch (gyerekszam)
        {
            case 0:
                potlek = 0;
                break;
                
            case 1: 
                potlek = 12200;
                break;
                
            case 2:
                potlek = 2*13400;
                break;
            default:
                potlek = 16000*gyerekszam;
        }
            return potlek;
       
    }
    
        public int nyug()
        {
        return kor - korhatar;
        
        
        }
    
    
    
    
}
