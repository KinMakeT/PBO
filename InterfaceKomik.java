import java.util.Scanner;

// Interface sebagai blueprint dasar untuk jenis komik
interface Komik {

    // Metode abstract yang harus diimplementasikan oleh kelas yang mengimplementasikan interface
    void jenis();

    // Metode default dalam interface
    default void penjelasan() {
        System.out.println("Komik adalah cara penyampaian cerita melalui gambar dan teks.");
    }
}

// Kelas yang mewakili manga dan mengimplementasikan interface Komik
class Manga implements Komik {
    String nama;

    Manga(String nama) {
        this.nama = nama;
    }

    // Implementasi metode abstract 'jenis' dari interface Komik
    public void jenis() {
        System.out.println(nama + " adalah komik yang berasal dari Jepang yang dibaca dari kanan ke kiri, yang disebut manga.");
    }
}

// Kelas yang mewakili manhwa dan mengimplementasikan interface Komik
class Manhwa implements Komik {
    String nama;

    Manhwa(String nama) {
        this.nama = nama;
    }

    // Implementasi metode abstract 'jenis' dari interface Komik
    public void jenis() {
        System.out.println(nama + " adalah komik yang berasal dari Korea Selatan yang dibaca dari kiri ke kanan, yang disebut manhwa.");
    }
}

// Kelas yang mewakili manhua dan mengimplementasikan interface Komik
class Manhua implements Komik {
    String nama;

    Manhua(String nama) {
        this.nama = nama;
    }

    // Implementasi metode abstract 'jenis' dari interface Komik
    public void jenis() {
        System.out.println(nama + " adalah komik yang berasal dari Tiongkok yang dibaca dari kanan ke kiri, yang disebut manhua.");
    }
}

public class InterfaceKomik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pilihan untuk user
        System.out.println("Pilih jenis komik:");
        System.out.println("1. Manga");
        System.out.println("2. Manhwa");
        System.out.println("3. Manhua");

        System.out.print("Masukkan pilihan Anda (1/2/3): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Membaca newline yang tersisa setelah nextInt

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
