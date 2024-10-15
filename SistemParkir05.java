import java.util.Scanner;
public class SistemParkir05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int tarifMobil = 3000;
        final int tarifMotor = 2000;
        final int tarif5jam = 12500;
        int totalPembayaran = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1 untuk Mobil, 2 untuk Motor, 0 untuk keluar): ");
            int jenisKendaraan = sc.nextInt();
            if (jenisKendaraan == 0) {
                break;
            }
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                int durasiParkir = sc.nextInt();
            if (durasiParkir <= 0) {
                System.out.println("Durasi parkir tidak valid! Masukkan durasi yang benar.");
                continue;
            }
                int biayaParkir;
                if (durasiParkir > 5) {
                biayaParkir = tarif5jam;
            } else {
                if (jenisKendaraan == 1) {
                    biayaParkir = tarifMobil * durasiParkir;
                } else if (jenisKendaraan == 2) {
                    biayaParkir = tarifMotor * durasiParkir;
                } else {
                System.out.println("Jenis kendaraan tidak valid. Masukkan 1 untuk Mobil atau 2 untuk Motor.");
                continue;
                }
            }
            totalPembayaran += biayaParkir;
            System.out.println("Biaya parkir untuk kendaraan: Rp " +
            biayaParkir);
        }
        System.out.println("Total pembayaran parkir: Rp " +
        totalPembayaran);
    }
}
