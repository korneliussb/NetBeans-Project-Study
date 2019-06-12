package tugas1bab5kel9prima;
import java.util.Scanner;

public class Tugas1Bab5Kel9Prima {
  static void prima(int batas){ //parameter,batas itu inputan
    boolean prima;
    int jumlah, i;
    
    jumlah = 1;//1 agar angka 1 tidak di print
    i = 2;
    
    while(jumlah <= batas){
      prima = true;
      for(int x = 2; x < i; x++){
        if(i % x == 0){
          prima = false;
        }
      }
      
      if(prima == true){
        System.out.print(i + " ");
        jumlah++;
      }
      
      i++;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan banyak bilangan prima : ");
    int batas = sc.nextInt();
    
    prima(batas); //argumen
  }
}