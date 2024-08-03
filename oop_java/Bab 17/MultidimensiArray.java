public class MultidimensiArray {
    public static void main(String[] args) {
        String[][] negaraIbukota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        for (String[] pair : negaraIbukota) {
            System.out.println("Ibukota " + pair[0] + " adalah " + pair[1]);
        }
    }
}