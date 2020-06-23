import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOBufferedReader {
    
    public static void main(String[] args) throws IOException {
        
        String nama;
        int pendapatan;
        
        InputStreamReader isr = new InputStreamReader(System.in);       // Buat objek inputStreamReader
        BufferedReader br = new BufferedReader(isr);        // Buat objek bufferedReader
        
        System.out.print("Input nama : ");
        nama = br.readLine();       // Input nama
        System.out.print("Input pendapatan : ");
        pendapatan = Integer.parseInt(br.readLine());     // Input pendapatan 
        
        // Output
        System.out.println("---------------------------");
        System.out.println("Nama : " + nama);
        System.out.println("pendapatan : " + pendapatan);
        
    }
}
