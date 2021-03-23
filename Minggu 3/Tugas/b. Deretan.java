
import java.util.Random;
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
public class Deretan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random number = new Random ();
        
        int angka;
        
            System.out.print("Jumlah Deret Angka = ");
            angka = scan.nextInt();
            System.out.println("");
            System.out.println("Deret angka : ");
        
        for(int i=0; i<angka; i++){
            int[]random;
            random = new int[angka];
            random[i] = number.nextInt(50);                
            System.out.print(random[i]+" ");
    }
        System.out.println("");
    }
}
