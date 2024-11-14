import java.util.Scanner;

// Kelas abstract sebagai blueprint dasar untuk jenis komik
abstract class Komik {
    String nama;

    // Constructor
    Komik(String nama) {
        this.nama = nama;
    }

    // Metode abstract (tanpa implementasi) yang harus diimplementasikan oleh subclass
    abstract void jenis();

    // Metode non-abstract
    void penjelasan() {
        System.out.println("Komik adalah cara penyampaian cerita melalui gambar dan teks.");
    }
}

// Subclass yang mewakili manga
class Manga extends Komik {
    Manga(String nama) {
        super(nama);
    }

    // Implementasi metode jenis dari kelas abstract Komik
    void jenis() {
        System.out.println(nama + " adalah komik yang berasal dari Jepang yang dibaca dari kanan ke kiri, yang disebut manga.");
    }
}

// Subclass yang mewakili manhwa
class Manhwa extends Komik {
    Manhwa(String nama) {
        super(nama);
    }

    // Implementasi metode jenis dari kelas abstract Komik
    void jenis() {
        System.out.println(nama + " adalah komik yang berasal dari Korea Selatan yang dibaca dari kiri ke kanan, yang disebut manhwa.");
    }
}

// Subclass yang mewakili manhua
class Manhua extends Komik {
    Manhua(String nama) {
        super(nama);
    }

    // Implementasi metode jenis dari kelas abstract Komik
    void jenis() {
        System.out.println(nama + " adalah komik yang berasal dari Tiongkok yang dibaca dari kanan ke kiri, yang disebut manhua.");
    }
}

public class AbstractKomik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tampilkan pilihan untuk user
        System.out.println("Pilih jenis komik:");
        System.out.println("1. Manga");
        System.out.println("2. Manhwa");
        System.out.println("3. Manhua");

        System.out.print("Masukkan pilihan Anda (1/2/3): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Membuang newline setelah nextInt

        System.out.print("Masukkan nama komik: ");
        String nama = scanner.nextLine();

        // Inisialisasi objek sesuai pilihan user
        Komik komik = null;
        switch (pilihan) {
            case 1:
                komik = new Manga(nama);
                break;
            case 2:
                komik = new Manhwa(nama);
                break;
            case 3:
                komik = new Manhua(nama);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0);
        }

        // Menampilkan penjelasan umum dan jenis komik
        komik.penjelasan();
        komik.jenis();
    }
}
