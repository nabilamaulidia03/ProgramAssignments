import java.util.Scanner;

public class Pertambahan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nilai Awal ?: ");
        int nilaiAwal = scanner.nextInt();

        System.out.print("Nilai Akhir ?: ");
        int nilaiAkhir = scanner.nextInt();

        System.out.println("\nPemrograman Berorientasi Objek (Java 1)");
        System.out.println("Universitas Pamulang");
        System.out.println("Sistem Informasi S-1");

        System.out.println("\nHasilnya:");

        int index = 1;
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(index + ". " + i);
            index++;
        }

        scanner.close();
    }
}