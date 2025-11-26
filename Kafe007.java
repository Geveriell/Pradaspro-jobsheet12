public class Kafe007 {

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("=== MENU KAFE ===");
        System.out.println("Selamat datang, " + namaPelanggan);
        if (isMember) {
            System.out.println("Status: Member (Diskon 10%)");
        } else {
            System.out.println("Status: Non-member");
        }
        System.out.println("1. Kopi        - Rp 10.000");
        System.out.println("2. Teh         - Rp 8.000");
        System.out.println("3. Roti        - Rp 12.000");
        System.out.println("4. Nasi Goreng - Rp 20.000");
        System.out.println("=====================");
    }

    public static void main(String[] args) {
        Menu("Budi", true);
    }
}
