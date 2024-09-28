/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

import java.util.Scanner;

/**
 *
 * @author Family
 */
public class Nilai{
    public static void main(String[] args){   
    
    Scanner inputan = new Scanner(System.in);
        double Kehadiran, Tugas, UTS, UAS, Akhir;
        String Nama, NPM, Grade;
        
        System.out.println("NPM: ");
        NPM = inputan.nextLine();
        
        System.out.println("Nama Mahasiswa: ");
        Nama = inputan.nextLine();
    
        System.out.println("Nilai Kehadiran: ");
        Kehadiran = inputan.nextDouble();
        
        System.out.println("Nilai Tugas: ");
        Tugas = inputan.nextDouble();
        
        System.out.println("Nilai UTS: ");
        UTS = inputan.nextDouble();
        
        System.out.println("Nilai UAS: ");
        UAS = inputan.nextDouble();   
        
        Akhir = (0.1 * Kehadiran) + (0.2 * Tugas) + (0.3 * UTS) + (0.4 * UAS);
        
        System.out.println("NPM Mahasiswa: " + NPM);
        System.out.println("Nama Mahasiswa: " + Nama);
        
        if(Akhir >= 76){
            Grade = "A";
            System.out.println("Nilai Akhir: " + Akhir);
            System.out.println("Grade: " + Grade);
            System.out.println("ISTIMEWA!");
        } 
        else if (Akhir >= 66 && Akhir < 76){
            Grade = "B";
            System.out.println("Nilai Akhir: " + Akhir);
            System.out.println("Grade: " + Grade);
            System.out.println("BAIK!");
        }
        else if (Akhir >= 56 && Akhir < 66){
            Grade = "C";
            System.out.println("Nilai Akhir: " + Akhir);
            System.out.println("Grade: " + Grade);
            System.out.println("CUKUP!");
        }
        else if (Akhir >= 46 && Akhir < 56){
            Grade = "D";
            System.out.println("Nilai Akhir: " + Akhir);
            System.out.println("Grade: " + Grade);
            System.out.println("KURANG!");
        }
        else if(Akhir >= 0 && Akhir < 46){
            Grade = "E";
            System.out.println("Nilai Akhir: " + Akhir);
            System.out.println("Grade: " + Grade);
            System.out.println("KURANG SEKALI!");
        }
        else{
        System.out.println("Format Nilai Tidak Sesuai");
        }
    }
}
