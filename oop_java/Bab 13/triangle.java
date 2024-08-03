// Nama file: Triangle.java
public class triangle {
    private double alas;
    private double tinggi;
    private double luas;

    // Constructor untuk menginisialisasi alas dan tinggi
    public triangle(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.luas = calculateLuas();
    }

    // Method untuk menghitung luas
    public double calculateLuas() {
        return (alas * tinggi) / 2;
    }

    // Method overloading: Menghitung luas dengan parameter
    public double calculateLuas(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }

    // Method untuk menampilkan luas
    public void displayLuas() {
        System.out.println("Luas Segitiga: " + luas);
    }

    public static void main(String[] args) {
        triangle triangle1 = new triangle(10, 5); // Menggunakan constructor
        triangle1.displayLuas();
        
        // Menggunakan method overloading
        double luas = triangle1.calculateLuas(15, 7);
        System.out.println("Luas Segitiga (dengan parameter): " + luas);
    }
}