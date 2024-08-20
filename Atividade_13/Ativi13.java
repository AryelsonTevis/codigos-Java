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
public class Ativi13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float weight, excess, fine;
        
        System.out.println("Digite o peso de peixe pescado:");
        weight = input.nextFloat();
        
        excess = weight - 50;
        fine = (float) (excess * 4.00);
        System.out.printf("Peso de peixes pescados: %.2f\n" ,weight);
        System.out.printf("Peso em excesso: %.2f\n" ,excess);
        System.out.printf("Multa a pagar:%.2f" ,fine);
    }
    
}
