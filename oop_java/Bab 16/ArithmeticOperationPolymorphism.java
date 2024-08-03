// Kelas abstrak untuk operasi aritmatika
abstract class ArithmeticOperation {
    protected double a;
    protected double b;

    // Konstruktor
    public ArithmeticOperation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Metode abstrak untuk menghitung hasil operasi
    public abstract double compute();
}

// Kelas untuk operasi penjumlahan
class Addition extends ArithmeticOperation {
    public Addition(double a, double b) {
        super(a, b);
    }

    @Override
    public double compute() {
        return a + b;
    }
}

// Kelas untuk operasi pengurangan
class Subtraction extends ArithmeticOperation {
    public Subtraction(double a, double b) {
        super(a, b);
    }

    @Override
    public double compute() {
        return a - b;
    }
}

// Kelas untuk operasi perkalian
class Multiplication extends ArithmeticOperation {
    public Multiplication(double a, double b) {
        super(a, b);
    }

    @Override
    public double compute() {
        return a * b;
    }
}

// Kelas untuk operasi pembagian
class Division extends ArithmeticOperation {
    public Division(double a, double b) {
        super(a, b);
    }

    @Override
    public double compute() {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Pembagi tidak boleh nol");
        }
    }
}

// Kelas utama untuk menjalankan program
public class ArithmeticOperationPolymorphism {
    public static void main(String[] args) {
        double a = 9.5;
        double b = 2.5;

        // Membuat objek untuk setiap operasi
        ArithmeticOperation addition = new Addition(a, b);
        ArithmeticOperation subtraction = new Subtraction(a, b);
        ArithmeticOperation multiplication = new Multiplication(a, b);
        ArithmeticOperation division = new Division(a, b);

        // Menampilkan hasil operasi
        System.out.println("Penjumlahan: " + addition.compute());
        System.out.println("Pengurangan: " + subtraction.compute());
        System.out.println("Perkalian: " + multiplication.compute());
        System.out.println("Pembagian: " + division.compute());
    }
}