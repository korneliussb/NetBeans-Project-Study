package tugas1bab8stack;

import java.util.Scanner;
import java.util.Stack;
//author Satria
public class Tugas1Bab8Stack {
    
    public static void main(String[] args) {
        int pilih,nilai;
        Stack ganjil = new Stack();
        Stack genap = new Stack();
        
    //looping until false condition
    do{
       //Displaying Menu
        System.out.println("Kelompok 9 Tugas Bab 8 Number 1");
        System.out.println("1. Masukkan angka ganjil");
        System.out.println("2. Masukkan angka genap");
        System.out.println("3. POP angka ganjil");
        System.out.println("4. POP angka genap");
        System.out.println("5. Daftar Angka Ganjil");
        System.out.println("6. Daftar Angka Genap");
        System.out.println("7. Keluar");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your choice : ");
        pilih = sc.nextInt();
    //condition for choice
    if(pilih == 1){
    System.out.print("Masukkan angka Ganjil : ");
    nilai = sc.nextInt();
    if(ganjil.size()<=5){
    if(nilai % 2 == 1){
      ganjil.push(nilai);
      System.out.println();
    }
    else {
      System.out.println(nilai +" bukan termasuk ganjil\n");
    }
  }
    else{
        System.out.println("Stack Hanya bisa berisi 5 Elemen saja\n");
    }
    }
    else if(pilih==2){
        System.out.print("Masukkan angka Genap : ");
        nilai = sc.nextInt();
        if(genap.size()<=5){
            if(nilai % 2 == 0){
                genap.push(nilai);
                System.out.println();
            }
            else {
                System.out.println(nilai +" bukan termasuk genap\n");
            }
        }
        else{
            System.out.println("Stack Hanya bisa berisi 5 Elemen saja\n");
        }
    }
    else if(pilih==3){
        ganjil.pop();
        System.out.println();
    }
    else if(pilih==4){
        genap.pop();
        System.out.println();
    }
    else if(pilih == 5){
        System.out.println(ganjil);
        System.out.println();
    }
    
    else if(pilih == 6){
    System.out.println(genap);
    System.out.println();
    }
    else if(pilih==7){
        System.exit(0);
    }
    else{
        System.out.println("Pilihan Tidak Ada!!");
    }//end of condition
    } 
    while(pilih!=7);//end looping
    }
}