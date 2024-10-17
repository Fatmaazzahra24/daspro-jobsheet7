import java.util.Scanner;

public class TiketBioskop05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahtiket;
        int totalpenjualantiket = 0;
        int totalharga = 0;
        int hargatiket = 50000;

        while (true) { 
            System.out.println("Masukkan jumlah tiket yang akan dibeli (atau -1 untuk keluar):");
            jumlahtiket = sc.nextInt();

            if (jumlahtiket == -1) {
                break;
            }

            if (jumlahtiket < 0) {
                System.out.println("Jumlah tiket tidak boleh negatif. Silakan coba lagi.");
                continue;
            }
            int hargaTiket = hargatiket * jumlahtiket;
            if (jumlahtiket > 10) {
                hargaTiket -= (hargaTiket * 0.15);
            } else if (jumlahtiket > 4) {
                hargaTiket -= (hargaTiket * 0.10); 
            }
            totalpenjualantiket += jumlahtiket;
            totalharga += hargaTiket;

            System.out.println("Harga total untuk " + jumlahtiket + " tiket: Rp " + hargaTiket);
        }
        System.out.println("Total tiket terjual: " + totalpenjualantiket);
        System.out.println("Total penjualan tiket: Rp " + totalharga);
    }
}
