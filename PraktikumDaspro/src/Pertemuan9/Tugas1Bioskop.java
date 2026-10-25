package Pertemuan9;
import java.util.Scanner;

public class Tugas1Bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalHarga, hargaTiket = 50000;
        int tiket, tiketTerjual = 0;
        int totalPenjualan = 0;
        double diskon, hargaDiskon;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik '0' untuk selesai): ");
            tiket = sc.nextInt();
            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan ulang!");
                continue;
            }
            if (tiket == 0) {
                System.out.println("Transaksi berhenti.");
                break;
            }

            if (tiket > 10){
                diskon = 0.15; 
            } else if (tiket > 4){
                diskon = 0.10;
            } else {
                diskon = 0;
            }
            
        totalHarga = tiket * hargaTiket;
        hargaDiskon = totalHarga * diskon;
        totalHarga = totalHarga - (int) hargaDiskon;

        tiketTerjual += tiket;
        totalPenjualan += totalHarga;

        System.out.println("Jumlah tiket: " + tiket);
        System.out.println("Diskon: " + (diskon*100) + "%");
        System.out.println("Total bayar: " +  totalHarga);

        } while (true);
        System.out.println("LAPORAN PENJUALAN");
        System.out.println("Total tiket terjual: " + tiketTerjual);
        System.out.println("Total penjualan sehari: " + totalPenjualan);
    }
    
}
