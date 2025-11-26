public class PengunjungCafe07 {

    // varargs
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("=== Daftar Pengunjung (for-each) ===");
        int nomor = 1;
        for (String nama : namaPengunjung) {
            System.out.println(nomor + ". " + nama);
            nomor++;
        }
    }

    public static void main(String[] args) {

        daftarPengunjung("Budi", "Siti");

        daftarPengunjung("Andi");
        daftarPengunjung("Rina", "Dewi", "Fahri", "Gilang");
    }
}