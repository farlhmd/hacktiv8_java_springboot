package sesi5.bangunDatar;

public class SegitigaSiku extends BangunDatar {
    float alas, tinggi;
    float sisiMiring;

    @Override
    float luas() {
        float luas = alas * tinggi;
        System.out.println("Luas segitiga siku-siku adalah      : " + luas);
        return luas;
    }

    @Override
    float keliling() {
        float sisiMiring = (float) Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        float kll = alas + tinggi + sisiMiring;
        System.out.println("Keliling segitiga siku-siku adalah  : " + kll + "\n");
        return kll;
    }

}
