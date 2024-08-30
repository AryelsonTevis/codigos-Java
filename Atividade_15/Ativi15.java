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
public class Ativi15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        
        System.out.println("Digite um número");
        number = input.nextInt();
        
        if (number>0)
            System.out.println("O número "+number+" é positivo");
        else
            System.out.println("O número "+number+" é negativo");
    }
    
}
