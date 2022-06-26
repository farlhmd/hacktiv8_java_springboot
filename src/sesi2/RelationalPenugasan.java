package src.sesi2;

public class RelationalPenugasan {
    public static void main(String[] args) {
       int bilangan1 = 11, bilangan2 = 2;

       bilangan1 += bilangan2;
       System.out.println("Penambahan: " + bilangan1);
       bilangan1 -= bilangan2;
       System.out.println("Pengurangan: " + bilangan1);
       bilangan1 *= bilangan2;
       System.out.println("Perkalian: " + bilangan1);
       bilangan1 /= bilangan2;
       System.out.println("Pembagian: " + bilangan1);
       bilangan1 %= bilangan2;
       System.out.println("Sisa Bagi: " + bilangan1);
    }
}
