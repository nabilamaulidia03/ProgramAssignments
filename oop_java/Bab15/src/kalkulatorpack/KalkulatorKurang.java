package src.kalkulatorpack;

public class KalkulatorKurang {

    public static int pengurangan(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int hasil = pengurangan(a, b);
        System.out.println("Hasil Pengurangan: " + hasil);
    }
}