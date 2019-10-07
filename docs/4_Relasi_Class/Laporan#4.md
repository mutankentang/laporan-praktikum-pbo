# Laporan Praktikum #4 - Relasi_kelas

## Kompetensi

Setelah menempuh pokok bahasan ini, mahasiswa mampu:
1. Memahami konsep relasi kelas;
2. Mengimplementasikan relasi has‑a dalam program.
 

## Ringkasan Materi
 Di Jobsheet ini Kita Dapat memahami konsep relaasi kelas dan Mengimplementasikan relasi has‑a dalam program pada java.

## Percobaan 1
a. Perhatikan diagram class berikut:

b. Buka project baru di Netbeans dan buat package dengan format berikut:
<identifier>.relasiclass.percobaan1 (ganti dengan identitas anda atau nama domain), Contoh: ac.id.polinema, jti.polinema, dan sebagainya).
Catatan: Penamaan package dengan tambahan identifier untuk menghindari adanya kemungkinan penamaan class yang bentrok.
c. Buatlah class Processor dalam package tersebut.
public class Processor {
}
d. Tambahkan atribut merk dan cache pada class Processor dengan akses modifier private .
private String merk;
private double cache;
e. Buatlah constructor default untuk class Processor.
f. Buatlah constructor untuk class Processor dengan parameter merk dan cache.
g. Implementasikan setter dan getter untuk class Processor.
h. Implementasikan method info() seperti berikut:
bentuk UML class diagram class Motor adalah sebagai berikut:

![1](img/1.PNG)

Contoh link kode program : [Laptop1841720125Falah](../../src/4_Relasi_Class/Laptop1841720125Falah.java)

![2](img/2.PNG)

Contoh link kode program : [Processor1841720125Falah](../../src/4_Relasi_Class/Processor1841720125Falah.java)

![3](img/3.PNG)

Contoh link kode program : [MainPercobaan11841720125Falah](../../src/4_Relasi_Class/MainPercobaan11841720125Falah.java)

## Pertanyaan

Berdasarkan percobaan 1, jawablah pertanyaan‑pertanyaan yang terkait:

1. Di dalam class Processor dan class Laptop , terdapat method setter dan getter untuk masing‑masing atributnya. Apakah gunanya method setter dan getter tersebut ?

2. Di dalam class Processor dan class Laptop, masing‑masing terdapat konstruktor default dan konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis konstruktor tersebut ?

3. Perhatikan class Laptop, di antara 2 atribut yang dimiliki (merk dan proc), atribut manakah yang bertipe object ?

4. Perhatikan class Laptop, pada baris manakah yang menunjukan bahwa class Laptop memiliki relasi dengan class Processor ?

5. Perhatikan pada class Laptop , Apakah guna dari sintaks proc.info() ?

6. Pada class MainPercobaan1, terdapat baris kode:
Laptop l = new Laptop("Thinkpad", p);.
Apakah p tersebut ?
Dan apakah yang terjadi jika baris kode tersebut diubah menjadi:
Laptop l = new Laptop("Thinkpad", new Processor("Intel i5", 3));
Bagaimanakah hasil program saat dijalankan, apakah ada perubahan ?

## Jawab

1. fungsinya sesuai dengan namanya yaitu untu menge-set (memberi nilai) dan menge-get (mendapatkan/melihat nilai) pada suatu variabel atau class dengan contructor default

2. bila konstruktor default, untuk memberi nilai menggunakan setter, tetapi jika kita menggunakan konstruktor berparameter, kita hanya perlu memberi nilai di parameter pada objek di class main.

3.  proc, karena inisiasi tipe variabel ditandai dengan nama object.

4. Public Laptop184170125Falah(String merk, Processor proc){
    this.merk = merk;
    this.proc = proc;
}
Contoh link kode program : [Laptop1841720125Falah](../../src/4_Relasi_Class/Laptop1841720125Falah.java)

5. proc.Info(), merupakan syntax yang digunakan untuk menjalankan method Info() pada class Processor.

6. p merupakan object dari class Processor yang tadi telah diinstansiasi, Lalu kode program yang baru hasilnya sama saja, kode program tersebut memiliki perbedaan pada instansiasi dalam bentuk variabel object, bila pada kode program tersebut object tidak perlu diinstansiasi kedalam variabel lain tetapi ter nested atau bisa dibilang melakukan instansiasi objek dialam instansiasi object.

