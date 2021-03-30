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
public class MinMaxAvg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int Input[], BanyakData,sum = 0; 
        double avg;
        
        System.out.print("Masukkan Banyaknya Data Nilai = ");
        BanyakData = scan.nextInt();
        Input = new int[BanyakData];
        
        for (int i=0; i<BanyakData; i++){
            System.out.print("Masukkan Data Ke-"+(i+1)+ " = ");
            Input[i] = scan.nextInt();
            sum+=Input[i];    
        }
    
        int a = Input[0], b = Input[0];
        
        for(int x=0; x<BanyakData;x++){
            if(Input[x]>a){
                a = Input[x];
            }
        }
        for(int y=0; y<BanyakData;y++){
            if(Input[y]<b){
                b = Input[y];
            }
        }
        
        avg = sum/BanyakData;
        System.out.println("Nilai Terbesar   : "+a);
        System.out.println("Nilai Terkecil   : "+b);
        System.out.println("Nilai Rata-rata  : "+avg);
    
    }
}
