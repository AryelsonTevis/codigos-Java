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
public class Ativi11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float height, weight;
        
        System.out.println("Digite sua altura em metros:");
        height = input.nextFloat();
        weight = (float) ((72.7 * height) - 58);
        System.out.printf("Seu peso ideal: %.3f" ,weight);
    }
    
}
