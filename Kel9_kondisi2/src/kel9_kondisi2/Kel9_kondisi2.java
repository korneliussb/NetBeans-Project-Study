/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kel9_kondisi2;

import java.util.Scanner;

public class Kel9_kondisi2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Masukkan angka yang diinginkan = ");
        int angka = sc.nextInt();
        if(angka >= 20){
            System.out.println("Angka 20 atau lebih besar dari 20 yaitu " +angka);
        }
        else{
        System.out.println("Angka kurang dari 20 yaitu "+angka);
        }
        System.out.println("Program Selesai");
    }
    
}