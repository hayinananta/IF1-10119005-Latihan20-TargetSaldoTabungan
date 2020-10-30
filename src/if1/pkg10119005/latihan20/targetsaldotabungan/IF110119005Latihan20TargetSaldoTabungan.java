/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan20.targetsaldotabungan;

import java.util.Scanner;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Target Saldo Tabungan
 */
public class IF110119005Latihan20TargetSaldoTabungan {
    static Scanner scan = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Saldo Awal : Rp.");
        String s_saldo = scan.next();
        System.out.print("Bunga/Bulan(%) : ");
        String s_bunga = scan.next();
        System.out.print("Saldo Target : Rp.");
        String target = scan.next();
        
        double bunga = Double.parseDouble(s_bunga) / 100;
        double saldo = Double.parseDouble(s_saldo);            
        
        int num = 1;
        while(num <= 8){
            saldo = saldo + (saldo * bunga);          
            System.out.println("Saldo di bulan ke"+num+" Rp. "+saldo);            
            num++;
    
        }
    }
}
