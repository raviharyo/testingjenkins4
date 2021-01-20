/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squaregit;

import java.util.Scanner;

/**
 *
 * @author ravih
 */
public class Squaregit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);

        int panjang = 5, lebar = 8 , luas;
        
      
        System.out.println("PROGRAM JAVA MENGHITUNG LUAS PERSEGI PANJANG : ");
        System.out.println("-----------------------------------------------");

       
        
        luas=panjang*lebar;

        System.out.println("Luas Persegi Panjang : "+luas);
    }
    
}
