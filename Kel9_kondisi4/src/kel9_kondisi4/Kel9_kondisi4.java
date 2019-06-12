/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kel9_kondisi4;

/**
 *
 * @author User
 */

import java.util.Scanner;
public class Kel9_kondisi4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Masukkan angka 1 - 2 yang diinginkan = ");
        int angka = sc.nextInt();
        switch(angka){
        case(1):System.out.println("nilai dari angka adalah 1");break;
        case(2):System.out.println("nilai dari angka adalah 2");break;
        default:System.out.println("angka tak bernilai 1 ataupun 2");break;
        }
        System.out.println("Program Selesai");
    }
}

