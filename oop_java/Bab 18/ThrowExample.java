public class ThrowExample {
    public static void main(String[] args) {
        try {
            validateAge(15); // Ini akan melempar IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18");
        }
        System.out.println("Age is valid");
    }
}