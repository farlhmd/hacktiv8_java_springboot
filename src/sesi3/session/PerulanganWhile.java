package sesi3.session;

import java.util.Scanner;

public class PerulanganWhile {
    public static void main(String[] args) {
        mainMenu();

    }

    private static void mainMenu() {
        String jawabanUser = "";
        Scanner inputanUser = new Scanner(System.in);

        System.out.println("Silakan pilih program:");
        System.out.println("A. Contoh");
        System.out.println("B. Latihan");
        System.out.println("C. Exit");

        jawabanUser = inputanUser.nextLine();

        switch (jawabanUser) {
            case "a", "A":
                contoh();
                break;
            case "b", "B":
                latihan();
                break;
            case "c", "C":
                System.out.println("Terima kasih telah menggunakan program ini.");
                break;
            default:
            System.out.println("Inputan salah. silahkan pilih 'a', 'b' atau 'c'");
                mainMenu();
                break;
        }

        inputanUser.close();
    }

    private static void contoh() {
        boolean running = true;
        int counter = 0;
        String jawab = "";
        Scanner inputanUser = new Scanner(System.in);

        while (running) {
            System.out.println("Apakah anda ingin keluar?[y/n]");

            jawab = inputanUser.nextLine();

            if (jawab.equalsIgnoreCase("y")) {
                running = false;
            }
            counter++;
        }
        System.out.println("anda sudah melakukan pengulangan sebanyak " + counter + " kali.");
        inputanUser.close();
    }

    private static void latihan() {
        int i = 0;
        while (i <= 10) {
            System.out.println("Perulangan ke-"+i);
            i++;
        }
    }
}
