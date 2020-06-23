import java.util.Scanner;

public class dataMahasiswa {
    
    public static void main(String[] args) {
        // Deklarasi variable
        String nama, alamat, nim;
        int ukt;
        
        // Membuat scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Output
        System.out.println("--- Pendataan Mahasiswa ---");
        
        System.out.print("Nama : ");
        nama = keyboard.nextLine();     // Input nama
        System.out.print("Alamat : ");
        alamat = keyboard.nextLine();       // Input alamat
        System.out.print("NIM : ");
        nim = keyboard.nextLine();      // Input NIM
        System.out.print("UKT : ");
        ukt = keyboard.nextInt();       // Input UKT
        
        // Menampilkan data inputan
        System.out.println("--------------------------");
        System.out.println("Nama     : " + nama);
        System.out.println("Alamat   : " + alamat);
        System.out.println("NIM      : " + nim);
        System.out.println("UKT      : " + ukt);
    }
}
