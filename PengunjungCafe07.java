public class PengunjungCafe07 {

    //varargs
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("=== Daftar Pengunjung ===");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println((i + 1) + ". " + namaPengunjung[i]);
        }
        System.out.println("==========================");
    }

    public static void main(String[] args) {

        daftarPengunjung("Budi", "Siti");

        daftarPengunjung("Andi");
        daftarPengunjung("Rina", "Dewi", "Fahri", "Gilang");
    }
}