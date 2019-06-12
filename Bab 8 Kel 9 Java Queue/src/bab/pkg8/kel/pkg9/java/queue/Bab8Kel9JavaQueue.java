package bab.pkg8.kel.pkg9.java.queue;
//Class queue :
import java.util.Arrays; //ada 4 library
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner; //buat baca inputan

public class Bab8Kel9JavaQueue {

    public static void main(String[] args) {
        int pilihan;
        int data;
        Queue<Integer> antrian = new LinkedList<Integer>(); //queue tipe data. nama var= new nama var lalu tipe data
    //looping until false condition
    do{
        //Displaying Menu
        System.out.println ("---Ini Queue---");
        System.out.println("1. Enqueue Item");
        System.out.println("2. Dequeue Item");
        System.out.println("3. Lihat Daftar Data");
        System.out.println("4. Lihat Data Teratas");
        System.out.println("0. Keluar");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Pilihan : ");
        pilihan = input.nextInt(); //jika inputan dalam bentuk angka = input.nextInt
        //condition for choice
        if(pilihan==1){
            System.out.print("Data yang ditambahkan : ");
            data = input.nextInt();
            antrian.add(data); //add menambah data, enqueue
            System.out.println("");
        }
        else if(pilihan==2){
            antrian.poll(); 
            System.out.println("");
        }
        else if(pilihan==3){
            System.out.println(antrian+ " ");
            System.out.println("");
        }
        else if(pilihan==4){
            System.out.println("Data teratas : "+ antrian.peek()); //menampilkan yg pertama karena library queue
            System.out.println("");
        }
        else if(pilihan==0){
            System.exit(0);
        }
        else{
            System.out.println("Pilihan Tidak Ada!!");
            System.out.println("");
        }//end of condition
    } while(pilihan!=0);//end looping
    }
}

        // TODO code application logic here

