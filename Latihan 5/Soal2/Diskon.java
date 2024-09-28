/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

import java.util.Scanner;

/**
 *
 * @author Family
 */
public class Diskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double diskon, totalBelanja, Nota;
        
        System.out.println("Masukkan Total Belanja Anda: ");
        totalBelanja = input.nextInt();
       
        if(totalBelanja < 50000){
        diskon = totalBelanja * 0.05;
        Nota = totalBelanja - diskon;
        System.out.println("Total Pembelian: " + totalBelanja);
        System.out.println("Diskon yang didapat: " + diskon);
        System.out.println("Diskon yang didapat: " + Nota);
        } 
        else if (totalBelanja >= 50000){
        diskon = totalBelanja * 0.2;
        Nota = totalBelanja - diskon;
        System.out.println("Total Pembelian: " + totalBelanja);
        System.out.println("Diskon yang didapat: " + diskon);
        System.out.println("Diskon yang didapat: " + Nota);
        }
    }
}
