/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eswitchcase;

import java.util.Scanner;

/**
 *
 * @author Zul Arsil Mustofa
 */
public class ESwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner beliminuman = new Scanner(System.in);
        
        System.out.println("       CAFE CERIA");
        System.out.println("     ANEKA MINUMAN");
        System.out.println("---------------------------");
        System.out.println("     SPECIAL MENU");
        
        // Daftar Minuman
        String[] teks = {"1. Soft drinks", "2. Mix Juice", "3. Nescafe", "4. Soda Milk", "5. Tea"};
        
        for(int i=0; i<teks.length; i++) {
            System.out.println(teks[i]);
            System.out.print("");
        }
        System.out.println("---------------------------");
        
        // Masukkan nama pembeli
        System.out.print("Masukkan nama pembeli: ");
        String nama = beliminuman.nextLine();
        System.out.println();
        
        // Masukkan pilihan minuman
        System.out.print("Silahkan masukkan pilihan anda: ");
        int minuman = beliminuman.nextInt();
       
        // Switch Case Minuman
        switch (minuman) {
            case 1:
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default:
                System.out.println("Minuman tidak ada dalam daftar");
        }
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima Kasih " + nama + " telah berkunjung di Cafe Ceria");
    }
    
}