## Percobaan 2 

Perhatikan diagram class berikut yang menggambarkan sistem rental mobil. Pelanggan bisa menyewa mobil sekaligus sopir. Biaya sopir dan biaya sewa mobil dihitung per hari.

a. Tambahkan package <identifier>.relasiclass.percobaan2.

b. Buatlah class Mobil di dalam package tersebut.

c. Tambahkan atribut merk tipe String dan biaya tipe int dengan akses 
modifier private.

d. Tambahkan constructor default serta setter dan getter.

e. Implementasikan method hitungBiayaMobil

public int hitungBiayaMobil(int hari) {
return biaya * hari;
}

f. Tambahkan class Sopir dengan atribut nama tipe String dan biaya tipe int dengan akses modifier private berikut dengan constructor default.

g. Implementasikan method hitungBiayaSopir
public int hitungBiayaSopir(int hari) {
return biaya * hari;
}

h. Tambahkan class Pelanggan dengan constructor default.

i. Tambahkan atribut‑atribut dengan akses modifier private berikut:

j. Implementasikan setter dan getter.

k. Tambahkan method hitungBiayaTotal
public int hitungBiayaTotal() {
return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
}

l. Buatlah class MainPercobaan2 yang berisi method main(). Tambahkan baris kode berikut:
Mobil m = new Mobil();
m.setMerk("Avanza");
m.setBiaya(350000);
Sopir s = new Sopir();
s.setNama("John Doe");
s.setBiaya(200000);
Pelanggan p = new Pelanggan();
p.setNama("Jane Doe");
p.setMobil(m);
p.setSopir(s);
p.setHari(2);
System.out.println("Biaya Total = " + p.hitungBiayaTotal());

m. Compile dan jalankan class MainPercobaan2, dan perhatikan hasilnya!

![4](img/4.PNG)

Contoh link kode program : [Sopir1841720125Falah](../../src/4_Relasi_Class/Sopir1841720125Falah.java)

![5](img/5.PNG)

Contoh link kode program : [Mobil1841720125Falah](../../src/4_Relasi_Class/Mobil1841720125Falah.java)

![6](img/6.PNG)

Contoh link kode program : [Pelanggan1841720125Falah](../../src/4_Relasi_Class/Pelanggan1841720125Falah.java)

![7](img/7.PNG)

Contoh link kode program : [MainPercobaan21841720125Falah](../../src/4_Relasi_Class/MainPercobaan21841720125Falah.java)

## Pertanyaan

1. Perhatikan class Pelanggan. Pada baris program manakah yang menunjukan bahwa class Pelanggan memiliki relasi dengan class Mobil dan class Sopir ?

2. Perhatikan method hitungBiayaSopir pada class Sopir, serta method hitungBiayaMobil pada class Mobil. Mengapa menurut Anda method tersebut harus memiliki argument hari ?

3. Perhatikan kode dari class Pelanggan. Untuk apakah perintah mobil.hitungBiayaMobil(hari) dan sopir.hitungBiayaSopir(hari) ?

4. Perhatikan class MainPercobaan2. Untuk apakah sintaks p.setMobil(m) dan p.setSopir(s) ?

5. Perhatikan class MainPercobaan2. Untuk apakah proses p.hitungBiayaTotal() tersebut ?

6. Perhatikan class MainPercobaan2, coba tambahkan pada baris terakhir dari method main dan amati perubahan saat di‑run!
System.out.println(p.getMobil().getMerk());
Jadi untuk apakah sintaks p.getMobil().getMerk() yang ada di dalam method main tersebut?

Jawaban:

1. Dapat dilihat pada inisiasi  variabel object di class pelanggan

2. argumen tersebut nantinya digunakan untuk diisi dengan variabel int hari pada class Pelanggan 

3. kode program tersebut digunakan untuk menjumlahkan biaya mobil yang diambil dari harga sopir dikali dengan hari lalu yang dijumlahkan dengan biaya sopir yang diambil dari harga sopir dikali hari.

4. kode program tersebut digunakan untuk memberi atau mengisi nilai dari namaMobil dan namaSopir yang ada pada objek pelanggan

