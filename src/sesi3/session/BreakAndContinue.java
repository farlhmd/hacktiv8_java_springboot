package sesi3.session;

public class BreakAndContinue {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 4; i++) {
            if (i >= 3) {
                System.out.println("hola");
                break;
            }
            System.out.println("Selamat Belajar!");
            if (i >= 2) {
                continue;
            }
            System.out.println("JAVA");
        }
        System.out.println(i);
    }
}
