package src.sesi2;

import java.util.Scanner;

public class LampuLaluLintas {
    public static void main(String[] args) {
        String lampu = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Input warna lampu saat ini: ");
        lampu = scan.nextLine();
        scan.close();
        switch (lampu) {
            case "merah", "Merah", "MERAH":
                System.out.println("Lampu merah, berhenti");
                break;
            case "kuning", "KUNING", "Kuning":
                System.out.println("Lampu kuning, harap hati-hati");
                break;
            case "hijau", "Hijau", "HIJAU":
                System.out.println("Lampu hijau, silakan jalan");
                break;
            default:
                System.out.println("Warna lampu salah!");
                break;
        }
    }
}