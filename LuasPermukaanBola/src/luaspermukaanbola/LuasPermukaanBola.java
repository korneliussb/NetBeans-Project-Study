package luaspermukaanbola;
import java.util.Scanner;
/*@author Satria
 */
public class LuasPermukaanBola {

    public static void main(String[] args) {
        System.out.println(" Program hitung luas bola"); //4*(22/7)*r*r
        float r;
        
        rumus objek = new rumus();
        Scanner input = new Scanner(System.in);
        System.out.print(" \n Masukan panjang jari-jari bola = ");
        r = input.nextFloat();
        
        System.out.println(objek.LuasPermukaanBola (r));
        
    }
}