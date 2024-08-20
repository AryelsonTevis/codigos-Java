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
public class Ativi6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        float side, area;
        
        System.out.println("Digite a medida do lado do quadrado:");
        side = input.nextFloat();
        area = side*side;
        System.out.println("Sua area é de:" +area+ "\nO dobro dela seria:"+area*2);
    }
    
}
