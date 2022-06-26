package src.sesi2;

public class KondisionalLogic {
   public static void main(String[] args) {
    int bilangan1 = 10, bilangan2 = 5, hasil = 0;


    hasil = bilangan1 & bilangan2;
    System.out.println("bilangan 1 & bilangan 2 (and) menghasilkan = " + hasil);

    hasil = bilangan1 | bilangan2;
    System.out.println("bilangan 1 | bilangan 2 (or) menghasilkan = " + hasil);

    hasil = bilangan1 ^ bilangan2;
    System.out.println("bilangan 1 ^ bilangan 2 menghasilkan = " + hasil);

    hasil = -bilangan1;
    System.out.println("-bilangan 1 menghasilkan = " + hasil);

    hasil = bilangan1 << bilangan2;
    System.out.println("bilangan 1 << bilangan 2 menghasilkan = " + hasil);

    hasil = bilangan1 >> bilangan2;
    System.out.println("bilangan 1 & bilangan 2 menghasilkan = " + hasil);

    hasil = bilangan1 >>> bilangan2;
    System.out.println("bilangan 1 & bilangan 2 menghasilkan = " + hasil);


    boolean x = true, y = false;

    System.out.println("x && y = " + (x&&y));
    System.out.println("x || y = " + (x||y));
    System.out.println("!(x && y) = " + !(x&&y));
    
   }

   

   

}
