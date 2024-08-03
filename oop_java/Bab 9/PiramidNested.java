public class PiramidNested {

    public static void main(String[] args) {
        // Nilai N yang ditentukan
        int N = 15;

        // Inisialisasi variabel baris
        int i = 1;

        // Loop untuk setiap baris
        while (i <= N) {
            // Inisialisasi variabel kolom
            int j = 1;

            // Loop untuk mencetak tanda bintang di setiap baris
            while (j <= i) {
                System.out.print("*");
                j++;
            }

            // Pindah ke baris baru setelah mencetak semua bintang di baris ini
            System.out.println();

            // Increment baris
            i++;
        }
    }
}