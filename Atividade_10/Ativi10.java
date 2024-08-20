/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades;

import java.util.Scanner;

/**
 *
 * @author pc gamer
 */
public class Ativi10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, mult;
        float num3,sum,cube;
        
        System.out.println("Digite o primeiro numero inteiro:");
        num1 = input.nextInt();
        
        System.out.println("Digite o segundo numero inteiro:");
        num2 = input.nextInt();
        
        System.out.println("Digite o primeiro numero real:");
        num3 = input.nextFloat();
        
        mult =(num1*2)*(num2/2);
        
        sum =(num1*3)+num3;
        
        cube =(num3*num3)*num3;
        
        System.out.println("O produto do dobro do primeiro com metade do segundo:"+mult);
        System.out.println("A somado triplo do primeiro com o terceiro:"+sum);
        System.out.println("O terceiro elevado ao cubo:"+cube);
    }
    
}