5. Digunakan untuk menghitung biaya total dari penjumlahan antara biaya sopir dan biaya mobil.

6. perintah tersebut digunakan untuk menggembalikan atau me return nilai atribut dari method  getMerk() pada class Mobil melalui objek pelanggan, atau setelah me return object Mobil pada class pelanggan, object mobil akan me return String getMerk() pada class mobil


## Percobaan 3 Getter dan Setter
a. Sebuah Kereta Api dioperasikan oleh Masinis serta seorang Asisten Masinis. Baik Masinis maupun Asisten Masinis keduanya merupakan Pegawai PT. Kereta Api Indonesia. Dari ilustrasi cerita tersebut, dapat digambarkan dalam diagram kelas sebagai berikut:

b. Perhatikan dan pahami diagram kelas tersebut, kemudian bukalah IDE anda!

c. Buatlah package <identifier>.relasiclass.percobaan3, kemudian tambahkan class Pegawai.

d. Tambahkan atribut‑atribut ke dalam class Pegawai
        private String nip;
        private String nama;

e. Buatlah constructor untuk class Pegawai dengan parameter nip dan nama.

f. Tambahkan setter dan getter untuk masing‑masing atribut.

g. Implementasikan method info() dengan menuliskan baris kode berikut:

        public String info() { String info = "";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
        }
h. Buatlah class KeretaApi berdasarkan diagram class.

i. Tambahkan atribut‑atribut pada class KeretaApi berupa nama, kelas, masinis, dan asisten.

        private String nama;
        private String kelas;
        private Pegawai masinis;
        private Pegawai asisten;

j. Tambahkan constructor 3 parameter (nama, kelas, masinis) serta 4 parameter (nama, kelas, masinis, asisten).

k. Tambahkan setter dan getter untuk atribut‑atribut yang ada pada class KeretaApi .

l. Kemudian implementasikan method info()

        public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        info += "Asisten: " + this.asisten.info() + "\n";
        return info;
        }

m. Buatlah sebuah class MainPercobaan3 dalam package yang sama.

n. Tambahkan method main() kemudian tuliskan baris kode berikut.

        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        Pegawai asisten = new Pegawai("4567", "Patrick Star");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);

        System.out.println(keretaApi.info());

![8](img/8.PNG)

Contoh link kode program : [Pegawai1841720125Falah](../../src/4_Relasi_Class/Pegawai1841720125Falah.java)

![9](img/9.PNG)

Contoh link kode program : [KeretaApi1841720125Falah](../../src/4_Relasi_Class/KeretaApi1841720125Falah.java)

![10](img/10.PNG)

Contoh link kode program : [MainPercobaan31841720125Falah](../../src/4_Relasi_Class/MainPercobaan31841720125Falah.java)

# Pertanyaan
1. Di dalam method info() pada class KeretaApi, baris this.masinis.info() dan this.asisten.info() digunakan untuk apa ?

2. Buatlah main program baru dengan nama class MainPertanyaan pada package yang sama. Tambahkan kode berikut pada method main() !

        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);
        System.out.println(keretaApi.info());

3. Apa hasil output dari main program tersebut ? Mengapa hal tersebut dapat terjadi ?

4. Perbaiki class KeretaApi sehingga program dapat berjalan !

Jawab:
1. digunakan untuk memanggil method Info yang berada di class Pegawai melalui object masinis dan asisten

2. ![9pertanyaan](img/9pertanyaan.PNG)

Contoh link kode program : [MainPertanyaan1841720125Falah](../../src/4_Relasi_Class/MainPertanyaan1841720125Falah.java)

3. Karana ada variabel yang tidak bernilai atau disebut dengan null, dan variabel tersebut adalah object asisten pada class KeretaApi

4. ![9pertanyaan](img/9pertanyaan.PNG)

Contoh link kode program : [MainPertanyaan1841720125Falah](../../src/4_Relasi_Class/MainPertanyaan1841720125Falah.java)

## Percobaan 4 Konstruktor, Instansiasi

a. Perhatikan dan pahami diagram class tersebut.

b. Buatlah masing‑masing class Penumpang, Kursi dan Gerbong sesuai rancangan 
tersebut pada package <identifier>.relasiclass.percobaan4.

c. Tambahkan method info() pada class Penumpang

        public String info() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
        }

