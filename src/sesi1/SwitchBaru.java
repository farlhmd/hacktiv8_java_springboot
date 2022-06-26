package src.sesi1;

public class SwitchBaru {
    public static void main(String[] args) {

        String hari = "Kamis";
        String hasil = switch (hari) {
            case "Senin", "Selasa", "Rabu", "Kamis" -> "Weekday";
            case "Sabtu", "Minggu" -> "Weekend";
            default ->
            {
                if(hari.isEmpty())
                hasil = "Masukkan hari dengan benar";
                else
                hasil = "Sepertinya hari Jum'at";
                throw new IllegalStateException("Invalid day: "+ hasil);
            }
        };
        System.out.println(hasil);

        
    }
}
