// Kelas abstrak
abstract class ArithmeticOperation {
    protected double a;
    protected double b;

    public ArithmeticOperation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    protected abstract double add();
    protected abstract double subtract();
    protected abstract double multiply();
    protected abstract double divide();
}

// Kelas konkret
class ConcreteArithmeticOperation extends ArithmeticOperation {

    public ConcreteArithmeticOperation(double a, double b) {
        super(a, b);
    }

    @Override
    protected double add() {
        return a + b;
    }

    @Override
    protected double subtract() {
        return a - b;
    }

    @Override
    protected double multiply() {
        return a * b;
    }

    @Override
    protected double divide() {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}

// Program utama
public class Main {
    public static void main(String[] args) {
        double a = 9.5;
        double b = 2.5;

        ArithmeticOperation operation = new ConcreteArithmeticOperation(a, b);

        System.out.println("Addition: " + operation.add());
        System.out.println("Subtraction: " + operation.subtract());
        System.out.println("Multiplication: " + operation.multiply());
        System.out.println("Division: " + operation.divide());
    }
}