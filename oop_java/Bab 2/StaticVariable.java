public class StaticVariable {
    // Membuat variable static tanpa value/nilai pada class
    public static String Hobi;

    // Membuat variable static final dengan nilai tetap
    public static final String Hewan = "Ikan Hias";

    // Membuat variable static Makanan
    public static String Makanan = "Ayam Geprek";

    // Membuat variable static Minuman
    public static String Minuman = "Jus Jambu";

    public static void main(String[] args) {
        // Mengisi value pada variable Hobi
        Hobi = "Menggambar";

        // Memanggil dan menampilkan variable Hobi
        System.out.println("Hobi Saya: " + Hobi);

        // Memanggil dan menampilkan variable Hewan
        System.out.println("Peliharaan Saya: " + Hewan);

        // Menampilkan makanan favorit
        System.out.println("Makanan Favorit saya: " + Makanan);

        // Menampilkan minuman favorit
        System.out.println("Minuman Favorit saya: " + Minuman);
    }
}

