package Pertemuan10;
import java.util.Scanner;

public class Tugas3_22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int jmlToko;
        int jmlBarang = 0;
        int jmlPelanggan;
    
        int totalBarang = 0;
    
        int banyakBarangToko = 0;
        int maxBarang = -1;
        int nomorTokoTerbanyak = 0;

        do {
            System.out.print("Masukkan jumlah toko : ");
            jmlToko = sc.nextInt();
            if (jmlToko < 1) {
                System.out.println("Toko harus minimal 1 !");
            }
        } while (jmlToko < 1);

        for (int i = 1; i <= jmlToko; i++) {
            do {
                System.out.print("\nMasukkan jumlah pelanggan toko ke " + i + " : ");
                jmlPelanggan = sc.nextInt();
                if (jmlPelanggan < 0) {
                    System.out.println("pelanggan tidak boleh negatif !");
                }
            } while (jmlPelanggan < 0);

            for (int j = 1; j <= jmlPelanggan; j++) {
                do {
                    System.out.print(" - Masukkan jumlah barang pelanggan ke " + j + " : ");
                    jmlBarang = sc.nextInt();
                    if (jmlBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif");
                    }
                } while (jmlBarang < 0);
                totalBarang += jmlBarang;
                banyakBarangToko += jmlBarang;
            }
            
            System.out.println("Toko " + i + " - pelanggan: " + jmlPelanggan + ", total barang: " + banyakBarangToko);
            
            if (i == 1 || banyakBarangToko > maxBarang) {
                maxBarang = banyakBarangToko;
                nomorTokoTerbanyak = i;
            }

            banyakBarangToko = 0;

        }
        System.out.println();
        System.out.println("Total barang seluruh toko: " + totalBarang);
        System.out.println("Toko dengan barang terbanyak: " + nomorTokoTerbanyak);
        sc.close();
    }
}  