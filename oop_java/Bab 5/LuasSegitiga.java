public class LuasSegitiga {
    public static void main(String[] args) {
        // Menetapkan nilai alas dan tinggi secara langsung
        double alas = 8;  // Ganti dengan nilai alas yang diinginkan
        double tinggi = 6;  // Ganti dengan nilai tinggi yang diinginkan

        // Menghitung luas segitiga
        double luas = (alas * tinggi) / 2;

        // Menampilkan hasil
        System.out.printf("Luas Segitiga dengan alas %.2f dan tinggi %.2f adalah: %.2f\n", alas, tinggi, luas);
    }
}