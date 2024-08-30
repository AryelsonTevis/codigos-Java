/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades2;
import java.util.Scanner;
/**
 *
 * @author pc gamer
 */
public class Ativi16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char latter;
        
        System.out.println("Digite M-masculino, F-feminino");
        latter = input.next().charAt(0);
        
        if(latter == 'M' | latter=='m')
            System.out.println("Masculino");
        else if  (latter == 'F' | latter=='f')
        System.out.println("Feminina");
        else
        System.out.println("Sexo Inválido");
    }
            
        
    }