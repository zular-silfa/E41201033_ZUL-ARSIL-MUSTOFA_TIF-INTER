/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aperulanganfor;

import java.util.Scanner;

/**
 *
 * @author Zul Arsil Mustofa
 */
public class APerulanganFor {

    public static void main(String[] args) {
        int arLength, temp;
        Scanner inData = new Scanner(System.in);
        
        //menentukan panjang array
        System.out.print("Masukkan panjang data yang diinputkan :");
        arLength = inData.nextInt();
        
        int data[] = new int[arLength];
        
        //masukkan data array
        System.out.println("Masukkan bilangan Genap sebanyak " + arLength + " kali!");
        for(int i = 0; i < arLength; i++){
            System.out.print("Bilangan genap ke-" + (i+1) + " : ");
            data[i] = inData.nextInt();
            if(data[i] % 2 == 1){
                System.out.println("");
                System.out.println("Maaf bilangan yang Anda masukkan bukan bilangan genap!");
                System.out.print("Mohon masukkan ulang Bilangan ke-" + (i+1) + " : ");
                data[i] = inData.nextInt();
            }
        }
        //tampilkan array yang diinputkan
        System.out.println("");
        System.out.print("Bilangan yang Anda masukkan : ");
        for(int x = 0; x < arLength; x++){
            System.out.print(data[x] + " ");
        }

        //urutkan array
        for(int y = 0; y < arLength-1; y++){
            for(int z = 0; z < arLength-y-1; z++){
                if(data[z] > data[z+1]){
                    temp = data[z];
                    data[z] = data[z+1];
                    data[z+1] = temp;
                }
            } 
        }
        
        //menampilkan hasil pengurutan
        System.out.println("");
        System.out.print("Bilangan setelah diurutkan  : ");
        for(int outputData : data){
            System.out.print(outputData + " ");
            
        }
        
    }
    
}
