import java.io.Console;

public class IOConsole {
    
    public static void main(String[] args) {
        
        String nama;
        int umur;
        
        // Buat objek console
        Console cs = System.console();
        
        System.out.println("Nama : ");
        nama = cs.readLine();       // Input nama
        System.out.println("Usia : ");
        umur = Integer.parseInt(cs.readLine());     // Input umur
        
        // Output
        System.out.println("------------------------------");
        System.out.println("Nama  : " + nama);
        System.out.println("Usia  : " + umur + " tahun");
    }
}
