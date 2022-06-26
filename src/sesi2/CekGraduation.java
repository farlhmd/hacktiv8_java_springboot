package sesi2;

import java.util.Scanner;

public class CekGraduation {
    public static void main(String[] args) {
        int nilai = 0;
        String nama;
        Scanner scan = new Scanner(System.in);

        System.out.println("Nama: ");
        nama = scan.nextLine();
        System.out.println("Nilai: ");
        nilai = scan.nextInt();
        scan.close();

        if (nilai >= 70) {
            System.out.println("Selamat " + nama + ", anda lulus!");
        }else{
            System.out.println("Maaf " + nama + ", anda gagal");
        }
    }
}
