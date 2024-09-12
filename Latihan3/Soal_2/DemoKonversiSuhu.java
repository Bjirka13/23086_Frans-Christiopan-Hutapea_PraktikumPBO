/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_2;

/**
 *
 * @author Family
 */
public class DemoKonversiSuhu {
    public static void main(String[] args){
    KonversiSuhu2 total = new KonversiSuhu2();
    
    System.out.println("Celcius -> Fahrenheit");
    System.out.println("Hasil Konversi: " + total.CelciusToFahrenheit(5.0));
    System.out.println("Celcius -> Reamur");
    System.out.println("Hasil Konversi: " + total.CelciusToReamur(5.0));
    System.out.println("Fahrenheit -> Reamur");
    System.out.println("Hasil Konversi: " + total.FahrenheitToReamur());
    }
}
