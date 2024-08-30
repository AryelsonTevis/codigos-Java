/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades2;
import java.util.Scanner;
/**
 *
 * @author pc gamer
 */
public class Ativi17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char latter;
        
        System.out.println("Digite uma letra:");
        latter = input.next().charAt(0);
        
        if (latter == 'A' ||latter == 'E' ||latter == 'I' ||latter == 'O' ||latter == 'U' ||latter == 'a' ||latter == 'e' ||latter == 'i' ||latter == 'o' ||latter == 'u')
            System.out.println("A letra "+latter+" é uma vogal");
        else
            System.out.println("A letra "+latter+" é uma consoante");
    }
    
}
