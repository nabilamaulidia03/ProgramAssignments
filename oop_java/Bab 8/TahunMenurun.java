import java.util.Scanner;

public class TahunMenurun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tahun Akhir ?: ");
        int tahunAkhir = scanner.nextInt();

        System.out.print("Tahun Awal ?: ");
        int tahunAwal = scanner.nextInt();

        System.out.println("\nHasilnya:");

        for (int i = tahunAkhir; i >= tahunAwal; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}