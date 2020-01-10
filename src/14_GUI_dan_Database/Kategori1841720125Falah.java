package backend;

import java.util.ArrayList;
import java.sql.*;

public class Kategori1841720125Falah {

    private int mIdkategori;
    private String mNama;
    private String mKeterangan;

    public Kategori1841720125Falah() {
    }

    public Kategori1841720125Falah(String mNama, String mKeterangan) {
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }

    public int getIdkategoriFalah() {
        return mIdkategori;
    }

    public void setIdkategoriFalah(int mIdkategori) {
        this.mIdkategori = mIdkategori;
    }

    public String getNamaFalah() {
        return mNama;
    }

    public void setNamaFalah(String mNama) {
        this.mNama = mNama;
    }

    public String getKeteranganFalah() {
        return mKeterangan;
    }

    public void setKeteranganFalah(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }

    public Kategori1841720125Falah getByIdFalah(int id) {
        Kategori1841720125Falah kat = new Kategori1841720125Falah();
        ResultSet rs = DBHelper1841720125Falah.selectQueryFalah("SELECT * FROM kategori " + " WHERE idkategori = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Kategori1841720125Falah();
                kat.setIdkategoriFalah(rs.getInt("idkategori"));
                kat.setNamaFalah(rs.getString("nama"));
                kat.setKeteranganFalah(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1841720125Falah> getAllFalah() {
        ArrayList<Kategori1841720125Falah> ListKategori = new ArrayList();

        ResultSet rs = DBHelper1841720125Falah.selectQueryFalah("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Kategori1841720125Falah kat = new Kategori1841720125Falah();
                kat.setIdkategoriFalah(rs.getInt("idkategori"));
                kat.setNamaFalah(rs.getString("nama"));
                kat.setKeteranganFalah(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720125Falah> searchFalah(String keyword) {
        ArrayList<Kategori1841720125Falah> ListKategori = new ArrayList();

        String sql = "SELECT * FROM kategori WHERE " + " nama LIKE '%" + keyword + "%' " + " OR keterangan LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720125Falah.selectQueryFalah(sql);

        try {
            while (rs.next()) {
                Kategori1841720125Falah kat = new Kategori1841720125Falah();
                kat.setIdkategoriFalah(rs.getInt("idkategori"));
                kat.setNamaFalah(rs.getString("nama"));
                kat.setKeteranganFalah(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void saveFalah() {
        if (getByIdFalah(mIdkategori).getIdkategoriFalah() == 0) {
            String SQL = "INSERT INTO kategori (nama, keterangan) VALUES(" + " '" + this.mNama + "', " + " '" + this.mKeterangan + "' " + " )";
            this.mIdkategori = DBHelper1841720125Falah.insertQueryGetIdFalah(SQL);
        } else {
            String SQL = "UPDATE kategori SET " + " nama = '" + this.mNama + "', " + " keterangan = '" + this.mKeterangan + "' " + " WHERE idkategori = '" + this.mIdkategori + "'";
            DBHelper1841720125Falah.executeQueryFalah(SQL);
        }
    }
    
    public void deleteFalah()
    {
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.mIdkategori + "'";
        DBHelper1841720125Falah.executeQueryFalah(SQL);
    }
    
    public String toString()
    {
        return mNama;
    }
}
