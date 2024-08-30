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
public class Ativi18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float note1, note2, avarage;
        
        System.out.println("Digite a primeira nota");
        note1 = input.nextFloat();
        System.out.println("Digite a primeira nota");
        note2 = input.nextFloat();
        
        avarage =(note1 + note2) / 2;
        
        if (avarage == 10)
            System.out.println("Aprovado com Distinção");
        else if (avarage >= 7)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }
    
}
