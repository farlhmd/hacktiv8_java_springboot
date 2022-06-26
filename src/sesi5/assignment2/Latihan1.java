package sesi5.assignment2;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        int bilPertama = 0, bilKedua = 0, bilKetiga = 0, bilTerbesar = 0, bilTerkecil = 0;
        double rataRata = 0.0;
        Scanner inputanUser = new Scanner(System.in);

        System.out.println("Program Menentukan Bilangan Terbesar, Terkecil dan Rata-Rata");
        System.out.println("------------------------------------------------------------");

        System.out.print("Masukkan bilangan pertama : ");
        bilPertama = inputanUser.nextInt();

        System.out.print("Masukkan bilangan kedua   : ");
        bilKedua = inputanUser.nextInt();

        System.out.print("Masukkan bilangan ketiga  : ");
        bilKetiga = inputanUser.nextInt();

        // menentukan rata-rata 3 bilangan
        rataRata = (bilPertama + bilKedua + bilKetiga) / 3;

        // memastikan tidak ada angka yang sama
       // if (!(bilPertama == bilKedua || bilKedua == bilKetiga || bilPertama == bilKetiga)) {

            // mencari nilai terbesar
            if (bilPertama > bilKedua && bilPertama > bilKetiga) {
                bilTerbesar = bilPertama;
            } else if (bilKedua > bilKetiga) {
                bilTerbesar = bilKedua;
            } else {
                bilTerbesar = bilKetiga;
            }

            // mencari nilai terkecil
            if (bilPertama < bilKedua && bilPertama < bilKetiga) {
                bilTerkecil = bilPertama;
            } else if (bilKedua < bilKetiga) {
                bilTerkecil = bilKedua;
            } else {
                bilTerkecil = bilKetiga;
            }
        // }else{
        //     System.out.println("Ada angka yang sama, silahkan ulangi.");
        // }


        System.out.println("\nHasil:");
        System.out.println("Rata-rata dari ketiga bilangan adalah                   : " + rataRata);
        System.out.println("Bilangan 'terbesar' dari tiga bilangan tersebut adalah  : " + bilTerbesar);
        System.out.println("Bilangan 'terkecil' dari tiga bilangan tersebut adalah  : " + bilTerkecil);



        inputanUser.close();
    }
}