import java.util.Scanner;

public class Kafe0007 {

    public static void Menu() {
        System.out.println("=== MENU KAFE ===");
        System.out.println("1. Kopi - Rp 10.000");
        System.out.println("2. Teh - Rp 8.000");
        System.out.println("3. Roti - Rp 12.000");
        System.out.println("4. Nasi Goreng - Rp 20.000");
        System.out.println("=========================");
    }

    // hitung total semua
    public static int totalSemuaPesanan07(int[] pilihan, int[] jumlah) {
        int[] harga = {0, 10000, 8000, 12000, 20000};
        int total = 0;

        for (int i = 0; i < pilihan.length; i++) {
            int p = pilihan[i];
            int j = jumlah[i];

            if (p < 1 || p > 4) continue;
            total += harga[p] * j;
        }

        return total;
    }

    // hitung total dengan Dsikon
    public static int hitungSetelahPromo(int total, String kodePromo) {
        int potongan = 0;

        if (kodePromo.equals("DISKON50")) {
            potongan = total / 2;
            System.out.println("Promo DISKON50 diterapkan!");
        } 
        else if (kodePromo.equals("DISKON30")) {
            potongan = total * 30 / 100;
            System.out.println("Promo DISKON30 diterapkan!");
        } 
        else {
            System.out.println("Kode promo invalid.");
        }

        return total - potongan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu();

        System.out.print("Berapa jenis menu : ");
        int n = sc.nextInt();

        int[] pilihan = new int[n];
        int[] jumlah = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Pilih menu ke-" + (i + 1) + ": ");
            pilihan[i] = sc.nextInt();

            System.out.print("Jumlah pesanan menu ke-" + (i + 1) + ": ");
            jumlah[i] = sc.nextInt();
        }

        int totalPesanan = totalSemuaPesanan07(pilihan, jumlah);

        System.out.print("\nMasukkan kode promo: ");
        String kodePromo = sc.next();

        int totalSetelahDiskon = hitungSetelahPromo(totalPesanan, kodePromo);

        System.out.println("Total : Rp " + totalSetelahDiskon);

        sc.close();
    }
}
