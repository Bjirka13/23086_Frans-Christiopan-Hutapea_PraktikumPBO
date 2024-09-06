/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soal1;

/**
 *
 * @author Family
 */
public class Matematika implements InterfaceRumus{
    int hasil;
    int a, b;
    
    @Override
    public void pertambahan() {
        a = 20;
        b = 10;
        hasil = a + b;
        System.out.println(a + "+" + b + "=" + hasil);
    }

    @Override
    public void pengurangan() {
        a = 10;
        b = 5;
        hasil = a - b;
        System.out.println(a + "-" + b + "=" + hasil);
    }

    @Override
    public void perkalian() {
        a = 10;
        b = 3;
        hasil = a * b;
        System.out.println(a + "*" + b + "=" + hasil);
    }

    @Override
    public void pembagian() {
        a = 21;
        b = 2;
        hasil = a / b;
        System.out.println(a + "/" + b + "=" + hasil);
    }

    
}

