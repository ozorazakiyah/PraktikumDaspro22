package Pertemuan10;
import java.util.Scanner;

public class Tugas1_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, jumlahBilangan = 0;

        System.out.print("Masukkan nilai n = ");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");   

                jumlahBilangan ++;
            }
           System.out.println();
        }
        System.out.println("Total angka yang tercetak : " + jumlahBilangan);
    }
}
