package sesi3.assignment1;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 0;
        int b = 0; 
        int c = 9; 
        int d = 9;

        System.out.println("Print ke 1");
        System.out.println("A = " + a++); 
        System.out.println("B = " + ++b);
        System.out.println("C = " + c--);
        System.out.println("D = " + --d);

        //jawaban Print ke 2
        System.out.println("Print ke 2");
        System.out.println("A = " + a++); // 'a++' atau post increment, melakukan assign kepada nilai dahulu, baru di tambahkan (jadi nilai 1)
        System.out.println("B = " + ++b); // '++b' atau pre increment,  melakukan penambahan dahulu, sehingga yang akan ditampilkan menjadi (menjadi 2)
        System.out.println("C = " + c--); // 'c--' post increment, nilai 8
        System.out.println("D = " + --d); // '--d' pre increment, nilai 7
        
        //jawaban Print ke 3
        System.out.println("Print ke 3");
        System.out.println("A = " + a++); 
        System.out.println("B = " + ++b);
        System.out.println("C = " + c--);
        System.out.println("D = " + --d);

        //jawaban Print ke 4
        System.out.println("Print ke 4");
        System.out.println("A = " + a++);
        System.out.println("B = " + ++b);
        System.out.println("C = " + c--);
        System.out.println("D = " + --d);

    }
}
