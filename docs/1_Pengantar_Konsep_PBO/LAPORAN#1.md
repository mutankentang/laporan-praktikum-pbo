# Laporan Praktikum #1 - Pengantar Konsep PBO

## Kompetensi

Setelah menempuh materi percobaan ini, mahasiswa mampu mengenal: 
1. Perbedaan paradigma berorientasi objek dengan paradigma struktural 
2. Konsep dasar PBO 
 

## Ringkasan Materi

## Percobaan

### Percobaan 1

(berisi penjelasan percobaan 1. Jika ada rujukan ke file program, bisa dibuat linknya di sini.)

#### class Sepeda1841720125Falah

![C1](img/1.png)

Contoh link kode program : [Sepeda1841720125Falah](../../src/1_Pengantar_Konsep_PBO/Sepeda1841720125Falah.java)

#### class main SepedaDemo1841720125Falah

![2](img/2.png)

Contoh link kode program : [SepedaDemo1841720125Falah](../../src/1_Pengantar_Konsep_PBO/SepedaDemo1841720125Falah.java)

### Percobaan 2

(berisi penjelasan percobaan 2. Jika ada rujukan ke file program, bisa dibuat linknya di sini.)

#### class SepedaGunung1841720125Falah

![3](img/3.png)

Contoh link kode program : [SepedaGunung1841720125Falah](../../src/1_Pengantar_Konsep_PBO/SepedaGunung1841720125Falah.java)

#### class main

![2](img/2.png)

Contoh link kode program : [SepedaDemo1841720125Falah](../../src/1_Pengantar_Konsep_PBO/SepedaDemo1841720125Falah.java)


## Pertanyaan

1. Sebutkan dan jelaskan aspek-aspek yang ada pada pemrograman berorientasi objek! 


2. Apa yang dimaksud dengan object dan apa bedanya dengan class? 


3. Sebutkan salah satu kelebihan utama dari pemrograman berorientasi objek dibandingkan dengan pemrograman struktural! 


4. Pada class Sepeda, terdapat state/atribut apa saja?  


5. Tambahkan atribut warna pada class Sepeda.


6. Mengapa pada saat kita membuat class SepedaGunung, kita tidak perlu membuat class nya dari nol? 
 

Jawab:

1. A. OBJECT 

suatu rangkaian dalam program yang terdiri dari state dan behaviour.

B.CLASS

blueprint atau prototype dari objek.

C. ENKAPSULASI

Disebut juga dengan information-hiding. Dalam berinteraksi dengan objek, seringkali kita tidak perlu mengetahui 
kompleksitas yang ada didalamnya. 

D. INHERITANCE

Disebut juga pewarisan. Inheritance memungkinkan kita untuk mengorganisir struktur program dengan natural. 
Inheritance juga memungkinkan kita untuk memperluas fungsionalitas program tanpa harus mengubah banyak bagian program. 

E. POLIMORFISME

Polimorfisme juga meniru sifat objek di dunia nyata, dimana sebuah objek dapat memiliki bentuk,
atau menjelma menjadi bentuk-bentuk lain.

2. object merupakan bentuk representasi dari sebuah kelas, membungkus data dan fungsi bersama menjadi suatu unit atau 
entitas dalam sebuah program komputer.
Sedangkan  Kelas Merupakan kumpulan atas definisi data dan fungsi-fungsi dalam suatu unit untuk suatu tujuan tertentu 
dimana didalamnya terdapat kumpulan atribut dan method

3. Kelebihan PBO adalah program dapat lebih fleksibel dan modular, jika ada perubahan fitur, maka dapat dipastikan 
keseluruhan program tidak akan terganggu.

4. Kecepatan,gear,merek

5. ![8](img/8.png)

Contoh link kode program : [Sepeda1841720125Falah](../../src/1_Pengantar_Konsep_PBO/Sepeda1841720125Falah.java)

6. karena pada class sepeda gunung terdapat Inheritance, dimana  membuat class SepedaGunung yang mana adalah 
turunan/warisan dari class Sepeda. Pada dasarnya class SepedaGunung adalah sama dengan class Sepeda, hanya 
saja pada sepeda gunung terdapat tipe suspensi. Untuk itu kita tidak perlu membuat class Sepeda Gunung dari nol, 
tapi kita wariskan saja class Sepeda ke class SepedaGunung.

## Tugas

(silakan kerjakan tugas di sini beserta `screenshot` hasil kompilasi program. Jika ada rujukan ke file program, bisa dibuat linknya di sini.)

#### Parfum

![4](img/4.png)

Contoh link kode program : [Parfum1841720125Falah](../../src/1_Pengantar_Konsep_PBO/Parfum1841720125Falah.java)

#### Parfum Demo

![7](img/7.png)


Contoh link kode program : [ParfumDemo1841720125Falah](../../src/1_Pengantar_Konsep_PBO/ParfumDemo1841720125Falah.java)

#### Parfum Ruangan

![5](img/5.png)

Contoh link kode program : [ParfumRuangan1841720125Falah](../../src/1_Pengantar_Konsep_PBO/ParfumRuangan1841720125Falah.java)

#### Parfum Mobil

![6](img/6.png)

Contoh link kode program : [ParfumMobil1841720125Falah](../../src/1_Pengantar_Konsep_PBO/ParfumMobil1841720125Falah.java)

## Kesimpulan

Dari percobaan diatas, kita telah mendemonstrasikan bagaimana paradigma pemrograman berorientasi objek dan 
mengimplementasikannya kedalam program sederhana. Kita juga telah mendemonstrasikan salah satu fitur paling 
penting dari PBO yaitu inheritance, yaitu dalam hal membuat class SepedaGunung.  
Kita ketahui bahwa SepedaGunung pada dasarnya adalah sama dengan Sepeda (memiliki gear, memiliki kecepatan,
dapat menambah kecepatan, dapat mengerem, pindah gigi, dsb) namun ada fitur tambahan yaitu tipe suspensi.
Maka kita tidak perlu membuat class SepedaGunung dari nol, kita extends atau wariskan saja dari class Sepeda,
kemudian kita tinggal tambahkan fitur yang sebelumnya belum ada di class Sepeda. Inilah salah satu kelebihan 
PBO yang tidak ada di pemrograman struktural. 

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(AHMAD FALAH SABILA)***
