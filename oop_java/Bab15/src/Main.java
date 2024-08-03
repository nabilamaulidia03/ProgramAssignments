package src;

public class Main {

 // Method pengurangan
 public static int pengurangan(int a, int b) {
    return a - b;
}

// Method pembagian
public static float pembagian(float a, float b) {
    if (b == 0) {
        throw new ArithmeticException("Tidak bisa membagi dengan nol.");
    }
    return a / b;
}

// Method perkalian
public static float perkalian(float a, float b) {
    return a * b;
}

public static void main(String[] args) {
    // Variabel untuk Pengurangan
    int aInt = 15;
    int bInt = 5;

    // Variabel untuk Pembagian
    float aFloat1 = 20.0f;
    float bFloat1 = 4.0f;

    // Variabel untuk Perkalian
    float aFloat2 = 6.0f;
    float bFloat2 = 7.0f;

    // Menggunakan method pengurangan
    int hasilKurang = pengurangan(aInt, bInt);
    System.out.println("Hasil Pengurangan: " + hasilKurang);

    // Menggunakan method pembagian
    try {
        float hasilBagi = pembagian(aFloat1, bFloat1);
        System.out.println("Hasil Pembagian: " + hasilBagi);
    } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
    }

    // Menggunakan method perkalian
    float hasilKali = perkalian(aFloat2, bFloat2);
    System.out.println("Hasil Perkalian: " + hasilKali);

    // Uji kasus tambahan
    // Pengurangan negatif
    int hasilKurangNegatif = pengurangan(5, 15);
    System.out.println("Hasil Pengurangan Negatif: " + hasilKurangNegatif);

    // Pembagian dengan nol
    try {
        float hasilBagiNol = pembagian(aFloat1, 0);
        System.out.println("Hasil Pembagian dengan Nol: " + hasilBagiNol);
    } catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
    }

    // Perkalian dengan angka nol
    float hasilKaliNol = perkalian(0, 7.0f);
    System.out.println("Hasil Perkalian dengan Nol: " + hasilKaliNol);
}
}
