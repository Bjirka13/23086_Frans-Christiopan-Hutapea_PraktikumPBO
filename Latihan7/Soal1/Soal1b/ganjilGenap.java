/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1b;

/**
 *
 * @author Family
 */
public class ganjilGenap {
    public static void main(String[] args){
        int angka = 20;
        
        System.out.println("Angka Ganjil dan Genap dari 0 sampai " + angka + ":");
        for(int i = 1; i <= angka; i++){
            if(i % 2 != 0){
                System.out.println("Bilangan Ganjil: ");
                System.out.println(i + " ");
            } else {
                    System.out.println("Bilangan Genap: ");
                    System.out.println(i + " ");
                }
        }
    }
}
