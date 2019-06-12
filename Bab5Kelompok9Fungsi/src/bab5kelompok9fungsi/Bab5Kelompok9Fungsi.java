package bab5kelompok9fungsi;

public class Bab5Kelompok9Fungsi {

    public static void main(String[] args) {
        cetak();
        cetak2(4,5);
        System.out.println(penjumlahan()); //biar cpt, pake sout+tab
        System.out.println(perkalian(4.5f,5));
        
    }
    public static void cetak(){
        System.out.println("Selamat datang di praktikum modul 4");
    }
   //fungsi non return tanpa parameter,tipe data harus void
    
    public static void cetak2(int a, int b){
        System.out.println(a+b);
    }
    //fungsi return type taanpa parameter
    
    public static int penjumlahan(){
        int a = 12;
        int b = 26;
        return a + b;
        //kalo diganti string, return "0", kalo int-return 0;
    }
    
    public static float perkalian(float a, float b){
        return a * b;
    }
    //function perkalian return type dgn parameter
}
