package bab6javakelompok9;

import java.util.Calendar; //menginput kelas calender ke folder java, sub kelasnya util, memanggil kelas yg diluar kelasnya sendiri

public class mahasiswa {
    private String nama; //string =null
    public int nim; //==0
    private String alamat; //null
    public Calendar tanggalLahir = Calendar.getInstance(); //null
    private float IPK; //0.0
    
    
    public mahasiswa() //dibuat default constructor
    {
        
    }
    
    public mahasiswa(String nama,int nim, String alamat)//bukan default constructor ber argumen
    {
        this.nama=nama; //this mereferensikan/menunjukkan variabel kelas
        this.nim=nim;
        this.alamat=alamat;
        
    }
    
     public mahasiswa(String nama, Integer NIM, String alamat, int tahun, int bulan, int tanggal, float IPK) //Overloading Constructor
    {
        this.nama = nama;
        this.nim = NIM;
        this.alamat = alamat;
        tanggalLahir.set(tahun, bulan, tanggal);
        this.IPK = IPK;
    }
    
    public void perkenalanDiri()
    {
        System.out.println("Perkenalkan nama saya "+nama+" nim saya "+nim);
    }
 
    public String katakanIPK(int nomorRahasia)
    {
       if (nomorRahasia == tanggalLahir.get(Calendar.MONTH)) {
        return "IPK saya "+ IPK;
    
       }
       else {
        return "IPK saya tidak boleh di beritahu ke orang lain";
       }
    }

        public void setAlamat(String alamatBaru){
        this.alamat = alamatBaru;
    }
    
   public String getAlamat(){
       return this.alamat;
   }
}