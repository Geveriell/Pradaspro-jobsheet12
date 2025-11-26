import java.util.Scanner;

public class HitungBalok07 {

    public static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double hitungVolume(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        double p = sc.nextDouble();

        System.out.print("Masukkan lebar: ");
        double l = sc.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double t = sc.nextDouble();

        double luas = hitungLuas(p, l);
        double volume = hitungVolume(p, l, t);

        System.out.println("Luas persegi panjang = " + luas);
        System.out.println("Volume balok = " + volume);
    }
}
