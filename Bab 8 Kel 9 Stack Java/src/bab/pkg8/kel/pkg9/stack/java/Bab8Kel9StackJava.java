
package bab.pkg8.kel.pkg9.stack.java;
//Class stack :
import java.util.Scanner;
import java.util.Stack;
/*@author User*/
public class Bab8Kel9StackJava {

    public static void main(String[] args) {
        int pilihan;
        int data;
        Stack result = new Stack(); //result= nama program yg ingin kita buat
    //looping until false condition
    do{
       //Displaying Menu
        System.out.println("---Ini Stack---");
        System.out.println("1. PUSH Item");
        System.out.println("2. POP Item");
        System.out.println("3. Lihat Daftar Data");
        System.out.println("4. Lihat Data Teratas");
        System.out.println("0. Keluar");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Pilihan : ");
        pilihan = input.nextInt();
    //condition for choice
    if(pilihan==1){
        System.out.print("Data yang ditambahkan : ");
        data = input.nextInt();
        result.push(data); //menambah data
        System.out.println("");
    }
    else if(pilihan==2){
        result.pop(); //mengurangi data
        System.out.println("");
    }
    else if(pilihan==3){
        System.out.print(result + " "); //plus untuk memanggil dan untuk spasi
        System.out.println("");
    }
    else if(pilihan==4){
        System.out.println("Data teratas : "+result.peek()); //peek=data yg barusan dimasukkan atau terakhir
        System.out.println("");  
    }
    else if(pilihan==0){
        System.exit(0);
    }
    else{
        System.out.println("Pilihan Tidak Ada!!");
    }//end of condition
    } 
    while(pilihan!=0);//end looping biar gk loop terus ! artinya not

        // TODO code application logic here
    }
}
