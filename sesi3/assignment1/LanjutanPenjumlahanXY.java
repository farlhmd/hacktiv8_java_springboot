package sesi3.assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class LanjutanPenjumlahanXY {

    public static void main(String[] args) {
        MainMenu();
    }

    private static void PencarianNilaiY() {
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
        boolean cek1, cek2, cek3;
        ArrayList<Integer> kumpulanY1 = new ArrayList<>();
        ArrayList<Integer> kumpulanY2 = new ArrayList<>();
        Scanner inputanUser = new Scanner(System.in);
        int urutanPilihan = 0;

        for (y1 = 0; y1 <= 10; y1++) {
            for (y2 = 0; y2 <= 10; y2++) {
                // dengan pengulangan untuk mengecek y1 dan y2 dari 0 hingga 10
                x1 = (y1 + y2) * (y1 + y2);
                x2 = (y1 % 4) * y2;
                // System.out.println("y1 = " + y1 + " y2 = " + y2);

                cek1 = x1 > x2;
                cek2 = x1 % 4 == (x2 + 1) % 5;
                cek3 = x2 >= x1;

                if (cek1) {
                    if (cek2) {
                        if (!cek3) {

                            kumpulanY1.add(y1);
                            kumpulanY2.add(y2);

                            // jika ingin menampilkan setiap nilai yang memenuhi kategori:
                            // String pembatas = "-------------------";
                            // System.out.println(pembatas);
                            // System.out.println("Kumpulan yang ke-" + kumpulanY1.size());
                            // System.out.println("\nnilai x1: " + x1);
                            // System.out.println("nilai x2: " + x2);
                            // System.out.println("\nnilai y1: " + y1);
                            // System.out.println("nilai y2 : " + y2);
                            // System.out.println(pembatas);
                        }

                    }

                }
            }
        }
        // System.out.println(kumpulanY1);
        // System.out.println(kumpulanY2);

        System.out.print(
                "Silahkan memilih urutan nilai Y1 dan Y2: (tersedia 1 hingga " + (kumpulanY1.size()-1) + "): ");
        urutanPilihan = inputanUser.nextInt();

        if (urutanPilihan > (kumpulanY1.size()-1)) {
            System.out.println("Pilihan salah, silahkan ulangi kembali.\n");
            MainMenu();
        }else{
        y1 = kumpulanY1.get((urutanPilihan - 1));
        y2 = kumpulanY2.get((urutanPilihan - 1));

        x1 = (y1 + y2) * (y1 + y2);
        x2 = (y1 % 4) * y2;

        System.out.println("Urutan dipilih: " + urutanPilihan);
        System.out.println("\nNilai Y1 = " + y1 + " dan Y2 = " + y2);
        System.out.println("Nilai X1 = " + x1 + " dan X2 = " + x2);
        System.out.println("\nMenghasilkan evaluasi sebagai berikut: ");
        System.out.println("x1 besar sama dengan x2 bernilai '" + (x1 >= x2) + "'");
        System.out.println("x2 besar sama dengan x1 bernilai '" + (x2 >= x1) + "'");
        System.out.println("x1 mod 4 == ++x2 mod 5  bernilai '" + (x1 % 4 == (x2 + 1) % 5) + "'\n");
        }

        inputanUser.close();
    }

    private static void MainMenu() {
        PencarianNilaiY();
    }

}
