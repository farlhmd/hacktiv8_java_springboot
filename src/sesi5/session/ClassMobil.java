package sesi5.session;

public class ClassMobil {
   static String pedalRem = "criit";
   static String pedalGas = "brrr";
   static String mesin = "rrhmm";

   public static void main(String[] args) {
      gasDitekan();
      remDitekan();
   }

   private static void remDitekan() {
      System.out.println("Rem ditekan, " + pedalRem);
   }

   private static void gasDitekan() {
      System.out.println("Gas ditekan, goes " + pedalGas);
   }

}
