/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escolhas;

import java.util.Scanner;

/**
 *
 * @author 5164035
 */
public class Escolhas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
       double aux, num, pot,aux2;
       int opc=0,opc2 =0;
       
       while(opc !=5){
        System.out.println("#########Escolha#########");
        System.out.println("\t 1-Tabuada");
        System.out.println("\t 2-Potencia");
        System.out.println("\t 3-Fatorial");
        System.out.println("\t 4-Raiz quadrada");
        System.out.println("\t 5-Sair");
        System.out.println("#########################");
        System.out.print("Digite sua escolha ");
        opc = input.nextInt();
        
        switch (opc){
        case 1:
            while (opc2 !=5){
                num = 0;
                
                System.out.println("#########Escolha o operador#########");
                System.out.println("\t\t 1-Soma");
                System.out.println("\t\t 2-Subtração");
                System.out.println("\t\t 3-Multiplicação");
                System.out.println("\t\t 4-Divisão");
                System.out.println("####################################");
                System.out.print("Digite sua escolha ");
                opc2 = input.nextInt();
                
                System.out.print("Digite o número para calcular na tabuada (1 a 10): ");
                num = input.nextFloat();
                switch (opc2){
                    case 1:
                        for (int i = 0; i < 10; i++) {
                            System.out.println(num+" + "+i+" = "+(num+i));
                        }
                        break;
                    case 2:
                        for (int i = 0; i < 10; i++) {
                            System.out.println((num+i)+" - "+i+" = "+num);
                        }
                        break;
                    case 3:
                        for (int i = 0; i < 10; i++) {
                            System.out.println(num+" * "+i+" = "+(num*i));
                        }
                        break;
                    case 4:
                        for (int i = 0; i < 10; i++) {
                            System.out.println((num*i)+" / "+i+" = "+num);
                        }
                        break;
                    default:
                        System.out.println("Opção inválida");      
                }
            }
            break;
        case 2:
            System.out.print("Digite o sua base: ");
            num = input.nextDouble();
            System.out.print("Digite o sua potencia: ");
            pot = input.nextDouble();
            aux = Math.pow(num, pot);
           
            System.out.println(num + " Elevado a "+pot+" o resutado = "+aux);
            break;
        case 3:
            aux2=1;
            num= aux= 0;
            System.out.print("Digite o numero que vai ser fatorado: ");
            num = input.nextDouble();
            aux=num;
            while(aux>=2){
              aux2*=aux;
              aux--;
            }
            System.out.println("O resultado de "+num+" fatorado ="+aux2);
            break;
        case 4:
            System.out.print("Digite o numero que deseja saber a raiz quadrada: ");
            num = input.nextDouble();
            
            System.out.println("A raiz quadrada de "+num+" ="+ (Math.sqrt(num)));
            break;
        case 5:
            System.out.println("Tchau!!!");
            break;
        default:
            System.out.println("Opção inválida");
        }
    }
}
}
