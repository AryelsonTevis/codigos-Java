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
public class Ativi19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3;
        
        System.out.println("Digite o primeiro número");
        number1 = input.nextInt();
        System.out.println("Digite o segundo número");
        number2 = input.nextInt();
        System.out.println("Digite o terceira número");
        number3 = input.nextInt();
        
        if (number1 > number2 && number1>number3 )
            System.out.println("O primeiro número: "+number1+", foi o maior");
        else if (number2 > number1 && number2>number3 )
            System.out.println("O segundo número: "+number2+", foi o maior");
        else
            System.out.println("O terceiro número: "+number3+", foi o maior");
    }
    
}
