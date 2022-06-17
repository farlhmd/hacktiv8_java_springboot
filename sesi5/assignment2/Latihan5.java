package sesi5.assignment2;

import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {

     //   TokoElektronik data = new TokoElektronik();
        Scanner inputanUser = new Scanner(System.in);

        // String[] listBarang = new String[5];
        // double[] hargaBarang = new double[5];
        // double[] diskonBarang = new double[5];
        int jenisDibeli = 0;

        double totalHarga = 0;
        int[] jumlahDibeli = new int[5];
        String[] barangKe = new String[5];
        int[] kodeBarang = new int[5];
        int[] hargaKe = new int[5];
        double[] diskon = new double[5];
        double[] totalSatuan = new double[5];
        System.out.println("Point of Sale sederhana dengan JAVA");
        System.out.println("------------------------------------------------------");
        System.out.println("| Kode | Barang                | Harga      | Diskon |");
        System.out.println("------------------------------------------------------");
        System.out.println("|   1  | Mouse Bluetooth 5.0   | Rp.149.999 |   10%  |");
        System.out.println("|   2  | Headphone Eksternal   | Rp.246.000 |   5%   |");
        System.out.println("|   3  | Power Bank 10.000 mAh | Rp.136.000 |   -    |");
        System.out.println("|   4  | Tripod Kamera         | Rp.267.999 |   20%  |");
        System.out.println("|   5  | Smart Watch Xiaomi    | Rp.899.000 |   10%  |");
        System.out.println("------------------------------------------------------");

        System.out.print("Berapa jenis barang yang anda beli :");
        jenisDibeli = inputanUser.nextInt();

        for (int i = 0; i < jenisDibeli; i++) {

            System.out.print("Masukkan kode barang ke-" + (i + 1) + ": ");
            kodeBarang[i] = inputanUser.nextInt();
            System.out.print("Masukkan jumlah dibeli barang ke-" + (i+1) + ": ");
            jumlahDibeli[i] = inputanUser.nextInt();
            System.out.println("");

            switch (kodeBarang[i]) {
                case 1:
                    barangKe[i] = "Mouse Bluetooth 5.0";
                    hargaKe[i] = 149999;
                    diskon[i] = 0.1;
                    break;
                case 2:
                    barangKe[i] = "Headphone Eksternal";
                    hargaKe[i] = 246000;
                    diskon[i] = 0.05;
                    break;
                case 3:
                    barangKe[i] = "Power Bank 10.000 mAh";
                    hargaKe[i] = 136000;
                    diskon[i] = 0;
                    break;
                case 4:
                    barangKe[i] = "Tripod Kamera        ";
                    hargaKe[i] = 267999;
                    diskon[i] = 0.2;
                    break;
                case 5:
                    barangKe[i] = "Smart Watch Xiaomi   ";
                    hargaKe[i] = 899000;
                    diskon[i] = 0.1;
                    break;
                default:
                    System.out.println("Pilihan salah. Pilih 1-5");

                    
                    
               
            }

        }
        System.out.println("Daftar Belanja:");
        System.out.println("---------------------------------------------------------------");
        for (int i=0; i<jenisDibeli;i++){ 
            totalSatuan[i]=((jumlahDibeli[i]*hargaKe[i])-(jumlahDibeli[i]*hargaKe[i]*diskon[i]));
            totalHarga+=totalSatuan[i];
             System.out.println(i+1+"    "+barangKe[i]+"   "+hargaKe[i]+"    "+jumlahDibeli[i]+"     "+(int)(diskon[i]*100)+"%"+"     "+totalSatuan[i]); 
         }
         System.out.println("---------------------------------------------------------------");
         System.out.println("\n -------------------------------------");
         System.out.println("| Total yang harus dibayar : "+ totalHarga + " |");
         System.out.println(" -------------------------------------");

        inputanUser.close();
    }
}
