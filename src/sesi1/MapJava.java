package src.sesi1;

import java.util.HashMap;

public class MapJava {
    public static void main(String[] args) {
        HashMap<String, String> ibuKota = new HashMap<String, String>();

        ibuKota.put("Inggris", "London");
        ibuKota.put("Jerman", "Berlin");
        ibuKota.put("Indonesia", "Jakarta");
        ibuKota.put("USA", "Washington DC");

        System.out.println("Ibukota negara: (format Negara=Ibu Kota)\n" + ibuKota);

        //mengakses data dengan 'key'

        System.out.println("Ibu Kota negara Jerman adalah " + ibuKota.get("Jerman"));
    }
    
}
