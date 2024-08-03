// Nama file: Calculator.java
public class calculator {

    // Method untuk penjumlahan
    public int add(int a, int b) {
        return a + b;
    }

    // Method untuk pengurangan
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method untuk perkalian
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method untuk pembagian
    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        calculator calc = new calculator();
        
        int num1 = 20;
        int num2 = 10;

        System.out.println("Hasil Pertambahan: " + calc.add(num1, num2));
        System.out.println("Hasil Pengurangan: " + calc.subtract(num1, num2));
        System.out.println("Hasil Perkalian : " + calc.multiply(num1, num2));
        System.out.println("Hasil Pembagian : " + calc.divide(num1, num2));
    }
}