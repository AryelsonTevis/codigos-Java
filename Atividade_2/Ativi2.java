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
public class Ativi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2,result;
        
        System.out.println("Digite o primeiro número");
        number1 = input.nextInt();
        System.out.println("Digite o segundo número");
        number2 = input.nextInt();
        
        result=number1+number2;
        
        System.out.println("A soma dos números resultaram em: " +result);
    }
    
}
