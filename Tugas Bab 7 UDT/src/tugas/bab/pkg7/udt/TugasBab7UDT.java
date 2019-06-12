package tugas.bab.pkg7.udt;
//Author Satria
public class TugasBab7UDT {

    public static void main(String[] args) {
        System.out.println(" KELOMPOK 9\n");
        //membuat objek mobil
        Mahasiswa maba = new Mahasiswa(); //obj mobil baru
        Mahasiswa maru = new Mahasiswa();
        //mengatur nilai atribut
        maba.setNama("Kornelius Satria Budiyanto"); //atribut setNama itu K, objek-maba
        maba.setNim("21120116120007");
        maba.setAsal("Semarang");
        maba.setJurusan("S1 Sistem Komputer");
        
        maru.setNam("Hasyim Dahlan Attaufiqi"); //atribut setNama itu K, objek-maba
        maru.setNi("21120116120013");
        maru.setAs("Pekalongan");
        maru.setJur("S1 Sistem Komputer");
        
        //mencetak nilai
        System.out.println(" Saya " + maba.getNama()); //get untuk mengambil tipe data yang di atas
        System.out.println(" Nomor NIM "+ maba.getNim());
        System.out.println(" Asal dari "+ maba.getAsal());
        System.out.println(" Kuliah di jurusan "+ maba.getJurusan());
        System.out.println();
        
          //mencetak nilai
        System.out.println(" Saya " + maru.getNam()); //get untuk mengambil tipe data yang di atas
        System.out.println(" Nomor NIM "+ maru.getNi());
        System.out.println(" Asal dari "+ maru.getAs());
        System.out.println(" Kuliah di jurusan "+ maru.getJur());
        
    }
    
}
