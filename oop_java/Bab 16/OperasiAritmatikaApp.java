// Kelas dasar untuk operasi aritmatika
abstract class OperasiAritmatika {
    protected double a;
    protected double b;

    public OperasiAritmatika(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Metode abstrak yang harus diimplementasikan oleh kelas turunan
    public abstract double hitung();
}

// Kelas turunan untuk penjumlahan
class Penjumlahan extends OperasiAritmatika {
    public Penjumlahan(double a, double b) {
        super(a, b);
    }

    @Override
    public double hitung() {
        return a + b;
    }
}

// Kelas turunan untuk pengurangan
class Pengurangan extends OperasiAritmatika {
    public Pengurangan(double a, double b) {
        super(a, b);
    }

    @Override
    public double hitung() {
        return a - b;
    }
}

// Kelas turunan untuk perkalian
class Perkalian extends OperasiAritmatika {
    public Perkalian(double a, double b) {
        super(a, b);
    }

    @Override
    public double hitung() {
        return a * b;
    }
}

// Kelas turunan untuk pembagian
class Pembagian extends OperasiAritmatika {
    public Pembagian(double a, double b) {
        super(a, b);
    }

    @Override
    public double hitung() {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Pembagi tidak boleh nol");
        }
    }
}

// Kelas utama untuk menjalankan aplikasi
public class OperasiAritmatikaApp {
    public static void main(String[] args) {
        OperasiAritmatika[] operasi = {
            new Penjumlahan(9.5, 2.5),
            new Pengurangan(9.5, 2.5),
            new Perkalian(9.5, 2.5),
            new Pembagian(9.5, 2.5)
        };

        for (OperasiAritmatika op : operasi) {
            System.out.println(op.getClass().getSimpleName() + ": " + op.hitung());
        }
    }
}