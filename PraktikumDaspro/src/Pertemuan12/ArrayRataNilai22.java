package Pertemuan12;
import java.util.Scanner;

public class ArrayRataNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak mahasiswa: ");
        // int banyakMhs = sc.nextInt();
        int[] nilaiMhs = new int[sc.nextInt()];

        int total = 0;
        double rata2;
        String status;
        int jmlLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];

            if (nilaiMhs[i] > 70) {
                jmlLulus++;
            }
        }

        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        if (rata2 >= 85) {
            status = "SANGAT BAIK";
        } else if (rata2 >= 70) {
            status = "BAIK"; 
        } else {
            status = "PERLU PENDAMPINGAN";
        }
    
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Predikat kelas: " + status);
        System.out.println("Jumlah mahasiswa lulus: " + jmlLulus);

    }
}
