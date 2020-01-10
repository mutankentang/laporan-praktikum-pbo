package backend;

import java.util.ArrayList;
import java.sql.*;
public class Buku1841720125Falah {

    private int mIdbuku;
    private Kategori1841720125Falah mKategori = new Kategori1841720125Falah();
    private String mJudul;
    private String mPenerbit;
    private String mPenulis;

    public Buku1841720125Falah() {
    }

    public Buku1841720125Falah(Kategori1841720125Falah mKategori, String mJudul, String mPenerbit, String mPenulis) {
        this.mKategori = mKategori;
        this.mJudul = mJudul;
        this.mPenerbit = mPenerbit;
        this.mPenulis = mPenulis;
    }

    public int getIdbukuFalah() {
        return mIdbuku;
    }

    public void setIdbukuFalah(int mIdbuku) {
        this.mIdbuku = mIdbuku;
    }

    public Kategori1841720125Falah getKategoriFalah() {
        return mKategori;
    }

    public void setKategoriFalah(Kategori1841720125Falah mKategori) {
        this.mKategori = mKategori;
    }

    public String getJudulFalah() {
        return mJudul;
    }

    public void setJudulFalah(String mJudul) {
        this.mJudul = mJudul;
    }

    public String getPenerbitFalah() {
        return mPenerbit;
    }

    public void setPenerbitFalah(String mPenerbit) {
        this.mPenerbit = mPenerbit;
    }

    public String getPenulisFalah() {
        return mPenulis;
    }

    public void setPenulisFalah(String mPenulis) {
        this.mPenulis = mPenulis;
    }

    public Buku1841720125Falah getByIdFalah(int id) {
        Buku1841720125Falah buku = new Buku1841720125Falah();
        ResultSet rs = DBHelper1841720125Falah.selectQueryFalah("SELECT " + " b.idbuku AS idbuku, " + " b.judul AS judul, " + " b.penerbit AS penerbit, " + " b.penulis AS penulis, " + " k.idkategori AS idkategori, " + " k.nama AS nama, " + " k.keterangan AS keterangan " + " FROM buku b " + " LEFT JOIN kategori k ON b.idkategori = k.idkategori " + " WHERE b.idbuku = '" + id + "'");

        try {
            while (rs.next()) {
                buku = new Buku1841720125Falah();
                buku.setIdbukuFalah(rs.getInt("idbuku"));
                buku.getKategoriFalah().setIdkategoriFalah(rs.getInt("idkategori"));
                buku.getKategoriFalah().setNamaFalah(rs.getString("nama"));
                buku.getKategoriFalah().setKeteranganFalah(rs.getString("keterangan"));
                buku.setJudulFalah(rs.getString("judul"));
                buku.setPenerbitFalah(rs.getString("penerbit"));
                buku.setPenulisFalah(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }

    public ArrayList<Buku1841720125Falah> getAllFalah() {
        ArrayList<Buku1841720125Falah> ListBuku = new ArrayList();

        ResultSet rs = DBHelper1841720125Falah.selectQueryFalah("SELECT " + " b.idbuku AS idbuku, " + " b.judul AS judul, " + " b.penerbit AS penerbit, " + " b.penulis AS penulis, " + " k.idkategori AS idkategori, " + " k.nama AS nama, " + " k.keterangan AS keterangan " + " FROM buku b " + " LEFT JOIN kategori k ON b.idkategori = k.idkategori ");

        try {
            while (rs.next()) {
                Buku1841720125Falah buku = new Buku1841720125Falah();
                buku.setIdbukuFalah(rs.getInt("idbuku"));
                buku.getKategoriFalah().setIdkategoriFalah(rs.getInt("idkategori"));
                buku.getKategoriFalah().setNamaFalah(rs.getString("nama"));
                buku.getKategoriFalah().setKeteranganFalah(rs.getString("keterangan"));
                buku.setJudulFalah(rs.getString("judul"));
                buku.setPenerbitFalah(rs.getString("penerbit"));
                buku.setPenulisFalah(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public ArrayList<Buku1841720125Falah> searchFalah(String keyword) {
        ArrayList<Buku1841720125Falah> ListBuku = new ArrayList();

        ResultSet rs = DBHelper1841720125Falah.selectQueryFalah("SELECT " + " b.idbuku AS idbuku, " + " b.judul AS judul, " + " b.penerbit AS penerbit, " + " b.penulis AS penulis, " + " k.idkategori AS idkategori, " + " k.nama AS nama, " + " k.keterangan AS keterangan " + " FROM buku b " + " LEFT JOIN kategori k ON b.idkategori = k.idkategori " + " WHERE b.judul LIKE '%" + keyword + "%' " + " OR b.penerbit LIKE '%" + keyword + "%' " + " OR b.penulis LIKE '%" + keyword + "%' ");

        try {
            while (rs.next()) {
                Buku1841720125Falah buku = new Buku1841720125Falah();
                buku.setIdbukuFalah(rs.getInt("idbuku"));
                buku.getKategoriFalah().setIdkategoriFalah(rs.getInt("idkategori"));
                buku.getKategoriFalah().setNamaFalah(rs.getString("nama"));
                buku.getKategoriFalah().setKeteranganFalah(rs.getString("keterangan"));
                buku.setJudulFalah(rs.getString("judul"));
                buku.setPenerbitFalah(rs.getString("penerbit"));
                buku.setPenulisFalah(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public void saveFalah() {
        if (getByIdFalah(mIdbuku).getIdbukuFalah() == 0) {
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES(" + " '" + this.mJudul + "', " + " '" + this.getKategoriFalah().getIdkategoriFalah() + "', " + " '" + this.mPenulis + "', " + " '" + this.mPenerbit + "' " + " )";
            this.mIdbuku = DBHelper1841720125Falah.insertQueryGetIdFalah(SQL);
        } else {
            String SQL = "UPDATE buku SET " + " judul = '" + this.mJudul + "', " + " idkategori = '" + this.getKategoriFalah().getIdkategoriFalah() + "', " + " penulis = '" + this.mPenulis + "', " + " penerbit = '" + this.mPenerbit + "' " + " WHERE idbuku = '" + this.mIdbuku + "'";
            DBHelper1841720125Falah.executeQueryFalah(SQL);
        }
    }

    public void deleteFalah() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.mIdbuku + "'";
        DBHelper1841720125Falah.executeQueryFalah(SQL);
    }
}
