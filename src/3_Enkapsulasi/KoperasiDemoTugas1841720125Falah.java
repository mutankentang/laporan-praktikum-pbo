package pbojstiga;
import java.util.Scanner;
public class KoperasiDemoTugas1841720125Falah {
    static Scanner sc = new Scanner(System.in);
    static String nomorKtp, nama;
    static int limitPinjaman;
    static AnggotaTugas1841720125Falah member;

    public static void main(String[] args) {
        System.out.print("Input Nomor KTP : ");
        nomorKtp = sc.next();
        System.out.print("Input Nama : ");
        nama = sc.next();
        System.out.print("Limit Pinjaman : ");
        limitPinjaman = sc.nextInt();
        member = new AnggotaTugas1841720125Falah(nomorKtp, nama, limitPinjaman);
        while (true) {
            menuFalah();
        }
    }
    private static void menuFalah() {
        int input = 0;
        System.out.println(" Menu");
        System.out.println("==============");
        System.out.println("1. pinjam");
        System.out.println("2. Angsur");
        System.out.println("3. Profil");
        System.out.println("4. quit");
        System.out.println("==============");
        System.out.print("Input : ");
        input = sc.nextInt();
        int uang = 0;
        switch (input) {
            case 1:
                System.out.print("Input Nominal Pinjam : ");
                uang = sc.nextInt();
                member.pinjamFalah(uang);
                System.out.println("Jumlah Pinjaman : " + member.getJumlahPinjamanFalah());
                break;
            case 2:
                System.out.print("Input Nominal Angsur : ");
                uang = sc.nextInt();
                member.angsurFalah(uang);
                System.out.println("Jumlah Pinjaman : " + member.getJumlahPinjamanFalah());
                break;
            case 3:
                System.out.println("Nomor Ktp : " + nomorKtp);
                System.out.println("Nama : " + member.getNamaFalah());
                System.out.println("Limit Pinjaman : " + member.getLimitPinjamanFalah());
                System.out.println("Jumlah Pinjaman : " + member.getJumlahPinjamanFalah());
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Input Salah");
        }
    }
}
