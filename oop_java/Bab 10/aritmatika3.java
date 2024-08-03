public class aritmatika3 {

    // Method pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Method perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Method pembagian
    public double pembagian(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    // Method pangkat
    public double pangkat(int a, int b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        aritmatika3 arit = new aritmatika3();

        // Mengakses method pengurangan
        int hasilPengurangan = arit.pengurangan(10, 5);
        System.out.println("Pengurangan: 10 - 5 = " + hasilPengurangan);

        // Mengakses method perkalian
        int hasilPerkalian = arit.perkalian(10, 5);
        System.out.println("Perkalian: 10 * 5 = " + hasilPerkalian);

        // Mengakses method pembagian
        double hasilPembagian = arit.pembagian(10, 5);
        System.out.println("Pembagian: 10 / 5 = " + hasilPembagian);

        // Mengakses method pangkat
        double hasilPangkat = arit.pangkat(2, 3);
        System.out.println("Pangkat: 2 ^ 3 = " + hasilPangkat);
    }
}