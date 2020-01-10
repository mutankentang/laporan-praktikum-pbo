package unittest;

import java.util.ArrayList;
import java.sql.*;


public class Anggota1841720125Falah {

    private int mIdanggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public Anggota1841720125Falah() {
    }

    public Anggota1841720125Falah(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public int getIdanggotaFalah() {
        return mIdanggota;
    }

    public void setIdanggotaFalah(int mIdanggota) {
        this.mIdanggota = mIdanggota;
    }

    public String getNamaFalah() {
        return mNama;
    }

    public void setNamaFalah(String mNama) {
        this.mNama = mNama;
    }

    public String getAlamatFalah() {
        return mAlamat;
    }

    public void setAlamatFalah(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getTeleponFalah() {
        return mTelepon;
    }

    public void setTeleponFalah(String mTelepon) {
        this.mTelepon = mTelepon;
    }

    public Anggota1841720125Falah getByIdFalah(int id) {
        Anggota1841720125Falah agt = new Anggota1841720125Falah();
        ResultSet rs = DBHelper1841720125Falah.selectQueryFalah("SELECT * FROM anggota " + " WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                agt = new Anggota1841720125Falah();
                agt.setIdanggotaFalah(rs.getInt("idanggota"));
                agt.setNamaFalah(rs.getString("nama"));
                agt.setAlamatFalah(rs.getString("alamat"));
                agt.setTeleponFalah(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return agt;
    }

    public ArrayList<Anggota1841720125Falah> getAllFalah() {
        ArrayList<Anggota1841720125Falah> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper1841720125Falah.selectQueryFalah("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1841720125Falah agt = new Anggota1841720125Falah();
                agt.setIdanggotaFalah(rs.getInt("idanggota"));
                agt.setNamaFalah(rs.getString("nama"));
                agt.setAlamatFalah(rs.getString("alamat"));
                agt.setTeleponFalah(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public ArrayList<Anggota1841720125Falah> searchFalah(String keyword) {
        ArrayList<Anggota1841720125Falah> ListAnggota = new ArrayList();

        String sql = "SELECT * FROM anggota WHERE " + " nama LIKE '%" + keyword + "%' " + " OR alamat LIKE '%" + keyword + "%' " + " OR telepon LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720125Falah.selectQueryFalah(sql);

        try {
            while (rs.next()) {
                Anggota1841720125Falah agt = new Anggota1841720125Falah();
                agt.setIdanggotaFalah(rs.getInt("idanggota"));
                agt.setNamaFalah(rs.getString("nama"));
                agt.setAlamatFalah(rs.getString("alamat"));
                agt.setTeleponFalah(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public ArrayList<Anggota1841720125Falah> getByNamaAndAlamatAndTeleponFalah(String nama, String alamat, String telepon) {
        ArrayList<Anggota1841720125Falah> ListAnggota = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length() > 0) && (alamat.trim().length() > 0) && (telepon.trim().length() > 0)) {
            rs = DBHelper1841720125Falah.selectQueryFalah("SELECT * FROM anggota WHERE nama = '" + nama + "'  AND alamat = '" + alamat + "'  AND telepon = '" + telepon + "'");

        } else if ((nama.trim().length() > 0) && (alamat.trim().length() > 0) && (telepon.trim().length() == 0)) {
            rs = DBHelper1841720125Falah.selectQueryFalah("SELECT * FROM anggota WHERE nama = '" + nama + "'  AND alamat = '" + alamat + "'");
        } else if ((nama.trim().length() > 0) && (alamat.trim().length() == 0)) {
            rs = DBHelper1841720125Falah.selectQueryFalah("SELECT * FROM anggota WHERE nama = '" + nama + "'");

        } else {
            rs = DBHelper1841720125Falah.selectQueryFalah(
                    "SELECT * FROM anggota "
                    + "WHERE alamat = '" + alamat + "'  ");
        }
        try {
            while (rs.next()) {
                Anggota1841720125Falah ang = new Anggota1841720125Falah();
                ang.setIdanggotaFalah(rs.getInt("idanggota"));
                ang.setNamaFalah(rs.getString("nama"));
                ang.setAlamatFalah(rs.getString("alamat"));
                ang.setTeleponFalah(rs.getString("telepon"));
                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public void saveFalah() {
        if (getByIdFalah(mIdanggota).getIdanggotaFalah() == 0) {
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES(" + " '" + this.mNama + "', " + " '" + this.mAlamat + "', " + " '" + this.mTelepon + "' " + " )";
            this.mIdanggota = DBHelper1841720125Falah.insertQueryGetIdFalah(SQL);
        } else {
            String SQL = "UPDATE anggota SET " + " nama = '" + this.mNama + "', " + " alamat = '" + this.mAlamat + "', " + " telepon = '" + this.mTelepon + "' " + " WHERE idanggota = '" + this.mIdanggota + "'";
            DBHelper1841720125Falah.executeQueryFalah(SQL);
        }
    }

    public void deleteFalah() {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.mIdanggota + "'";
        DBHelper1841720125Falah.executeQueryFalah(SQL);
    }
}
