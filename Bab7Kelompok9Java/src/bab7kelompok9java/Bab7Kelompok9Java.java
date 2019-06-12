package bab7kelompok9java;

public class Bab7Kelompok9Java {

    public static void main(String[] args) {
        //membuat objek mobil
        kelompok9_setter_getter mobil_baru = new kelompok9_setter_getter(); //obj mobil baru
        //mengatur nilai atribut
        mobil_baru.setMerk("Mitsubishi"); //atribut setMerk itu mistsu mirage, objek-mobil_baru
        mobil_baru.setTipe("Mirage");
        mobil_baru.setWarna("merah");
        mobil_baru.setJenisBBM("Pertamax");
        
        //mencetak nilai
        System.out.print("Saya punya mobil dengan merk " + mobil_baru.getMerk()); //get untuk mengambil tipe data yang di atas
        System.out.print(" tipe "+ mobil_baru.getTipe());
        System.out.print(" berwarna "+ mobil_baru.getWarna()+".");
        System.out.println(" Mobil saya menggunakan bensin berjenis "+ mobil_baru.getJenisBBM());
    }
}