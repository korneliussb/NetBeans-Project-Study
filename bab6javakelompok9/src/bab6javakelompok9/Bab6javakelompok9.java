package bab6javakelompok9;

import java.util.Calendar;

public class Bab6javakelompok9 {

    public static void main(String[] args) {
       /* mahasiswa arief = new mahasiswa();
        arief.perkenalanDiri();
        System.out.println(arief.katakanIPK(10));
        */
        mahasiswa adi = new mahasiswa("Adi", 212,"Gondang");
        adi.perkenalanDiri();
        
        adi = new mahasiswa("Adi2",212,"Gondang", 1999, 10, 21, 3.99f);
        
        adi.perkenalanDiri();
        System.out.println(adi.tanggalLahir.get(Calendar.MONTH));
        //MONTH agar gk error di import.util.Calendar
        
    }
    
    
}
