package sesi3.assignment1;

import java.util.ArrayList;

public class PerbandinganTrueFalse {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        int c = 12;
        int d = 5;
        ArrayList<Boolean> listBoolean = new ArrayList<>(); // deklarasi array untuk menampung nilai test.

        // dibawah ini melakukan pencarian nilai boolean, dan kemudian menginput nilai tersebut dalam arraylist.
        boolean test1 = a > b;
        listBoolean.add(test1); 

        boolean test2 = b < c;
        listBoolean.add(test2); 

        boolean test3 = a >= d;
        listBoolean.add(test3); 

        boolean test4 = d <= b;
        listBoolean.add(test4); 

        boolean test5 = a == 2*d;
        listBoolean.add(test5); 

        boolean test6 = a != b;
        listBoolean.add(test6); 

        boolean test7 = a > c;
        listBoolean.add(test7); 

        boolean test8 = b <= d;
        listBoolean.add(test8); 

        boolean test9 = c == d;
        listBoolean.add(test9); 

        boolean test10 = 3*b != 2*c;
        listBoolean.add(test10); 

        for (int i = 0; i < listBoolean.size(); i++) {
            System.out.println("Tes ke " + (i + 1) + " = " + listBoolean.get(i)); // perulangan untuk menampilkan nilai test satu per satu.
        }
    }
}
