package sesi3;

import java.util.Scanner;

public class PrintBintang {
    public static void main(String[] args) {

        int tinggiBintang = 0, lebarBintang = 0;
        Scanner inputanUser = new Scanner(System.in);

        System.out.print("Masukkan tinggi bintang yang diinginkan: (dari atas ke bawah) ");
        tinggiBintang = inputanUser.nextInt();
        System.out.print("Masukkan lebar bintang yang diinginkan: (dari kiri ke kanan) ");
        lebarBintang = inputanUser.nextInt();

        for (int i = 0; i < tinggiBintang; i++) {
            System.out.print("\n");
            for (int j = 0; j < lebarBintang; j++) {
                System.out.print("*");
            }
        }

        inputanUser.close();
    }
}
