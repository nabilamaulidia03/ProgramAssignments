import java.text.DecimalFormat;

// Parent class
class Karyawan {
    String nama;
    double gaji;
    double bonus;
    double tunjanganMakan;
    double transport;

    Karyawan(String nama, double gaji, double bonus, double tunjanganMakan, double transport) {
        this.nama = nama;
        this.gaji = gaji;
        this.bonus = bonus;
        this.tunjanganMakan = tunjanganMakan;
        this.transport = transport;
    }
}

// Child class
class SystemAnalyst extends Karyawan {
    SystemAnalyst(String nama, double gaji, double bonus, double tunjanganMakan, double transport) {
        super(nama, gaji, bonus, tunjanganMakan, transport);
    }

    double hitungGajiTotal() {
        return gaji + bonus + tunjanganMakan + transport;
    }

    void tampilkanGajiTotal() {
        DecimalFormat df = new DecimalFormat("#,###");

        System.out.println("Gaji " + nama + " : " + df.format(gaji));
        System.out.println("Bonus : " + df.format(bonus));
        System.out.println("Tunjangan Makan: " + df.format(tunjanganMakan));
        System.out.println("Transport: " + df.format(transport));
        System.out.println("Gaji Total: " + df.format(hitungGajiTotal()));
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        SystemAnalyst systemAnalyst = new SystemAnalyst("System Analyst", 4000000, 1000000, 400000, 500000);
        systemAnalyst.tampilkanGajiTotal();
    }
}