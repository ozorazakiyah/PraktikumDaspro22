package Pertemuan12;
import java.util.Scanner;;

public class SearchNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak nilai mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int[] nilai = new int[jumlahMhs];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan value key: ");
        int key = sc.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan");
        }
        sc.close();
    }   
}
