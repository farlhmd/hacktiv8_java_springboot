package sesi3.assignment1;

import java.util.Scanner;

public class PenjumlahanXY {
    public static void main(String[] args) {
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
        Scanner inputanUser = new Scanner(System.in);

        System.out.print("Masukkan nilai y1: ");
        y1 = inputanUser.nextInt();

        System.out.print("Masukkan nilai y2: ");
        y2 = inputanUser.nextInt();

        x1 = (y1 + y2) * (y1 + y2);
        x2 = (y1 % 4) * y2;

        System.out.println("Nilai x1 adalah " + x1);
        System.out.println("Nilai x2 adalah " + x2);

        inputanUser.close();
    }
}
