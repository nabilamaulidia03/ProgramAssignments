package src.kalkulatorpack;

public class KalkulatorKali {
    public static int perkalian(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int hasil = perkalian(a, b);
        System.out.println("Hasil Perkalian: " + hasil);
    }  
}
