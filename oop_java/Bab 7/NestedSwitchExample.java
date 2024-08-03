public class NestedSwitchExample {
    public static void main(String[] args) {
        // Data siswa
        String nim = "1111311";
        String nama = "Agustav";
        int tahun = 3;
        char peminatan = 'M';

        // Output
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun: " + tahun);
        
        switch (peminatan) {
            case 'M':
            case 'm':
                System.out.println("Peminatan: PEMROGRAMAN MOBILE");
                // Nested switch berdasarkan tahun
                switch (tahun) {
                    case 1:
                        System.out.println("Kursus: PEMROGRAMAN JAVA 1");
                        break;
                    case 2:
                        System.out.println("Kursus: PEMROGRAMAN JAVA 2");
                        break;
                    case 3:
                        System.out.println("Kursus: PEMROGRAMAN JAVA 2");
                        break;
                    default:
                        System.out.println("Kursus tidak tersedia untuk tahun ini.");
                        break;
                }
                break;
            case 'T':
            case 't':
                System.out.println("Peminatan: TEKNIK KOMPUTER");
                // Nested switch berdasarkan tahun
                switch (tahun) {
                    case 1:
                        System.out.println("Kursus: DASAR-DASAR TEKNIK KOMPUTER");
                        break;
                    case 2:
                        System.out.println("Kursus: TEKNIK JARINGAN");
                        break;
                    case 3:
                        System.out.println("Kursus: TEKNIK JARINGAN LAN");
                        break;
                    default:
                        System.out.println("Kursus tidak tersedia untuk tahun ini.");
                        break;
                }
                break;
            default:
                System.out.println("Peminatan tidak valid.");
                break;
        }
    }
}