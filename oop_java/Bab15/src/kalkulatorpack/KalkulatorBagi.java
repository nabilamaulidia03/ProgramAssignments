package src.kalkulatorpack;

public class KalkulatorBagi {
    public static int pembagian(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Tidak bisa membagi dengan nol.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        try {
            int hasil = pembagian(a, b);
            System.out.println("Hasil Pembagian: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    } 
}
