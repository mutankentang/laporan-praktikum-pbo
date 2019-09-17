package pbojstiga;
public class AnggotaTugas1841720125Falah {
    private String nama, nomorKtp;
    private int limitPinjaman, jumlahPinjaman;
    
public AnggotaTugas1841720125Falah(String nomorKtp, String nama, int limitPinjaman) {
    this.nama = nama;
    this.nomorKtp = nomorKtp;
    this.limitPinjaman = limitPinjaman;
}

public String getNamaFalah(){
    return nama;
}

public int getLimitPinjamanFalah(){
    return limitPinjaman;
}

public int getJumlahPinjamanFalah(){
    return jumlahPinjaman;
}

public void pinjamFalah(int pinjam){
    if (pinjam>limitPinjaman) {
       System.out.println("Maaf, jumlah pinjaman melebihi limit.");
    }else{
       jumlahPinjaman+=pinjam;
    }
}
public void angsurFalah(int angsur){
    if (angsur<(jumlahPinjaman*0.1)){
        System.out.println("Maaf, Angsuran Harus 10% dari jumlah pinjaman");
    }else{
        jumlahPinjaman-=angsur;
    }
}
}


