class FinallyBlokContoh {
    public static void main(String[] args) {
        try {
            // below code does not throw any exception
            Float data = 500.0f / 15;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("blok finally akan selalu di eksekusi");
        }
    }
}