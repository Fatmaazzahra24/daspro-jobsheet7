import java.util.Scanner;
public class TiketBioskop05 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int harga_Tiket = 50000;
    int totalTiketTerjual = 0;
    int totalHarga = 0;    
    
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 'selesai' untuk keluar): ");
            String input = sc.next();
            if (input.equalsIgnoreCase("selesai")) {
                break;
            }
            if (!input.matches("\\d+")) {
                System.out.println("Input tidak valid. Masukkan jumlah tiket yang valid.");
                continue;
            }
            int jumlahTiket = Integer.parseInt(input);
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid.Masukkan kembali jumlah tiket.");
                continue;
            }
            int hargaTiket = harga_Tiket * jumlahTiket;
            if (jumlahTiket > 10) {
                hargaTiket -= (hargaTiket * 0.15);
            } else if (jumlahTiket > 4) {
                hargaTiket -= (hargaTiket * 0.10);
            }
            totalTiketTerjual += jumlahTiket;
            totalHarga += hargaTiket;
            System.out.println("Harga total untuk " + jumlahTiket + "tiket: Rp " + hargaTiket);
        }
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan tiket: Rp " + totalHarga);
    }
}
