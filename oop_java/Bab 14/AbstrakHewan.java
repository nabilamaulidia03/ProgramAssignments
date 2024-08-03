// File: AbstrakHewan.java
public abstract class AbstrakHewan {

    // Method abstract
    public abstract void suara();

    // Method non-abstract
    public void suara2() {
        System.out.println("Ini method konkrit dari parent class");
    }

    // Method main untuk testing
    public static void main(String[] args) {
        // Tidak bisa membuat instance dari abstract class
        // AbstrakHewan hewan = new AbstrakHewan(); // Ini akan menghasilkan error
        
        // Kita hanya bisa menguji method non-abstract seperti ini
        // Jika ingin menguji subclass, buat objek subclass di sini
        System.out.println("Ini adalah method main dari class AbstrakHewan");
    }
} 