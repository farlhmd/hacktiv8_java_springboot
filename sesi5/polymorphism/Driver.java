package sesi5.polymorphism;

public class Driver {
    public static void main(String[] args) {
        AnakUmur1Tahun i = new AnakUmur1Tahun();

        i.anakSiapa();
        i.ngapain();

        parent a1 = new AnakUmur1Tahun();
        a1.ngapain();

        AktifitasPagi a2 = new AnakUmur1Tahun();
        a2.sukaApa();
    }
}
