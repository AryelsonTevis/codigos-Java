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
public class Ativi5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        float ray, area;
        
        System.out.println("Digite o raio do círculo:");
        ray = input.nextFloat();
        area = (float)(3.14 * (ray * ray));
        System.out.println("A área do círculo:" +area);
    }
    
}
