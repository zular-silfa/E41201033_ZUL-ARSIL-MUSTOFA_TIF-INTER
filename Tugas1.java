/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Zul Arsil Mustofa
 */
public class Tugas1 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1, s2, s3;
        s1 = "ABC";
        s2 = new String("DEF");
        s3 = "AB" + "C";
        
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3 == s1);
        System.out.println(s2.compareTo(s3));
        System.out.println(s3.equals(s1));
    }
    
}
