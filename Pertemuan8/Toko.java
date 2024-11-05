/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Toko_Serba_Ada;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Family
 */
public class Toko {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int Maks = 5;

        System.out.println("Masukkan item barang (maksimal 5): ");
        int jumlah = input.nextInt();
        
        if (jumlah > Maks) {
            System.out.println("Jumlah item barang tidak boleh lebih dari 5. Silakan coba lagi.");
            return;
        }
        
        String[][] jenis = new String[jumlah][5];
        
        String[] kode   = {"brg01", "brg02", "brg03", "brg04", "brg05"};
        String[] nama   = {"Buku", "Pensil", "Pulpen", "Penggaris", "Penghapus"};
        int[] hargaBarang     = {5000, 4000, 7000, 2000, 500};
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data ke " + (i + 1));
            
            System.out.print("Masukkan Kode: ");
            String kd = input.next();
            jenis[i][0] = kd;
            
            int index = -1;
            for (int j = 0; j < kode.length; j++) {
                if (kode[j].equals(kd)) {
                    index = j;
                    break;
                }
            }
            
            if (index != -1) {
                jenis[i][1] = nama[index];
                jenis[i][2] = String.valueOf(hargaBarang[index]);
            } else {
                System.out.println("Kode barang tidak ditemukan.");
                i--;
                continue;
            }
            
            System.out.print("Masukkan jumlah Beli: ");
            int jumlahBeli = input.nextInt();
            jenis[i][3] = String.valueOf(jumlahBeli);
            
            int totalBayar = hargaBarang[index] * jumlahBeli;
            jenis[i][4] = String.valueOf(totalBayar);
        }
            
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*******************************************");
        System.out.println("No  Kode Barang  Nama Barang   Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("===============================================================");
        
        int totalSeluruhPembayaran = 0;
        for (int i = 0; i < jumlah; i++) {
            System.out.print((i + 1) + "   ");
            System.out.print(jenis[i][0] + "        ");
            System.out.print(jenis[i][1] + "       ");
            System.out.print(jenis[i][2] + "      ");
            System.out.print(jenis[i][3] + "             ");
            System.out.println(jenis[i][4]);
        
            totalSeluruhPembayaran += Integer.parseInt(jenis[i][4]);
        }
        
        System.out.println("===============================================================");
        System.out.println("Total Bayar                      " + totalSeluruhPembayaran);   
    }
}
