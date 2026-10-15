package Pertemuan7;
import java.util.Scanner;

public class StudiKasus1_22 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int hargaPerCup = 19000;
       int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

       System.out.print("Masukkan jumlah cup yang dibeli: ");
       jumlahCup = input.nextInt();
       System.out.print("Masukkan jumlah uang yang dibayarkan: ");
       uangBayar = input.nextInt();
       
       totalHarga = jumlahCup * hargaPerCup;
       diskon = 0;

       if (totalHarga >= 100000) {
        diskon = totalHarga * 9 /100;
       } else {
       }

       totalBayar = totalHarga - diskon;

       System.out.println("Total harga: " + totalHarga);
       System.out.println("Diskon: " + diskon);
       System.out.println("Total bayar: " + totalBayar);

       if (uangBayar >= totalBayar) {
        kembalian = uangBayar - totalBayar;
        System.out.println("Kembalian anda: " + kembalian);
       } else {
        kurang = totalBayar - uangBayar;
        System.out.println("Uang tidak cukup, kurang Rp." + kurang);
       }
 
    }
    
}
