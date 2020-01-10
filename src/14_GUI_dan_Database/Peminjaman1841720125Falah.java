package backend;

import java.util.ArrayList;
import java.sql.*;


public class Peminjaman1841720125Falah {

    private int mIdpeminjaman;
    private Anggota1841720125Falah mAnggota = new Anggota1841720125Falah();
    private Buku1841720125Falah mBuku = new Buku1841720125Falah();
    private String mTanggalpinjam;
    private String mTanggalkembali;

    public Peminjaman1841720125Falah() {
    }

    public Peminjaman1841720125Falah(Anggota1841720125Falah mAnggota, Buku1841720125Falah mBuku, String mTanggalpinjam, String mTanggalkembali) {
        this.mAnggota = mAnggota;
        this.mBuku = mBuku;
        this.mTanggalpinjam = mTanggalpinjam;
        this.mTanggalkembali = mTanggalkembali;
    }

    public int getIdpeminjamanFalah() {
        return mIdpeminjaman;
    }

    public void setIdpeminjamanFalah(int mIdpeminjaman) {
        this.mIdpeminjaman = mIdpeminjaman;
    }

    public Anggota1841720125Falah getAnggotaFalah() {
        return mAnggota;
    }

    public void setAnggotaFalah(Anggota1841720125Falah mAnggota) {
        this.mAnggota = mAnggota;
    }

    public Buku1841720125Falah getBukuFalah() {
        return mBuku;
    }

    public void setBukuFalah(Buku1841720125Falah mBuku) {
        this.mBuku = mBuku;
    }

    public String getTanggalpinjamFalah() {
        return mTanggalpinjam;
    }

    public void setTanggalpinjamFalah(String mTanggalpinjam) {
        this.mTanggalpinjam = mTanggalpinjam;
    }

    public String getTanggalkembaliFalah() {
        return mTanggalkembali;
    }

    public void setTanggalkembaliFalah(String mTanggalkembali) {
        this.mTanggalkembali = mTanggalkembali;
    }

    public Peminjaman1841720125Falah getByIdFalah(int id) {
        Peminjaman1841720125Falah pinjam = new Peminjaman1841720125Falah();
        ResultSet rs = DBHelper1841720125Falah.selectQueryFalah("SELECT "
                + " p.idpeminjaman AS idpeminjaman, "
                + " p.tanggalpinjam AS tanggalpinjam, "
                + " p.tanggalkembali AS tanggalkembali, "
                + " a.idanggota AS idanggota, "
                + " b.idbuku AS idbuku "
                + " FROM peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + " LEFT JOIN buku b ON p.idbuku = b.idbuku WHERE p.idpeminjaman = '" + id + "'");

        try {
            while (rs.next()) {
                pinjam = new Peminjaman1841720125Falah();
                pinjam.setIdpeminjamanFalah(rs.getInt("idpeminjaman"));
                pinjam.getAnggotaFalah().setIdanggotaFalah(rs.getInt("idanggota"));
                pinjam.getBukuFalah().setIdbukuFalah(rs.getInt("idbuku"));
                pinjam.setTanggalpinjamFalah(rs.getString("tanggalpinjam"));
                pinjam.setTanggalkembaliFalah(rs.getString("tanggalkembali"));
                pinjam.setAnggotaFalah(new Anggota1841720125Falah().getByIdFalah(pinjam.getAnggotaFalah().getIdanggotaFalah()));
                pinjam.setBukuFalah(new Buku1841720125Falah().getByIdFalah(pinjam.getBukuFalah().getIdbukuFalah()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pinjam;
    }

    public ArrayList<Peminjaman1841720125Falah> getAllFalah() {
        ArrayList<Peminjaman1841720125Falah> ListPinjam = new ArrayList();
        ResultSet rs = DBHelper1841720125Falah.selectQueryFalah("SELECT "
                + "p.idpeminjaman AS idpeminjaman, "
                + "p.tanggalpinjam AS tanggalpinjam, "
                + "p.tanggalkembali AS tanggalkembali, "
                + "a.idanggota AS idanggota, "
                + "b.idbuku AS idbuku "
                + "FROM peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + "LEFT JOIN buku b ON p.idbuku = b.idbuku");
        try {
            while (rs.next()) {
                Peminjaman1841720125Falah pinjam = new Peminjaman1841720125Falah();
                pinjam.setIdpeminjamanFalah(rs.getInt("idpeminjaman"));
                pinjam.getAnggotaFalah().setIdanggotaFalah(rs.getInt("idanggota"));
                pinjam.getBukuFalah().setIdbukuFalah(rs.getInt("idbuku"));
                pinjam.setTanggalpinjamFalah(rs.getString("tanggalpinjam"));
                pinjam.setTanggalkembaliFalah(rs.getString("tanggalkembali"));
                pinjam.setAnggotaFalah(new Anggota1841720125Falah().getByIdFalah(pinjam.getAnggotaFalah().getIdanggotaFalah()));
                pinjam.setBukuFalah(new Buku1841720125Falah().getByIdFalah(pinjam.getBukuFalah().getIdbukuFalah()));

                ListPinjam.add(pinjam);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPinjam;
    }

    public void saveFalah() {
        if (getByIdFalah(mIdpeminjaman).getIdpeminjamanFalah() == 0) {
            String sql = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) "
                    + "values ("
                    + "'" + this.getAnggotaFalah().getIdanggotaFalah() + "', "
                    + "'" + this.getBukuFalah().getIdbukuFalah() + "',"
                    + "'" + this.mTanggalpinjam + "', "
                    + "'" + this.mTanggalkembali + "' "
                    + ")";
            this.mIdpeminjaman = DBHelper1841720125Falah.insertQueryGetIdFalah(sql);
        } else {
            String sql = "UPDATE buku SET "
                    + "idanggota = '" + this.getAnggotaFalah().getIdanggotaFalah() + "', "
                    + "idbuku = '" + this.getBukuFalah().getIdbukuFalah() + "', "
                    + "tanggalpinjam = '" + this.mTanggalpinjam + "', "
                    + "tanggalkembali = '" + this.mTanggalkembali + "'";
            DBHelper1841720125Falah.executeQueryFalah(sql);
        }
    }

    public void cariAnggotaFalah(int id) {
        ResultSet rs = DBHelper1841720125Falah.selectQueryFalah("SELECT * FROM anggota WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                getAnggotaFalah().setIdanggotaFalah(rs.getInt("idanggota"));
                getAnggotaFalah().setNamaFalah(rs.getString("nama"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cariBukuFalah(int id) {
        ResultSet rs = DBHelper1841720125Falah.selectQueryFalah("SELECT * FROM buku WHERE idbuku = '" + id + "'");

        try {
            while (rs.next()) {
                getBukuFalah().setIdbukuFalah(rs.getInt("idbuku"));
                getBukuFalah().setJudulFalah(rs.getString("judul"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteFalah() {
        String sql = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.mIdpeminjaman + "'";
        DBHelper1841720125Falah.executeQueryFalah(sql);
    }
}
