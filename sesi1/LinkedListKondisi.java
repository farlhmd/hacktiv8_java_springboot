package sesi1;

import java.util.LinkedList;


public class LinkedListKondisi {
    public static void main(String[] args) {
        LinkedList<String> mobil = new LinkedList<>();
        mobil.add("BMW");
        mobil.add("Mercedes");
        mobil.add("Volvo");
        mobil.add("Mazda");
        mobil.add("Honda");

        //System.out.println(mobil);

        if (mobil.isEmpty()) {
            System.out.println("List mobil kosong");
        }else{
            System.out.println("Data mobil terisi, total data mobil: " + mobil.size() + ".\n");
        }

        if (mobil.contains("Honda")) {
            System.out.println("Mobil yang anda cari \'Honda' ditemukan.");
        }else{
            System.out.println("Mobil yang anda cari tidak ditemukan.");
        }
    }
}
