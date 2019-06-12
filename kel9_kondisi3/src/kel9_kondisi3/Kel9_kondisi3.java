/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kel9_kondisi3;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Kel9_kondisi3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Masukkan angka yang diinginkan = ");
        int angka = sc.nextInt();
        if(angka == 20){
            System.out.println("Angka yang dimasukkan 20");
        }
        else if (angka > 20 && angka <= 100){
            System.out.println("Angka lebih dari 20 dan kurang dari 100");
        }
        else if (angka < 20){
        System.out.println("angka kurang dari 20");
        }
        else{
        System.out.println("Angka sangat besar");
        }
        System.out.println("Program Selesai");
    }
}