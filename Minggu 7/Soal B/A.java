/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoalB;

/**
 *
 * @author asus
 */
public class A {
    void callthis(){
        System.out.println("Inside Class A's Method!");
    }
}    

class B extends A{
    void callthis(){
        System.out.println("Inside Class B's Method!");
    }
}

class C extends A{
    void callthis(){
        System.out.println("Inside Class C's Method!");
    }
}


