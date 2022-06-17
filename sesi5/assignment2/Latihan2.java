package sesi5.assignment2;

import java.util.Scanner;

public class Latihan2 {

    public static void main(String[] args) {
        int barisPanjang = 0, barisLebar = 0;
        String[][] siswa = new String[0][0];
        String siswaBaru = "";
        Scanner inputanUser = new Scanner(System.in);

        System.out.print("Masukkan panjang(kebawah) yang diinginkan   : ");
        barisPanjang = inputanUser.nextInt();

        System.out.print("Masukkan lebar(kesamping) yang diinginkan   : ");
        barisLebar = inputanUser.nextInt();

        siswa = new String[barisPanjang][barisLebar];

        // untuk menginput siswa sesuai dengan urutan bangku.
        for (int i = 0; i < barisPanjang; i++) {
            for (int j = 0; j < barisLebar; j++) {
                System.out.print("Siswa yang akan ditempatkan di barisan (" + i + "," + j + "): ");
                siswaBaru = inputanUser.nextLine();
                siswa[i][j] = siswaBaru;
            }
        }

        // cetak urutan bangku sesuai ketentuan soal.
        System.out.println("\nUrutan yang dihasilkan sebagai berikut:");
        System.out.print("==============================");
        for (int i = 0; i < siswa.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < siswa[i].length; j++) {
                System.out.print(siswa[i][j] + " |");
            }
        }
        System.out.println("\n==============================");
        inputanUser.close();
    }
}
