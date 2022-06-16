package sesi5.assignment2;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        int totalBelanja = 0;
        boolean diskonKah = false;

        Scanner inputanUser = new Scanner(System.in);

        System.out.print("Masukkan total belanja: ");
        totalBelanja = inputanUser.nextInt();

        // cek total belanja user apakah besar dari 1.000.000
        if (totalBelanja >= 1000000) {
            diskonKah = true;
        }
        // cek apakah user mendapatkan diskon atau tidak
        if (diskonKah) {
            totalBelanja = totalBelanja * 90/100;
            System.out.println("\nAnda mendapatkan diskon 10%! ");
            System.out.println("Total yang dibayarkan = " + totalBelanja);
        } else {
            System.out.println("Total yang dibayarkan = " + totalBelanja);
        }

        inputanUser.close();
    }
}
