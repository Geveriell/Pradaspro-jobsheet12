import java.util.Scanner;

public class Kafe0007 {

    // fungsi Menu
    public static void Menu() {
        System.out.println("=== MENU KAFE ===");
        System.out.println("1. Kopi        - Rp 10000");
        System.out.println("2. Teh         - Rp 8000");
        System.out.println("3. Roti        - Rp 12000");
        System.out.println("4. Nasi Goreng - Rp 20000");
        System.out.println("=========================");
    }

    // fungsi nilai kembalian
    public static int hitungTotalHarga07(int pilihanMenu, int banyakPesanan) {
        int[] harga = {0, 10000, 8000, 12000, 20000};

        if (pilihanMenu < 1 || pilihanMenu > 4) {
            System.out.println("Menu tidak valid!");
            return 0;
        }

        int total = harga[pilihanMenu] * banyakPesanan;
        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Menu(); 

        System.out.print("Pilih menu: ");
        int pilihan = sc.nextInt();
        System.out.print("Jumlah pesanan: ");
        int jumlah = sc.nextInt();
        int totalBayar = hitungTotalHarga07(pilihan, jumlah);
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
    }
}
