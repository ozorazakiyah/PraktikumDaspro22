package Pertemuan9;
import java.util.Scanner;

public class Tugas2Parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;

        do {
            System.out.println("Jenis kendaraan 1: Mobil");
            System.out.println("Jenis kendaraan 2: Sepeda");
            System.out.println("Ketik 0 untuk keluar");
            System.out.print("Masukkan jenis kendaraan: ");
            jenis = sc.nextInt();
            
            if (jenis == 0) {
                System.out.println("Program Berhenti.");
                break;
            } 
            if (jenis !=1 && jenis !=2) {
                System.out.println("Jenis tidak valid. Coba lagi!");
                continue;
            }
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir: ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            }
        
        } while (jenis == 0);
        System.out.println("Biaya parkir yang harus dibayar: Rp. " + total);
        
    }
    
}
