package tugas2bab8que;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Author Satria
public class Tugas2Bab8Que {

    public static void main(String[] args) {
        int pilih, nilai;
        Scanner sc = new Scanner(System.in);
        Queue<Integer> ganjil = new LinkedList<>();
        Queue<Integer> genap  = new LinkedList<>();

    do{
       //Displaying Menu
        System.out.println("Kelompok 9 Tugas Bab 8 Number 2");
        System.out.println("1. Masukan Angka");
        System.out.println("2. Dequeue Ganjil");
        System.out.println("3. Dequeue Genap");
        System.out.println("4. Daftar Angka Ganjil");
        System.out.println("5. Daftar Angka Genap");
        System.out.println("6. Keluar");
        System.out.print("Masukkan Pilihan : ");
        pilih = sc.nextInt();
    //condition for choice
    if(pilih == 1){
    System.out.print("Masukan Angka : ");
    nilai = sc.nextInt();
        if(ganjil.size()<=5&&genap.size()<=5){
            if(nilai % 2 == 1){
                ganjil.add(nilai);
                System.out.println();
            }
            else if(nilai%2==0){
                genap.add(nilai);
                System.out.println();
            }
            else {
                System.out.println("Error");
            }
        }
        else{
            System.out.println("Stack Hanya bisa berisi 5 Elemen saja\n");
        }
    }
    else if(pilih==2){
        ganjil.poll();
        System.out.println("");
    }
    else if(pilih==3){
        ganjil.poll();
        System.out.println("");
    }
    else if(pilih == 4){
        System.out.println(ganjil);
        System.out.println();
    }
    
    else if(pilih == 5){
        System.out.println(genap);
        System.out.println();
    }
    else if(pilih==6){
        System.exit(0);
    }
    else{
        System.out.println("Pilihan Tidak Ada!!");
    }//end of condition
    } 
    while(pilih!=6);//end looping
    }
}