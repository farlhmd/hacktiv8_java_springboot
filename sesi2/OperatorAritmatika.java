package sesi2;

import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args) {
        int angka1, angka2, hasil;
        String operatorDigunakan, pilihanOperator;

        Scanner inputanAngka = new Scanner(System.in);
        Scanner inputanOperator = new Scanner(System.in);

        System.out.println("Input angka pertama: ");
        angka1 = inputanAngka.nextInt();
        System.out.println("Input angka kedua: ");
        angka2 = inputanAngka.nextInt();

        System.out.println("Silahkan pilih Operator:");
        System.out.println("a. Penjumlahan");
        System.out.println("b. Pengurangan");
        System.out.println("c. Perkalian");
        System.out.println("d. Pembagian");
        pilihanOperator = inputanOperator.nextLine();

        switch (pilihanOperator) {
            case "a", "A":
            hasil = angka1 + angka2;
            operatorDigunakan = "penjumlahan";
            System.out.println("Hasil " + operatorDigunakan + " adalah " + hasil);
            break;
            case "b", "B":
            hasil = angka1 - angka2;
            operatorDigunakan = "pengurangan";
            System.out.println("Hasil " + operatorDigunakan + " adalah " + hasil);
            break;
            case "c", "C":
            hasil = angka1 * angka2;
            operatorDigunakan = "perkalian";
            System.out.println("Hasil " + operatorDigunakan + " adalah " + hasil);
            break;
            case "d", "D":
            hasil = angka1 / angka2;
            operatorDigunakan = "pembagian";
            System.out.println("Hasil " + operatorDigunakan + " adalah " + hasil);
            break;
        
            default:
            System.out.println("Inputan salah. Hanya a,b,c,d. Silahkan ulangi kembali.");
        }

        
       
        
        
        
    }
}
