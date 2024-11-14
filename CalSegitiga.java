class Segitiga 
{
    double alas;
    double tinggi;

    // Constructor with parameter
    public Segitiga(double alas, double tinggi) 
    {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Method 
    public double hitungLuas() 
    {
        return 0.5 * alas * tinggi;
    }
}

// Class utama untuk menjalankan program
public class CalSegitiga 
{
    public static void main(String[] args) 
    {
        // Instantiation Object
        Segitiga segitiga1 = new Segitiga(5, 7);
        Segitiga segitiga2 = new Segitiga(10, 15);
        
        System.out.println("Luas segitiga ke-1 adalah: " + segitiga1.hitungLuas());
        System.out.println("Luas segitiga ke-2 adalah: " + segitiga2.hitungLuas());
    }
}
