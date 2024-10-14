/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1d;

import java.util.Scanner;

/**
 *
 * @author Family
 */
public class tekotek {
    public static void main(String[] args){
        int ank;  
        
        Scanner input = new Scanner (System.in);
        System.out.println("Total Anak Ayam: ");
        ank = input.nextInt(); 
                
        while (ank > 0) {
            System.out.println("Tek kotek, kotek kotek");
            System.out.println("Anak ayam turunlah " + ank);
            ank--;
            if (ank > 0) {
                System.out.println("Mati satu tinggallah " + ank);
            } else {
                System.out.println("Mati satu tinggallah induknya");
            }
        }
    }
}
