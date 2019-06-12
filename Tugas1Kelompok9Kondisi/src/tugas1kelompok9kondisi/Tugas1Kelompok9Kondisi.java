package tugas1kelompok9kondisi;
import java.util.Scanner;

public class Tugas1Kelompok9Kondisi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kelompok 9");
        System.out.println("Kornelius Satria Budiyanto 21120116120007");
        System.out.println("Hasyim Dahlan Attaufiqi 21120116120013");
        
        System.out.print("Masukkan angka pertama = ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka kedua= ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Jumlah nilai yang anda masukkan = "+ c);
        
        if (c >= 80){
            System.out.println("Nilai anda A");
        }
        else {
            System.out.println("Belajar lagi ya");
        }
    }
}
