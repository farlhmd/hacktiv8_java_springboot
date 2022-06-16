package sesi5.polymorphism;

abstract class Manusia {
    protected abstract void nyanyiLagu();
}

class Cowok extends Manusia{
    @Override
    protected void nyanyiLagu() {
        System.out.println("dom torom tom tom dom");
    }
}

class Cewek extends Manusia{
    @Override
    protected void nyanyiLagu() {
        System.out.println("Ladadi ladada lawada");
    }
}

public class Cetak{
    public static void main(String[] args) {
        Manusia cowok = new Cowok();
        cowok.nyanyiLagu();

        Manusia cewek = new Cewek();
        cewek.nyanyiLagu();
    }
}