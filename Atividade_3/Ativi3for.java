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
public class Ativi3for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int i;
        float notas, media,aux=0;
        
        for (i=0;i<4;i++){
            System.out.println("Digite a "+(i+1)+" nota");
            notas = input.nextInt();
            aux+=notas;
        }
        media=aux/4;
        System.out.println("A medis das notas foram de"+media+" pontos");
    }
    
}
