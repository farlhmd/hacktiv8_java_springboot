package sesi7;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int x, y;

            System.out.println("------------------------------------------------------------");
            System.out.print("Masukan jumlah data : ");
            int jumData = scan.nextInt();
            

            int[] data = new int[jumData];
            System.out.println();
            for (x = 0; x < jumData; x++) {
                System.out.print("Inputkan data ke - " + (x + 1) + " : ");
                data[x] = scan.nextInt();
                
            }
            scan.close();
            // Tampilan data sebelum sorting
            System.out.println();
            System.out.println("Data sebelum disorting : ");
            for (x = 0; x < jumData; x++) {
                System.out.print(data[x] + " ");
            }

            // Proses selection sort
            System.out.println("\n\nProses Selection Sort");
            for (x = 0; x < jumData; x++) {
                System.out.print("Iterasi ke-" + (x + 1) + " : ");
                for (y = 0; y < jumData; y++) {
                    System.out.print(data[y] + " ");
                }

                boolean tukar = false;
                int index = 0;
                int min = data[x];

                String pesan = " -> tidak ada perubahan";

                for (y = (x + 1); y < jumData; y++) {
                    if (min > data[y]) {
                        tukar = true;
                        index = y;
                        min = data[y];
                    }
                }

                if (tukar == true) {
                    // Pertukaran data
                    pesan = " => angka " + data[x] + " ditukar dengan angka " + data[index];
                    int temp = data[x];
                    data[x] = data[index];
                    data[index] = temp;
                }

                // for (y = 0; y < jumData; y++) {
                //     System.out.print(data[y] + " ");
                // }

                System.out.println(pesan);
            }

            // Tampilan data setelah sorting
            System.out.print("\nData setelah sorting : ");
            for (x = 0; x < jumData; x++) {
                System.out.print(data[x] + " ");
            }
        }
        System.out.println("\n------------------------------------------------------------");
        
    }
}
