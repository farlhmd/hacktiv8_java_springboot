package day_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListJava{
    public static void main(String[] args) {
        //When To Use
        //Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.

        ArrayList<String> listPertama = new ArrayList<>();
        LinkedList<String> listKedua = new LinkedList<>();

        //add list pertama
        listPertama.add("BMW");
        listPertama.add("Mercedes");
        listPertama.add("Volvo");
        listPertama.add("Mazda");
        listPertama.add("Honda");
        //show list pertama
        System.out.println("List pertama (format ArrayList) merupakan kumpulan merk mobil:\n" + listPertama);
        //akses bagian dari list
        System.out.println("Urutan list ke 3: "+listPertama.get(2));


        //add list kedua
        listKedua.add("MacOs");
        listKedua.add("Windows");
        listKedua.add("Ubuntu");
        listKedua.add("iOS");
        listKedua.add("Android");
        System.out.println("List kedua (format LinkedList) merupakan kumpulan jenis Operating System:\n" + listKedua);

        //function dari LinkedList
        listKedua.addFirst("Unix");
        listKedua.addLast("Manjaro");

        System.out.println("Menambahkan data pada awal dan akhir dari list kedua:\n" + listKedua);

        listKedua.removeFirst();
        listKedua.removeLast();

        System.out.println("Menghapus data awal dan akhir dari list kedua:\n" + listKedua);


    }
}