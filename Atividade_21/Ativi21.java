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
public class Ativi21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float value1, value2, value3;
        
        System.out.println("Digite o primeiro valor");
        value1 = input.nextFloat();
        System.out.println("Digite o segundo valor");
        value2 = input.nextFloat();
        System.out.println("Digite o terceiro valor");
        value3 = input.nextFloat();
        
        if (value2>value1 && value3>value1)
            System.out.println("O primeiro valor: "+value1+", é o melhor para comprar");
        else if (value3 > value2 && value1>value2)
            System.out.println("O segundo valor: "+value2+", é o melhor para comprar");
        else
            System.out.println("O terceiro valor: "+value3+", é o melhor para comprar");
    }
    
}
