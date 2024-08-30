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
public class Ativi14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2;
        
        System.out.println("Digite o primeiro numero: ");
        number1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        number2 = input.nextInt();
        
        if (number1>number2)
            System.out.println("O maior número digitado foi o primeiro: "+number1);
        else
            System.out.println("O maior número digitado foi o segundo: "+number2);
    }
    
}
