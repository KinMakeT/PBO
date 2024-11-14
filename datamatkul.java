import java.util.Scanner;
class matkul{
    String nama;
    int SKS;
    int ID;
    static int count = 1;

    matkul(String nama, int SKS){
        this.nama = nama;
        this.SKS = SKS;
        this.ID = count;
        count += 1;
    }

    matkul(matkul matkulcopy){
        this.nama = matkulcopy.nama;
        this.SKS = matkulcopy.SKS;
        this.ID = count;
        count += 1;
    }
    
    void infomatkul(){
        System.out.println("\nID Mata Kuliah: " +this.ID);
        System.out.println("Nama Mata Kuliah: " +this.nama);
        System.out.println("SKS Mata Kuliah: " +this.SKS);
    }
}

public class datamatkul {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama Mata Kuliah: ");
        String nama = input.nextLine();
        System.out.println("Masukkan jumlah SKS Mata Kuliah: ");
        int SKS = input.nextInt();

        matkul MataKuliah2 = new matkul(nama, SKS);
        matkul MataKuliah3 = new matkul(MataKuliah2);

        MataKuliah2.infomatkul();
        MataKuliah3.infomatkul();
    }
}