/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bacainput_kelompok37;

/**
 *
 * @author User
 */
import java.util.*;  
public class BacaInput_kelompok37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );  
        System.out.print( "Nama: " );  
        String nama = input.next();  
        System.out.print( "Umur: " );  
        int umur = input.nextInt();  
        System.out.println("Hello "+nama);  
        System.out.println("Umur kamu : "+umur);  

    }
    
}
