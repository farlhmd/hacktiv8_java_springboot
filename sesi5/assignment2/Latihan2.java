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

        for (int i = 0; i < barisPanjang; i++) {
            for (int j = 0; j < barisLebar; j++) {
                System.out.print("Siswa yang akan ditempatkan di barisan (" + i + "," + j + "): ");
                siswaBaru = inputanUser.nextLine();
                siswa[i][j] = siswaBaru;
            }
        }
        // dummy data
        // siswa[0][0] = "Henlo";
        // siswa[0][1] = "Hola";
        // siswa[1][0] = "hellno";
        // siswa[1][1] = "ohshit";

        for (int i = 0; i < siswa.length; i++) {
            for (int j = 0; j < siswa[i].length; j++) {
                 System.out.print("(" + i + "," + j + "): " + siswa[i][j]);
            }
        }
        inputanUser.close();
    }
}
