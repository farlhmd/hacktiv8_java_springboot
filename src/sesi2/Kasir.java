package src.sesi2;

import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        int belanjaan = 0, diskon = 0, bayar = 0;
        String kartu = "";
        Scanner scan = new Scanner(System.in);


        System.out.println("Apakah anda punya member?");
        kartu = scan.nextLine();
        System.out.println("Total belanja");
        belanjaan = scan.nextInt();
        scan.close();

        if (kartu.equalsIgnoreCase("ya")) {
            if (belanjaan > 500000) {
                diskon = 50000;
            } else if (belanjaan > 100000){
                diskon = 15000;
            } else {
                diskon = 0;
            }
        }
        bayar = belanjaan - diskon;

        System.out.println("Total Bayar: Rp." + bayar);
    }
}
