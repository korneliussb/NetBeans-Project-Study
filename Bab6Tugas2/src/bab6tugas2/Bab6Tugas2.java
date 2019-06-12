package bab6tugas2;
  import java.util.Scanner;
  import java.util.ArrayList;

/*@author SATRIA*/
public class Bab6Tugas2 {
    
    public static void main(String[] args) {
    boolean lanjut = true;
    int pilih;
    String pilihLanjut;
    
    ArrayList<Mobil> mobilKe = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    Mobil avanza = new Mobil("Toyota", "Avanza", 4, 174, 100, 2755, "Hitam", "Biru");//dibuat objek avanza dari kelas mobil dengan argumen 8
    mobilKe.add(avanza); 

    Mobil xenia = new Mobil("Daihatsu", "Xenia", 4, 150, 80, 2500, "Putih");
    mobilKe.add(xenia);

    while(lanjut == true){
      System.out.println("--- Selamat Datang di Showroom Mobil Kelompok 9 ---");
      System.out.println("---            PILIH LAYANAN ANDA               ---");
      System.out.println("1. Membuat mobil\n2. Hitung Jarak Tempuh\n3. Modifikasi Mesin\n4. Ubah Warna\n5. Keluar");
      System.out.print("Pilih operasi Anda : ");
      pilih = sc.nextInt();

      while(!(pilih >= 1 && pilih <= 6)){ //! di not kan berarti kondisinya false, jadi tidak mengekseskusi dulu, inversnya
        System.out.println("Menu pilihan "+pilih+" tidak ada dalam menu, silahkan pilih kembali");
        System.out.println("1. Membuat mobil\n2. Hitung jarak tempuh\n3. Modifikasi mesin\n4. Ubah warna\n5. Keluar");
        System.out.print("Pilih operasi Anda : ");
        pilih = sc.nextInt(); //untuk menyimpan nilai sementara
      }

      switch(pilih){
        case (1):
          String merk, tipe, warnaDasar, warnaAksen;
          Integer pintu, tenagaKuda;
          float konsumsiBahanBakar, tangki;

          System.out.println("Ini adalah menu Membuat Mobil");
          System.out.println("Pilih jenis pembuatan mobil");
          System.out.println("1. Mobil dengan warna aksen\n2. Mobil tanpa warna aksen");
          pilih = sc.nextInt();

          while(!(pilih >= 1 && pilih <= 2)){
            System.out.println("Menu pilihan "+pilih+" tidak ada dalam menu, silahkan pilih kembali");
            System.out.println("1. Mobil dengan warna aksen\n2. Mobil tanpa warna aksen");
            pilih = sc.nextInt();
          }

          if(pilih == 1){
            System.out.print("Merk : ");
            merk = sc.next();
            System.out.print("Tipe : ");
            tipe = sc.next();
            System.out.print("Jumlah pintu : ");
            pintu = sc.nextInt();
            System.out.print("Tenaga Kuda : ");
            tenagaKuda = sc.nextInt();
            System.out.print("Konsumsi BBM : ");
            konsumsiBahanBakar = sc.nextFloat();
            System.out.print("Besar tangki : ");
            tangki = sc.nextFloat();
            System.out.print("Warna dasar : ");
            warnaDasar = sc.next();
            System.out.print("Warna aksen : ");
            warnaAksen = sc.next();

            Mobil mobilBaruWarnaAksen = new Mobil(merk, tipe, pintu, tenagaKuda, konsumsiBahanBakar, tangki, warnaDasar, warnaAksen);
            mobilKe.add(mobilBaruWarnaAksen); //method khusu dari kelas array list
          }
          else if(pilih == 2){
            System.out.print("Merk : ");
            merk = sc.next();
            System.out.print("Tipe : ");
            tipe = sc.next();
            System.out.print("Jumlah pintu : ");
            pintu = sc.nextInt();
            System.out.print("Tenaga Kuda : ");
            tenagaKuda = sc.nextInt();
            System.out.print("Konsumsi BBM : ");
            konsumsiBahanBakar = sc.nextFloat();
            System.out.print("Besar tangki : ");
            tangki = sc.nextFloat();
            System.out.print("Warna dasar : ");
            warnaDasar = sc.next();

            Mobil mobilBaruWarnaDasar = new Mobil(merk, tipe, pintu, tenagaKuda, konsumsiBahanBakar, tangki, warnaDasar);
            mobilKe.add(mobilBaruWarnaDasar);
          }
          else {
            System.out.println("Input salah");
          }

          //akhir menu 1
          break;

        case (2):
          System.out.println("Ini adalah menu Menghitung Jarak Tempuh");
          System.out.print("Pilih no mobil : ");
          pilih = sc.nextInt();

          Mobil mobil; //tipe data mobil, var mobil
          mobil = mobilKe.get(pilih - 1); //mobil1 mengambil nilai yg ada di array mobilke dengan indeks pilih -1

          System.out.println("Jarak tempuh mobil "+ mobil.tipeMobil +" adalah "+ mobil.hitungJarakTempuh()); //. u/ memanggil/getter

          //akhir menu 2
          break;

        case (3):
          Integer tenagaKudaBaru;
          float besarTangkiBaru;

          System.out.println("Ini adalah menu Modifikasi Mesin");;
          System.out.print("Pilih no mobil : ");;
          pilih = sc.nextInt();

          Mobil mobilModif;
          mobilModif = mobilKe.get(pilih - 1);

          System.out.print("Masukkan tenaga kuda baru : ");
          tenagaKudaBaru = sc.nextInt();
          System.out.print("Mauskkan besar tangki baru : ");
          besarTangkiBaru = sc.nextFloat();

          mobilModif.modifikasiMesin(tenagaKudaBaru, besarTangkiBaru); //method modifikasi Mesin, inputan dari user

          System.out.println("Mobil " + mobilModif.merkMobil + " berhasil dimodifikasi.");

          //akhir menu 3
          break;

        case (4):
          String warnaDasarBaru, warnaAksenBaru;

          System.out.println("Ini adalah menu Ubah Warna");
          System.out.println("Pilih no mobil : ");
          pilih = sc.nextInt();

          Mobil mobilWarnaBaru;
          mobilWarnaBaru = mobilKe.get(pilih - 1);

          System.out.println("Pilih jenis ubah warna\n1. Warna dasar\n2. Warna dasar dan warna aksen");
          System.out.print("Pilih operasi : ");
          pilih = sc.nextInt();

          while(!(pilih >= 1 && pilih <= 2)){
              System.out.println("Pilihan "+pilih+" tidak ada dalam pilihan menu");
              System.out.println("Pilih jenis ubah warna\n1. Warna dasar\n2. Warna dasar dan warna aksen");
              System.out.print("Pilih operasi : ");
              pilih = sc.nextInt();
          }

          if(pilih == 1){
              System.out.print("Warna dasar baru : ");
              warnaDasarBaru = sc.next();
              mobilWarnaBaru.ubahWarna(warnaDasarBaru);
          }
          else if(pilih == 2){
              System.out.print("Warna dasar baru : ");
              warnaDasarBaru = sc.next();
              System.out.print("Warna aksen baru : ");
              warnaAksenBaru = sc.next();
              
              mobilWarnaBaru.ubahWarna(warnaDasarBaru, warnaAksenBaru);
          }

          //akhir menu 3
          break;

        case (5):
          lanjut = false;
          break;

        default:
          //System.out.println("Input salah");
          break;
      } //akhir switch pilihan menu utama
         System.out.println("\n--- End of Operation ---\n");
         //System.out.print("Ingin lagi? y/n : ");z
         //pilihLanjut = sc.next();

         //if(pilihLanjut == "y"){
            //lanjut = true;
            //}
         //else {
            //lanjut = false;
      
        }
     }
    }
//}