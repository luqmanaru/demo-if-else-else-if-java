package com.mycompany.strukturkontrolpemilihan;

/**
 * Demonstrasi If-Else-Else If Bertingkat
 * @author luqmanaru
 */
public class StrukturKontrolPemilihan {
    public static void main(String[] args) {
        double grade = 92.0;
        
        if (grade >= 90) {
            System.out.println("Excellent!");
        } 
        else if (grade >= 80) {  // grade < 90 && grade >= 80
            System.out.println("Good job!");
        }
        else if (grade >= 60) {  // grade < 80 && grade >= 60
            System.out.println("Study harder!");
        }
        else {  // grade < 60
            System.out.println("Sorry, you failed.");
        }
    }
}
