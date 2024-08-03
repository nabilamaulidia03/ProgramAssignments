import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Jumlah Kota: ");
        int jumlahKota = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        String[] kotaArray = new String[jumlahKota];

        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + ": ");
            kotaArray[i] = scanner.nextLine();
        }

        System.out.println("\nKota-kota yang dimasukan");
        for (String kota : kotaArray) {
            System.out.println(kota);
        }

        scanner.close();
    }
}