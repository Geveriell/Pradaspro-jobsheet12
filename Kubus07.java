import java.util.Scanner;

public class Kubus07 {

    // menghitung volume kubbus
    public static double hitungVolumeKubus(double sisi) {
        return sisi * sisi * sisi;  // sisi^3
    }

    //menghitung luas permukaan kubus
    public static double hitungLuasPermukaanKubus(double sisi) {
        return 6 * sisi * sisi;     // 6 × sisi^2
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = sc.nextDouble();

        double volume = hitungVolumeKubus(sisi);
        double luasPermukaan = hitungLuasPermukaanKubus(sisi);

        System.out.println("Volume Kubus = " + volume);
        System.out.println("Luas Permukaan Kubus = " + luasPermukaan);
    }
}
