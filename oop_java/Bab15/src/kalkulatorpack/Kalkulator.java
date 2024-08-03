package src.kalkulatorpack;

public class Kalkulator { 
     // Method untuk pengurangan dengan tipe data int
     public static int pengurangan(int a, int b) {
        return a - b;
    }

    // Method untuk pembagian dengan tipe data float
    public static float pembagian(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol.");
        }
        return a / b;
    }

    // Method untuk perkalian dengan tipe data float
    public static float perkalian(float a, float b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Menguji method pengurangan
        int aInt = 10;
        int bInt = 5;
        int hasilKurang = pengurangan(aInt, bInt);
        System.out.println("Hasil Pengurangan (int): " + hasilKurang);

        // Menguji method pembagian
        float aFloat1 = 10.0f;
        float bFloat1 = 5.0f;
        try {
            float hasilBagi = pembagian(aFloat1, bFloat1);
            System.out.println("Hasil Pembagian (float): " + hasilBagi);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Menguji method perkalian
        float aFloat2 = 10.0f;
        float bFloat2 = 5.0f;
        float hasilKali = perkalian(aFloat2, bFloat2);
        System.out.println("Hasil Perkalian (float): " + hasilKali);
    }
}