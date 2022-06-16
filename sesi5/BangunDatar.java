package sesi5;

public class BangunDatar {

    float luas() {
        System.out.println("Luas sebuah bangun datar");
        return 0;
    }

    float keliling() {
        System.out.println("Keliling sebuah bangun datar\n");
        return 0;
    }

    public static void main(String[] args) {
        // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();

        // membuat objek persegi dan mengisi nilai properti
        Persegi persegi = new Persegi();
        persegi.sisi = 2;

        // membuat objek Lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;

        // membuat objek Persegi Panjang dan mengisi nilai properti
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;

        // membuat objek Segitiga dan mengisi nilai properti
        SegitigaSiku mSegitiga = new SegitigaSiku();
        mSegitiga.alas = 5;
        mSegitiga.tinggi = 12;

        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        mSegitiga.luas();
        mSegitiga.keliling();

    }

}
