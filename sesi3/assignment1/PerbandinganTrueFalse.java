package sesi3.assignment1;

import java.util.ArrayList;

public class PerbandinganTrueFalse {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        int c = 12;
        int d = 5;
        ArrayList<Boolean> listBoolean = new ArrayList<>(); // deklarasi array untuk menampung nilai test.

        boolean test1 = a > b;
        listBoolean.add(test1); // menambahkan nilai test ke dalam arraylist.

        boolean test2 = b < c;
        listBoolean.add(test2); // menambahkan nilai test ke dalam arraylist.

        boolean test3 = a >= d;
        listBoolean.add(test3); // menambahkan nilai test ke dalam arraylist.

        boolean test4 = d <= b;
        listBoolean.add(test4); // menambahkan nilai test ke dalam arraylist.

        boolean test5 = a == 2*d;
        listBoolean.add(test5); // menambahkan nilai test ke dalam arraylist.

        boolean test6 = a != b;
        listBoolean.add(test6); // menambahkan nilai test ke dalam arraylist.

        boolean test7 = a > c;
        listBoolean.add(test7); // menambahkan nilai test ke dalam arraylist.

        boolean test8 = b <= d;
        listBoolean.add(test8); // menambahkan nilai test ke dalam arraylist.

        boolean test9 = c == d;
        listBoolean.add(test9); // menambahkan nilai test ke dalam arraylist.

        boolean test10 = 3*b != 2*c;
        listBoolean.add(test10); // menambahkan nilai test ke dalam arraylist.

        for (int i = 0; i < listBoolean.size(); i++) {
            System.out.println("Tes ke " + (i + 1) + " = " + listBoolean.get(i)); // perulangan untuk menampilkan nilai test satu per satu.
        }
    }
}
