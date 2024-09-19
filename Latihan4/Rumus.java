/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan4;

/**
 *
 * @author Family
 */
public class Rumus implements InterfaceRumus{
    public int luas_permukaan, volume;
    
    @Override
    public void Balok(int p, int l, int t){
        volume = p * l * t;
        luas_permukaan = 2 * (p * l + p * t + l * t); 
        System.out.println("Balok");
        System.out.println("Volume: " + volume);
        System.out.println("Luas Permukaan: " + luas_permukaan);
    }

    @Override
    public void Kubus(int sisi){
        volume = sisi * sisi * sisi;
        luas_permukaan = 6 * sisi * sisi;
        System.out.println("Kubus");
        System.out.println("Volume: " + volume);
        System.out.println("Luas Permukaan: " + luas_permukaan);
    }  
    
    
}

