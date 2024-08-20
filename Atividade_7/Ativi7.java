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
public class Ativi7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        float hourlyrate, hoursworked;
        
        System.out.println("Digite o valor da sua hora trabalhada:");
        hourlyrate = input.nextFloat();
        System.out.println("Digite quantas horas você trabalhou esse mês:");
        hoursworked = input.nextFloat();
        hoursworked *= hourlyrate;
        System.out.printf("Sua salario desse mês foi de: %.2f" ,hoursworked);
    }
    
}
