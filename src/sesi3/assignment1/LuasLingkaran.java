package sesi3.assignment1;

import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        
        final double besarnyaPi = 3.14; //besaran pi 'final'(konstanta) karena sudah angka yang ditetapkan.
        double luasLingkaran = 0; 
        int r = 0;
        Scanner inputanUser = new Scanner(System.in);

        System.out.println("Besar jari-jari lingkaran: ");
        r =inputanUser.nextInt();
        
        luasLingkaran = besarnyaPi * r * r; //definisi rumus lingkaran diletakkan disini agar variabel 'r' yang terbaca merupakan hasil input, bukan dari deklarasi awal (0).

        System.out.println(luasLingkaran);

        inputanUser.close();
    }
}
