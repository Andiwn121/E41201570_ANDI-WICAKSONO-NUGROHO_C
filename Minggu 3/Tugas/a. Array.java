/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Array {
    public static void main(String[] args) {
        String fName, mName, lName;
    
        Scanner data = new Scanner(System.in);
        System.out.println("Input Data Diri");        
        System.out.println("");
        System.out.print("Nama Depan     : ");
        fName = data.nextLine();
        System.out.print("Nama Tengah    : ");
        mName = data.nextLine();
        System.out.print("Nama Belakang  : ");
        lName = data.nextLine();
        
        //hasil inputan
        System.out.println("");
        System.out.println("**********");
        System.out.println("Nama     : " +fName+ " " +mName+ " " +lName);
    }    
}
