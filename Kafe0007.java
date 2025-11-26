import java.util.Scanner;

public class Kafe0007 {

     // fungsi Menu
    public static void Menu() {
        System.out.println("=== MENU KAFE ===");
        System.out.println("1. Kopi - Rp 10.000");
        System.out.println("2. Teh - Rp 8.000");
        System.out.println("3. Roti - Rp 12.000");
        System.out.println("4. Nasi Goreng - Rp 20.000");
        System.out.println("=========================");
    }

    public static int hitungTotalHarga07(int pilihanMenu, int banyakPesanan, String kodePromo) {
        int[] harga = {0, 10000, 8000, 12000, 20000};

        if (pilihanMenu < 1 || pilihanMenu > 4) {
            System.out.println("Menu tidak valid!");
            return 0;
        }

        int total = harga[pilihanMenu] * banyakPesanan;
        int potongan = 0;

        if (kodePromo.equals("DISKON50")) {
            potongan = total / 2;
            System.out.println("Promo DISKON50 diterapkan!");
        } else if (kodePromo.equals("DISKON30")) {
            potongan = total * 30 / 100;
            System.out.println("Promo DISKON30 diterapkan!");
        } else {
            System.out.println("Kode promo invalid. Tidak ada diskon.");
        }

        return total - potongan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu(); 

        System.out.print("Pilih menu: ");
        int pilihan = sc.nextInt();
        System.out.print("Jumlah pesanan: ");
        int jumlah = sc.nextInt();

        int totalBayar = hitungTotalHarga07(pilihan, jumlah, "DISKON30");

        System.out.println("Total yang harus dibayar: Rp " + totalBayar);

        sc.close();
    }
}
