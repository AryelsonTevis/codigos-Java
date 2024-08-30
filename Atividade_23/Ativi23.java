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
public class Ativi23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char latter;
        
        System.out.println("Digite M-matutino, V-Vespertino ou N- Noturno");
        latter = input.next().charAt(0);
        
        if(latter == 'M' | latter=='m')
            System.out.println("Bom Dia!");
        else if  (latter == 'V' | latter=='v')
        System.out.println("Boa Tarde!");
        else if  (latter == 'N' | latter=='n')
        System.out.println("Boa Noite!");
        else
            System.out.println("Letra inválida");
    }
            
        
    }