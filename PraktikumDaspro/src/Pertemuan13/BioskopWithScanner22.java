package Pertemuan13;
import java.util.Scanner;

public class BioskopWithScanner22 {
    public static void main(String[] args) {
    Scanner ozo = new Scanner(System.in);

    int baris, kolom;
    String nama, pilihan;

    String[][] penonton = new String[4][2];

    while (true) {
        System.out.print("Masukkan nama: ");
        nama = ozo.nextLine();
        System.out.print("Masukkan baris: ");
        baris = ozo.nextInt();
        System.out.print("Masukkan kolom: ");
        kolom = ozo.nextInt();
        ozo.nextLine();

        penonton[baris-1][kolom-1] = nama;

        System.out.print("Input penonton lainnya? (y/n): ");
        pilihan = ozo.nextLine();

        if (pilihan.equalsIgnoreCase("n")) {
            break;
        }
    }
    ozo.close();
    }
}
