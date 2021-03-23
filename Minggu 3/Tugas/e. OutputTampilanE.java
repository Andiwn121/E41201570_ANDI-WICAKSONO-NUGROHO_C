
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
public class OutputTampilanE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nama;
        int minuman;
        
        System.out.println("-----------------------");
        System.out.println("      CAFE CERIA       ");
        System.out.println("     ANEKA MINUMAN     ");
        System.out.println("-----------------------");
        System.out.println("");
        System.out.println("     SPECIAL MENU      ");
        System.out.println("    1. Soft Drink      ");
        System.out.println("    2. Mix Juice       ");
        System.out.println("    3. Nescafe         ");
        System.out.println("    4. Soda Milk       ");
        System.out.println("    5. Tea             ");
        System.out.println("");
        System.out.println("-----------------------");
        
        System.out.print("Masukkan nama pembeli         : ");
        nama = scan.nextLine();
        System.out.print("Silahkan masukkan pilihan anda : ");
        minuman = scan.nextInt();
        System.out.println("");
        switch (minuman){
            case 1:
                System.out.println("Minuman yang anda pesan adalah Soft Drink.");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah Mix Juice.");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah Nescafe.");
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah Soda Milk.");
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah Tea.");
                break;
            default:
                System.out.println("Maaf nomor pesanan salah!");
        }
        System.out.println("");
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima Kasih "+nama+" telah berkunjung di CAFE CERIA.");
    }
}
