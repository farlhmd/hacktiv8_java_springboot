package src.sesi1.src;

public class SwitchLama{

    public static void main(String[] args) {

        String hari = "Jum'at";
        String hasil = "";

        switch (hari) {
            case "Senin":
            case "Selasa":
            case "Rabu":
            case "Kamis":
            
            case "Jum'at": {
                hasil = "Hari ini harus shalat Jum'at ";
                break;
            }

            case "Sabtu", "Minggu":{
                hasil = "Asikk liburann";
                break;
            }
            default:
                break;
        }
        System.out.println(hasil);
    }
}