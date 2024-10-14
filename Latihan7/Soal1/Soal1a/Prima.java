/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Soal1a;

/**
 *
 * @author Family
 */
public class Prima {
    public static void main(String[] args){
    int i , angka; 
    String prima = "", bukan = "";
             
        for( i = 0; i <= 20; i++){
            int x = 0;
            for(angka = i; angka >= 1; angka--){
                if(i % angka == 0){
                    x = x + 1;
                }
            }
            if(x == 2){
                prima = prima + i + " ";
            } else {
                bukan = bukan + i + " ";
            }
        }
        System.out.println("Yang termasuk bilangan prima dari 0 sampai 20 adalah: ");
        System.out.println(prima);
        
        System.out.println("Yang tidak termasuk bilangan prima dari 0 sampai 20 adalah: ");
        System.out.println(bukan);
    }
}

    