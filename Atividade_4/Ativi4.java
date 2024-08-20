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
public class Ativi4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int meters, centimeters;
        
        System.out.println("Digite sua metragem:");
        meters = input.nextInt();
        centimeters = meters*100;
        System.out.println("Sua metragem convertida para centimetros:" +centimeters);
    }
    
}
