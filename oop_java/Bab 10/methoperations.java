public class methoperations{

    public static void main(String[] args) {
        aritmatika3 arit = new aritmatika3();

        // Pengurangan
        int bilangan1 = 20;
        int bilangan2 = 10;
        int hasilPengurangan = arit.pengurangan(bilangan1, bilangan2);
        System.out.println("Pengurangan: " + bilangan1 + " - " + bilangan2 + " = " + hasilPengurangan);

        // Perkalian
        int hasilPerkalian = arit.perkalian(bilangan1, bilangan2);
        System.out.println("Perkalian: " + bilangan1 + " * " + bilangan2 + " = " + hasilPerkalian);

        // Pembagian
        double hasilPembagian = arit.pembagian(bilangan1, bilangan2);
        System.out.println("Pembagian: " + bilangan1 + " / " + bilangan2 + " = " + hasilPembagian);

        // Pangkat
        double hasilPangkat = arit.pangkat(bilangan1, bilangan2);
        System.out.println("Pangkat: " + bilangan1 + " ^ " + bilangan2 + " = " + hasilPangkat);
    }
}