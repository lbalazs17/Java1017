/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1017;
import java.util.Scanner;

/**
 *
 * @author user11
 */
public class J1017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Kérem a vezetéknevet: ");
       String vezeteknev = sc.nextLine();
       
       System.out.println("Kérem a keresztnevedet: ");
       String keresztnev = sc.nextLine();
       
       System.out.println("Kérem a gyermekek számát: ");
       int gyerekszam = Integer.parseInt(sc.nextLine());
       
       System.out.println("Kérem az életkorod: ");
       int eletkor = Integer.parseInt(sc.nextLine());
       
       Dolgozo_oszt d = new Dolgozo_oszt(vezeteknev,keresztnev,gyerekszam,eletkor);
       System.out.println(vezeteknev + " " + keresztnev);
       System.out.println("Családi pótlék: " + d.cspotlek());
       System.out.println("Ennyi időd van még nyugdíjig: " + d.nyug());
      
    }
    
    
}
