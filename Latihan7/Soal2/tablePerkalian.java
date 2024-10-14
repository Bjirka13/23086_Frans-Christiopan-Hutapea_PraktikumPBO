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
public class tablePerkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nilai n: ");
        n = scanner.nextInt();

        // Memeriksa apakah nilai n sesuai dengan batasan
        if (n >= 0 && n <= 10) {
            // Mencetak tabel perkalian
            System.out.println();
            for (int i = 1; i <= n; i++) {
                System.out.print("\t" + i);
            }
            System.out.println();
            for (int i = 1; i <= n; i++) {
                // Mencetak angka di baris pertama (nomor baris)
                System.out.print(i);
                for (int j = 1; j <= n; j++) {
                    System.out.print("\t" + (i * j));
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai n harus antara 0 hingga 10.");
        }
    }
}

