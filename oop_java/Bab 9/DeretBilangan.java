import java.util.Scanner;

public class DeretBilangan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna untuk nilai awal
        System.out.print("Masukan bilangan awal: ");
        int nilaiAwal = scanner.nextInt();

        // Meminta input dari pengguna untuk nilai akhir
        System.out.print("Masukan bilangan akhir: ");
        int nilaiAkhir = scanner.nextInt();

        System.out.print("Hasil deret bilangan: ");
        
        // Inisialisasi nilai saat ini dengan nilai awal
        int nilaiSaatIni = nilaiAwal;

        // Loop untuk mencetak deret bilangan
        while (nilaiSaatIni <= nilaiAkhir) {
            System.out.print(nilaiSaatIni + " ");
            nilaiSaatIni += 5; // Pertambahan 5 setiap iterasi
        }
        
        // Tutup scanner
        scanner.close();
    }
}