package Pertemuan10;
import java.util.Scanner;

public class Tugas2_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, hasilKali, jumlahTotal = 0;

        do {
            System.out.print("Masukkan nilai n: ");
            n = sc.nextInt();
            if (n < 3) {
                System.out.println("Minimal nilai n adalah 3. Ulangi input!");
            } else {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        hasilKali = i * j;
                        System.out.printf("%4d", hasilKali); 

                        jumlahTotal += hasilKali;
                    }
                    System.out.println();
                }
            }
        } while (n < 3);

        System.out.println("Jumlah seluruh angka: " + jumlahTotal);

        sc.close();
    }
}
