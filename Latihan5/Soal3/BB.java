/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal3;

import java.util.Scanner;

/**
 *
 * @author Family   
 */
public class BB{
    public static void main(String[] args){   
    
    Scanner inputan = new Scanner(System.in);
        double TB, BB, IMT;
        String Kriteria;
        
        System.out.println("Berat Badan: ");
        BB = inputan.nextDouble();
        
        System.out.println("Tinggi Badan: ");
        TB = inputan.nextDouble();   
        
        
        IMT = BB / (TB * TB);
        
        if(IMT >= 40){
            Kriteria = "Sangat Gemuk!";
            System.out.println("Berat Badan: " + BB);
            System.out.println("Tinggi Badan: " + TB);
            System.out.println("IMT: " + IMT);
            System.out.println("Kriteria: " + Kriteria);
        }
        else if (IMT >= 30  && IMT < 40){
            Kriteria = "Gemuk";
            System.out.println("Berat Badan: " + BB);
            System.out.println("Tinggi Badan: " + TB);
            System.out.println("IMT: " + IMT);
            System.out.println("Kriteria: " + Kriteria);
        }
        else if (IMT >= 25 && IMT < 30){
            Kriteria = "Berat Badan Lebih";
            System.out.println("Berat Badan: " + BB);
            System.out.println("Tinggi Badan: " + TB);
            System.out.println("IMT: " + IMT);
            System.out.println("Kriteria: " + Kriteria);
        }
        else if (IMT >= 18.5 && IMT < 25){
            Kriteria = "Berat Badan Ideal";
            System.out.println("Berat Badan: " + BB);
            System.out.println("Tinggi Badan: " + TB);
            System.out.println("IMT: " + IMT);
            System.out.println("Kriteria: " + Kriteria);
        }
       
        else if(IMT <= 18.4){
            Kriteria = "Berat Badan Kurang";
            System.out.println("Berat Badan: " + BB);
            System.out.println("Tinggi Badan: " + TB);
            System.out.println("IMT: " + IMT);
            System.out.println("Kriteria: " + Kriteria);
        }
        else{
        System.out.println("Format Inputan Tidak Sesuai");
        }
    }
}