d. Tambahkan method info() pada class Kursi

        public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
        info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
        }
        
e. Pada class Gerbong buatlah method initKursi() dengan akses private.

        private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
        this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
        }

f. Panggil method initKursi() dalam constructor Gerbong sehingga baris kode 
menjadi berikut:

        public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
        }

g. Tambahkan method info() pada class Gerbong

        public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
        info += kursi.info();
        }
        return info;
        }

h. Implementasikan method untuk memasukkan penumpang sesuai dengan nomor kursi.

        public void setPenumpang(Penumpang penumpang, int nomor) {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        }

i. Buatlah class MainPercobaan4 yang berisi method main(). Kemudian tambahkan baris berikut!

        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());

![11](img/11.PNG)

Contoh link kode program : [Kursi1841720125Falah](../../src/4_Relasi_Class/Kursi1841720125Falah.java)

![12](img/12.PNG)

Contoh link kode program : [Penumpang1841720125Falah](../../src/4_Relasi_Class/Penumpang1841720125Falah.java)

![13](img/13.PNG)

Contoh link kode program : [Gerbong1841720125Falah](../../src/4_Relasi_Class/Gerbong1841720125Falah.java)

![15](img/15.PNG)

Contoh link kode program : [Percobaan41841720125Falah](../../src/4_Relasi_Class/Percobaan41841720125Falah.java)

# Pertanyaan

1. Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam Gerbong A ?

2. Perhatikan potongan kode pada method info() dalam class Kursi. Apa maksud kode tersebut ?

        ...
        if (this.penumpang != null) {
        info += "Penumpang: " + penumpang.info() + "\n";
        }
        ...

3. Mengapa pada method setPenumpang() dalam class Gerbong, nilai nomor dikurangi dengan angka 1 ?

4. Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru tersebut pada gerbong dengan gerbong.setPenumpang(budi, 1). Apakah yang terjadi ?

5. Modifikasi program sehingga tidak diperkenankan untuk menduduki kursi yang sudah ada penumpang lain !

Jawaban:

1. 10, dapat dilihat pada instansiasi new Gerbong atau pada output bisa dilihat perulangan “Nomer : 10” 

2. potongan kode program tersebut digunakan untuk menampilkan kursi yang terisi oleh penumpang, tetapi bila penumpang tidak bernilai atau null, maka kode program yang terdapat pada if tidak dijalankan atau berarti kursi tersebut masih kosong

3. karena index array selalu dimulai dari 0, oleh karena itu nilai nomer harus dikurangi 1 agar array di index 0 atau di index pertama dapat terisi

4. ![14](img/14.PNG)

Contoh link kode program : [Percobaan41841720125Falah](../../src/4_Relasi_Class/Percobaan41841720125Falah.java)

5. ![13](img/13.PNG)

Contoh link kode program : [Gerbong1841720125Falah](../../src/4_Relasi_Class/Gerbong1841720125Falah.java)


## Tugas

Buatlah sebuah studi kasus, rancang dengan class diagram, kemudian implementasikan ke dalam program! Studi kasus harus mewakili relasi class dari percobaan‑percobaan yang telah dilakukan pada materi ini, setidaknya melibatkan minimal 4 class (class yang berisi main tidak dihitung).

![16](img/16.PNG)

Contoh link kode program : [Sapi1841720125Falah](../../src/4_Relasi_Class/Sapi1841720125Falah.java)

![17](img/17.PNG)

Contoh link kode program : [Kambing1841720125Falah](../../src/4_Relasi_Class/Kambing1841720125Falah.java)

![18](img/18.PNG)

Contoh link kode program : [Ayam1841720125Falah](../../src/4_Relasi_Class/Ayam1841720125Falah.java)

![19](img/19.PNG)

Contoh link kode program : [Bebek1841720125Falah](../../src/4_Relasi_Class/Bebek1841720125Falah.java)

![20](img/20.PNG)

Contoh link kode program : [MainPage1841720125Falah](../../src/4_Relasi_Class/MainPage1841720125Falah.java)

## Kesimpulan

Dari percobaan diatas, telah dipelajari konsep dari Relasi kelas,dan mengimplementasikan relasi has-a dalam program java.

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(AHMAD FALAH SABILA)***
