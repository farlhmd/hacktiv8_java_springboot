package sesi5.session.restoran;

public class Makanan {
    public static void main(String[] args) {
        Restoran data = new Restoran();

        data.setMenu("Ayam Goyeng");
        data.setHarga(17000);
        data.setSpesial(true);

        System.out.println("Menu Makanan : " + data.getMenu());
        System.out.println("Harga        :" + data.getHarga());

        if (data.getSpesial()) {
            System.out.println("(Ini merupakan menu spesial)");
        }
    }
}
