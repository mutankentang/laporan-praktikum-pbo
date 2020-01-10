package frontend;

import backend.Peminjaman1841720125Falah;
import backend.*;

public class TestBackend1841720125Falah {

    public static void main(String[] args) {
        // Kategori
//        Kategori1841720125Falah kat1 = new Kategori1841720125Falah("Novel", "Koleksi buku novel");
//        Kategori1841720125Falah kat2 = new Kategori1841720125Falah("Referensi", "Buku referensi ilmiah");
//        Kategori1841720125Falah kat3 = new Kategori1841720125Falah("Komik", "Komik anak-anak");

        // Anggota
//        Anggota1841720125Falah agt1 = new Anggota1841720125Falah("Falah", "Kabupaten Malang", "0812345679");
//        Anggota1841720125Falah agt2 = new Anggota1841720125Falah("Fulan", "Banjarmasin", "0858345637");
//        Anggota1841720125Falah agt3 = new Anggota1841720125Falah("Fulanah", "Kota Bandung", "0896345678");

        // Buku
//        Kategori1841720125Falah novel = new Kategori1841720125Falah().getByIdFalah(10);
//        Kategori1841720125Falah referensi = new Kategori1841720125Falah().getByIdFalah(11);
//        
//        Buku1841720125Falah buku1 = new Buku1841720125Falah(novel, "Timun Mas", "Elex Media", "Bang Supit");
//        Buku1841720125Falah buku2 = new Buku1841720125Falah(referensi, "Metode Linier", "Springer", "Alex Baldwin");
//        Buku1841720125Falah buku3 = new Buku1841720125Falah(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        
        // Peminjaman
//        Anggota1841720125Falah fulan = new Anggota1841720125Falah().getByIdFalah(8);
        Anggota1841720125Falah fulanah = new Anggota1841720125Falah().getByIdFalah(9);
//        Buku1841720125Falah syarhussunnah = new Buku1841720125Falah().getByIdFalah(3);
        Buku1841720125Falah aljabar = new Buku1841720125Falah().getByIdFalah(6);
//        Peminjaman1841720125Falah peminjaman1 = new Peminjaman1841720125Falah(fulan, syarhussunnah, "2020/09/21", "2020/10/01");
        Peminjaman1841720125Falah peminjaman2 = new Peminjaman1841720125Falah(fulanah, aljabar, "2020/01/21", "2020/02/01");
        
        // test insert [peminjaman]
//        peminjaman1.saveFalah();
        peminjaman2.saveFalah();
        
        // test select all [peminjaman]
        for (Peminjaman1841720125Falah p : new Peminjaman1841720125Falah().getAllFalah()) {
            System.out.println("Nama Anggota : " + p.getAnggotaFalah().getNamaFalah()+ ", Judul Buku : " + p.getBukuFalah().getJudulFalah()+ ", " + "Tanggal Pinjam: " + p.getTanggalpinjamFalah()+ ", Tanggal Kembali: " + p.getTanggalkembaliFalah());
        }

        // test insert [kategori]
//        kat1.saveFalah();
//        kat2.saveFalah();
//        kat3.saveFalah();
  
        // test insert [anggota]
//        agt1.saveFalah();
//        agt2.saveFalah();
//        agt3.saveFalah();

        // test insert [buku]
//        buku1.saveFalah();
//        buku2.saveFalah();
        
        // test update [kategori]
//        kat2.setKeteranganFalah("Koleksi buku referensi ilmiah");
//        kat2.saveFalah();
        
        // test update [anggota]
//        agt2.setAlamatFalah("Kota Banjarmasin");
//        agt2.saveFalah();

        // test update [buku]
//        buku2.setJudulFalah("Aljabar Linier");
//        buku2.saveFalah();
        
        // test delete [kategori]
//        kat3.deleteFalah();
        
        // test delete [anggota]
//        agt1.deleteFalah();

        // test delete [buku]
//        buku3.deleteFalah();
        
        // test select all [kategori]
//        for (Kategori1841720125Falah k : new Kategori1841720125Falah().getAllFalah()) {
//            System.out.println("Nama: " + k.getNamaFalah()+ ", Ket: " + k.getKeteranganFalah());
//        }
        
        // test select all [anggota]
//        for (Anggota1841720125Falah a : new Anggota1841720125Falah().getAllFalah()) {
//            System.out.println("Nama: " + a.getNamaFalah()+ ", Alamat: " + a.getAlamatFalah()+ ", Telepon: " + a.getTeleponFalah());
//        }

        // test select all [buku]
//        for (Buku1841720125Falah b : new Buku1841720125Falah().getAllFalah()) {
//            System.out.println("Kategori: " + b.getKategoriFalah().getNamaFalah() + ", Judul: " + b.getJudulFalah());
//        }
        
        // test search [kategori]
//        for (Kategori1841720125Falah k : new Kategori1841720125Falah().searchFalah("ilmiah")) {
//            System.out.println("Nama: " + k.getNamaFalah()+ ", Ket: " + k.getKeteranganFalah());
//        }
        
        // test search [anggota]
//        for (Anggota1841720125Falah a : new Anggota1841720125Falah().searchFalah("Bandung")) {
//            System.out.println("Nama: " + a.getNamaFalah()+ ", Alamat: " + a.getAlamatFalah()+ ", Telepon: " + a.getTeleponFalah());
//        }

        // test search [buku]
//        for (Buku1841720125Falah b : new Buku1841720125Falah().searchFalah("timun")) {
//            System.out.println("Kategori: " + b.getKategoriFalah().getNamaFalah() + ", Judul: " + b.getJudulFalah());
//        }
    }
}
