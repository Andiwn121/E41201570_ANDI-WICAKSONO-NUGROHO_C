
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class OutputTampilanD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama;
        int b1, b2, b3, b4, b5, sum;
        
        System.out.println("-----------------------------------------------");
        System.out.println("          Kharisma Agung Plaza ( KAP )         ");
        System.out.println("            Promo Belanja Berhadiah            ");
        System.out.println("       Khusus Pembelian 5 Barang pertama       ");
        System.out.println("       Dengan Harga Minimum Rp. 10000,00       ");
        System.out.println("-----------------------------------------------");
        
        
        System.out.print("Masukkan nama pembeli : ");
        nama = scan.nextLine();
        System.out.println("");
        System.out.print("Masukkan Harga Barang Ke-1 : ");
        b1 = scan.nextInt();
        System.out.print("Masukkan Harga Barang Ke-2 : ");
        b2 = scan.nextInt();
        System.out.print("Masukkan Harga Barang Ke-3 : ");
        b3 = scan.nextInt();
        System.out.print("Masukkan Harga Barang Ke-4 : ");
        b4 = scan.nextInt();
        System.out.print("Masukkan Harga Barang Ke-5 : ");
        b5 = scan.nextInt();
        System.out.println("                  ******              ");
        sum = b1+b2+b3+b4+b5;
        System.out.println("Total harga pembelian atas nama "+nama+" adalah "+sum);
        System.out.println("-----------------------------------------------");
        
        if (b1 < 10000 || b2 < 10000 || b3 < 10000 || b4 < 10000 || b5 < 10000){
        System.out.println("                 Terima Kasih                  ");
        System.out.println(" Anda sudah berbelanja di Kharisma Agung plaza ");
        System.out.println("-----------------------------------------------");
    }   else {
        System.out.println("Selamat . . . .                  ");
        System.out.println("Anda mendapatkan 1 buah Mug cantik. .");
        System.out.println("");
        System.out.println("                 Terima Kasih                  ");
        System.out.println(" Anda sudah berbelanja di Kharisma Agung plaza ");
        System.out.println("-----------------------------------------------");
    }
        
    }
}
