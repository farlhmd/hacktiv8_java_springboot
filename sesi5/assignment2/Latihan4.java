package sesi5.assignment2;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        int tahunDiinput = 0;
        boolean kabisatKah = false;

        Scanner inputanUser = new Scanner(System.in);

        System.out.print("Silahkan menginput tahun yang ingin di cek: ");
        tahunDiinput = inputanUser.nextInt();

        if (tahunDiinput % 4 == 0) {
            kabisatKah = true;
        }

        if (kabisatKah) {
            System.out.println("Tahun " + tahunDiinput + " merupakan tahun kabisat");
        } else {
            System.out.println("Tahun " + tahunDiinput + " bukan tahun kabisat");
        }

        inputanUser.close();
    }
}
