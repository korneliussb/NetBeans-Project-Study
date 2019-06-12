package bab6tugas2;
/*@SATRIA*/
public class Mobil {
    public String merkMobil; //tipe modifier dapat diakses kelas lain u/ public , yg banyak itu encapsulation , variabel
    public String tipeMobil;
    public Integer jumlahPintu;
    // int = kalau dia belum dimasukkan nilai apa pun, nilai awal 0
    // Integer = kalau Integer = null
    private Integer tenagaKuda;
    private float konsumsiBahanBakar;
    private float besarTangki;
    public String warnaDasar;
    public String warnaAksen;

    //constructor u/ dieksekusi ulang saat membuat obyek, berargumen (punya parameter) dan overloading constructor
    public Mobil(String merkMobil, String tipeMobil, Integer jumlahPintu, Integer tenagaKuda, float konsumsiBahanBakar, float besarTangki, String warnaDasar){
      this.merkMobil = merkMobil; //this u/ memasukkan nilai variabel ke class merkMobil
      this.tipeMobil = tipeMobil;
      this.jumlahPintu = jumlahPintu;
      this.tenagaKuda  = tenagaKuda;
      this.konsumsiBahanBakar = konsumsiBahanBakar;
      this.besarTangki = besarTangki;
      this.warnaDasar  = warnaDasar;
      this.warnaAksen  = warnaDasar;
    }
    
//akan masuk ke variabel yang ada 8 parameter di pro utama
    public Mobil(String merkMobil, String tipeMobil, Integer jumlahPintu, Integer tenagaKuda, float konsumsiBahanBakar, float besarTangki, String warnaDasar, String warnaAksen){
      this.merkMobil = merkMobil;
      this.tipeMobil = tipeMobil;
      this.jumlahPintu = jumlahPintu;
      this.tenagaKuda  = tenagaKuda;
      this.konsumsiBahanBakar = konsumsiBahanBakar;
      this.besarTangki = besarTangki;
      this.warnaDasar  = warnaDasar;
      this.warnaAksen  = warnaAksen;
    }

    public float hitungJarakTempuh(){ //method hitung jarak tempuh, tanpa memanggil parameter
      float x = this.besarTangki / this.konsumsiBahanBakar; //nilai x menyimpan nilai dari besar tangki
      return x;
    }

    public void modifikasiMesin(int tenagaKudaBaru, float besarTangkiBaru){
      this.tenagaKuda  = tenagaKudaBaru; // nilai di dalam class akan diganti dengan argumennya
      this.besarTangki = besarTangkiBaru;
    }

    // juga over loading argumen
    public void ubahWarna(String warnaDasar){
      this.warnaDasar = warnaDasar;
    }

    public void ubahWarna(String warnaDasar, String warnaAksen){
      this.warnaDasar = warnaDasar;
      this.warnaAksen = warnaAksen;
    }
}