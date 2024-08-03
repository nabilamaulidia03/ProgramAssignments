public class Variabel {
    public static void main(String[] args) {
        // Variabel
        int w, x, y, z;
        
        // Penugasan
        x = 6;
        w = 5;
        y = 8 - x++;
        z = 8 - ++w;
        
        // Output
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai w: " + w);
        System.out.println("Nilai y: " + y);
        System.out.println("Nilai z: " + z);
    }
}
