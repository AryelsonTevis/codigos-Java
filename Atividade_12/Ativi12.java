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
public class Ativi12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float height, weightw, weightm;
        
        System.out.println("Digite sua altura em metros:");
        height = input.nextFloat();
        weightm = (float) ((72.7 * height) - 58);
        weightw = (float) ((62.1*height)-44.7);
        System.out.printf("Seu peso ideal para homem: %.3f\n" ,weightm);
        System.out.printf("Seu peso ideal para mulher: %.3f" ,weightw);
    }
    
}
