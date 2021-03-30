/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Genap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("Masukkan Batas Awal Genap  = ");
        a = scan.nextInt();
        System.out.println("Masukkan Batas Akhir = ");
        b = scan.nextInt();
        System.out.println("");
        System.out.println("Bilangan Genap : ");
        for (int i=a; i<=b; i++){
           if (i%2==0){
            System.out.print(i+" ");
            }
        }
        System.out.println("");        
    }
    
}
