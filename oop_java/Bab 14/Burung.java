// File: Burung.java
public class Burung extends AbstrakHewan {

    @Override
    public void suara() {
        System.out.println("Suara Burung mencicit");
    }

    // Method main untuk testing
    public static void main(String[] args) {
        Burung burung = new Burung();
        burung.suara();  // Memanggil method abstract
        burung.suara2(); // Memanggil method non-abstract
    }
}