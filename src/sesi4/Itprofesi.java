package sesi4;

import java.util.Scanner;

public class Itprofesi {
    public static void main(String[] args) {
        String[] itprofesi = new String[5];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < itprofesi.length; i++) {
            System.out.println("Buah ke - " + (i+1) + ": ");
            itprofesi[i] = scan.nextLine();
        }

        System.out.println("---------------------------");

        for (String b : itprofesi) {
            System.out.println(b);
        }
        scan.close();
    }
}
