# Laporan Praktikum #9 - Abstract Class dan Interface

## Kompetensi

Setelah menyelesaikan lembar kerja ini mahasiswa diharapkan mampu:
1. Menjelaskan maksud dan tujuan penggunaan Abstract Class;
2. Menjelaskan maksud dan tujuan penggunaan Interface;
3. Menerapkan Abstract Class dan Interface di dalam pembuatan program.
 

## Ringkasan Materi
Di Jobsheet ini Kita Dapat memahami dan mengerti bagaimana cara penggunaan Abstract Class, Interface, dan
Menerapkan Abstract Class dan Interface di dalam pembuatan program.

## Percobaan

### Percobaan 1

![1](img/1.PNG)

![2](img/2.PNG)

![3](img/3.PNG)

![4](img/4.PNG)

![5](img/5.PNG)

Kode program pada Percobaan 1 : 

[Hewan1841720125Falah.java](../../src/9_Abstract_Class_dan_Interface/abstrakclass/Hewan1841720125Falah.java)

[Ikan1841720125Falah.java](../../src/9_Abstract_Class_dan_Interface/abstrakclass/Ikan1841720125Falah.java)

[Kucing1841720125Falah.java](../../src/9_Abstract_Class_dan_Interface/abstrakclass/Kucing1841720125Falah.java)

[Orang1841720125Falah.java](../../src/9_Abstract_Class_dan_Interface/abstrakclass/Orang1841720125Falah.java)

[MainProgram1841720125Falah.java](../../src/9_Abstract_Class_dan_Interface/abstrakclass/MainProgram1841720125Falah.java)

### Pertanyaan

Bolehkah apabila sebuah class yang meng-extend suatu abstract class tidak mengimplementasikan method abstract yang ada di class induknya? Buktikan! 

Jawaban : 

Tidak, karena abstrak class harus di implementasikan dengan cara override. 
Jadi metode Lulus tidak diimplementasikan sehingga abstrak class terjadi error.

### Percobaan 2

![6](img/6.PNG)

![7](img/7.PNG)

![8](img/8.PNG)

![9](img/9.PNG)

![10](img/10.PNG)

![11](img/11.PNG)

Kode program pada Percobaan 2 : 

[ICumlaude1841720125Falah.java](../../src/9_Abstract_Class_dan_Interface/interfaceclass/ICumlaude1841720125Falah.java)

[Mahasiswa1841720125Falah.java](../../src/9_Abstract_Class_dan_Interface/interfaceclass/Mahasiswa1841720125Falah.java)

[PascaSarjana1841720125Falah.java](../../src/9_Abstract_Class_dan_Interface/interfaceclass/PascaSarjana1841720125Falah.java)

[Rektor1841720125Falah.java](../../src/9_Abstract_Class_dan_Interface/interfaceclass/Rektor1841720125Falah.java)

[Sarjana1841720125Falah.java](../../src/9_Abstract_Class_dan_Interface/interfaceclass/Sarjana1841720125Falah.java)

[MahasiswaMain1841720125Falah.java](../../src/9_Abstract_Class_dan_Interface/interfaceclass/MahasiswaMain1841720125Falah.java)

### Pertanyaan

1. Mengapa pada langkah nomor 9 terjadi error? Jelaskan! 
2. Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class Program? Mengapa demikian? 
3. Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method beriSertifikatCumlaude() pada class Rektor? Mengapa demikian? 
4. Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi class Program menjadi seperti berikut ini: 

Jawaban : 

1. Karena Mahasiswa biasa Tidak memenuhi syarat mendapat sertifikat cumlaude.

2. Bisa, Karena dipanggil secara manual

3. Bisa, Dengan cara menambahkan abstrak class kuliah dikampus dan di override pada class sarjana dan pascasarjana.

4. 

![p2a](img/p2a.PNG) 

![p2b](img/p2b.PNG) 

### Percobaan 3

![12](img/12.PNG)

![13](img/13.PNG)

![14](img/14.PNG)

![15](img/15.PNG)

![16](img/16.PNG)

![17](img/17.PNG)

![18](img/18.PNG)


Kode program pada Percobaan 3 : 

[P3_IBerprestasi1841720125Falah.java](../../src/9_Abstract_Class_dan_Interface/interfaceImplementation/P3_IBerprestasi1841720125Falah.java)

[P3_ICumlaude1841720125Falah.java](../../src/9_Abstract_Class_dan_Interface/interfaceImplementation/P3_ICumlaude1841720125Falah.java)

[P3_Mahasiswa1841720125Falah.java](../../src/9_Abstract_Class_dan_Interface/interfaceImplementation/P3_Mahasiswa1841720125Falah.java)

[P3_PascaSarjana1841720125Falah.java](../../src/9_Abstract_Class_dan_Interface/interfaceImplementation/P3_PascaSarjana1841720125Falah.java)

[P3_Rektor1841720125Falah.java](../../src/9_Abstract_Class_dan_Interface/interfaceImplementation/P3_Rektor1841720125Falah.java)

[P3_Sarjana1841720125Falah.java](../../src/9_Abstract_Class_dan_Interface/interfaceImplementation/P3_Sarjana1841720125Falah.java)

[P3_Program1841720125Falah.java](../../src/9_Abstract_Class_dan_Interface/interfaceImplementation/P3_Program1841720125Falah.java)


### Pertanyaan

Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat mawapres pada objek sarjanaCumlaude.

Jawaban :

pada class sarjana dilakunan implementasi abstraksi dengan cara override.



## Kesimpulan

Dari percobaan diatas, telah dipelajari konsep dari bagaimana cara penggunaan Abstract Class, Interface, dan
Menerapkan Abstract Class dan Interface di dalam pembuatan program.

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(AHMAD FALAH SABILA)***
