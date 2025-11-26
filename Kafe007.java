public class Kafe007 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {

        System.out.println("=== MENU KAFE ===");
        System.out.println("Selamat datang, " + namaPelanggan);

        if (isMember) {
            System.out.println("Status: Member (Diskon 10%)");
        } else {
            System.out.println("Status: Non-member");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Promo: Diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Promo: Diskon 30%");
        } else {
            System.out.println("Promo: Kode promo invalid");
        }
    }

    public static void main(String[] args) {
        Menu("Budi", true, "DISKON50");
        Menu("Andi", true, "DISKON30");
        Menu("ratna", false, "0");
    }
}
