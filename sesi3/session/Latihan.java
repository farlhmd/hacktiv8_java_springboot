package sesi3.session;

import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        MainMenu();
    }

    private static void MainMenu() {
        String inputanUser = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Silakan pilih program:");
        System.out.println("A. Menampilkan Bintang");
        System.out.println("B. Menampilkan Nilai 1-10");
        System.out.println("C. Menampilkan Bilangan Ganjil");
        System.out.println("D. Exit");
        inputanUser = scan.nextLine();

        switch (inputanUser) {
            case "a", "A":
                PrintBintang();
                break;
            case "b", "B":
                TampilkanNilai();
                break;
            case "c", "C":
                BilanganGanjil();
                break;
            case "d", "D":
                System.out.println("Terima kasih telah menggunakan program ini.");
                break;
            default:
                System.out.println("Inputan salah. silahkan pilih 'a', 'b, 'c' atau 'd'");
                MainMenu();
                break;
        }
        scan.close();
    }

    private static void BilanganGanjil() {
        int nilaiDitampilkan = 0;
        Scanner inputanUser = new Scanner(System.in);

        System.out.print("Ingin menampilkan angka ganjil dari 1 hingga berapa? ");
        nilaiDitampilkan = inputanUser.nextInt();

        for (int i = 1; i <= nilaiDitampilkan; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        inputanUser.close();
    }

    private static void TampilkanNilai() {
        int nilaiDitampilkan = 0;
        Scanner inputanUser = new Scanner(System.in);

        System.out.print("Ingin menampilkan angka 1 hingga berapa? ");
        nilaiDitampilkan = inputanUser.nextInt();

        for (int i = 1; i <= nilaiDitampilkan; i++) {
            System.out.print(i + " ");
        }

        inputanUser.close();
    }

    private static void PrintBintang() {
        int tinggiBintang = 0, lebarBintang = 0;
        Scanner inputanUser = new Scanner(System.in);

        System.out.print("Masukkan tinggi bintang yang diinginkan (dari atas ke bawah): ");
        tinggiBintang = inputanUser.nextInt();
        System.out.print("Masukkan lebar bintang yang diinginkan (dari kiri ke kanan): ");
        lebarBintang = inputanUser.nextInt();

        for (int i = 0; i < tinggiBintang; i++) {
            System.out.println("");
            for (int j = 0; j < lebarBintang; j++) {
                System.out.print("*");
            }
        }
        inputanUser.close();
    }
}
