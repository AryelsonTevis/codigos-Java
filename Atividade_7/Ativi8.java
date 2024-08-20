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
public class Ativi8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        float celsius, fahrenheit;
        
        System.out.println("Digite sua temperatura em Fahrenheit:");
        fahrenheit = input.nextInt();
        celsius = (fahrenheit-32)*5/9;
        System.out.printf("sua temperatura em Celsius: %.2f" ,celsius);
    }
    
}
