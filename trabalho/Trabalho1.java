/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho1;

import java.util.Scanner;

/**
 *
 * @author 5164035
 */
public class Trabalho1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int options, number, aux, primo;
        Scanner input = new Scanner(System.in);

        options = 0;

        while (options != 3) {
            //Sistema de escolhas
            System.out.println("#############Escolha############");
            System.out.println("\t 1-Primo");
            System.out.println("\t 2-Par ou Impar");
            System.out.println("\t 3-Sair");
            System.out.println("################################");
            System.out.print("Digite uma opção: ");
            options = input.nextInt();

            switch (options) {
                case 1:
                    //Validar se o número e primo ou não
                    aux = 2;
                    primo = 1;
                    System.out.print("Digite um número: ");
                    number = input.nextInt();

                    if(number<=1)
                        primo = 0;
                    else{
                    while (aux < number && primo == 1) {

                        if ((number % aux) == 0) {
                            primo = 0;
                        } else {
                            primo = 1;
                        }

                        aux++;
                    }}
                    if (primo == 1) {
                        System.out.println("O número " + number + " é primo");
                    } else {
                        System.out.println("O número " + number + " não é primo");
                    }

                    break;
                case 2:
                    //Verificar se e Ipar ou par
                    System.out.print("Digite um número: ");
                    number = input.nextInt();
                    if ((number % 2) == 0) {
                        System.out.println("O numero " + number + " é par ");
                    } else {
                        System.out.println("O numero " + number + " é inpar");
                    }

                    break;
                case 3:
                    System.out.println("Tchau!");
                    break;
                default:
                    System.out.println("Opção inválido");
            }
        }
    }

}
