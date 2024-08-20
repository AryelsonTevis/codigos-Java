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
public class Ativi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       float note1, note2, note3, note4, avg;
        System.out.println("Digite a primeira nota:");
        note1 = input.nextFloat();
        System.out.println("Digite a segunda nota:");
        note2 = input.nextFloat();
        System.out.println("Digite a terceira nota:");
        note3 = input.nextFloat();
        System.out.println("Digite a quarta nota:");
        note4 = input.nextFloat();
        
        avg = (note1 + note2 + note3 + note4 )/4;
        System.out.println("A media das notas foi de :"+ avg);
    }
    
}
