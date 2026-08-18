/*
    Estruturas condicionais

    - if: executa um código se uma condição for verdadeira.
    - else: executa um código caso a condição do if seja falsa.
    - else if: verifica uma nova condição caso as anteriores sejam falsas.
    - switch: compara uma variável com valores específicos.
    - case: representa uma opção dentro do switch.
    - break: encerra a execução do switch.
    - default: executa quando nenhum case corresponde ao valor.
*/

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args){
        
        int ano = 2026;
        
        //if simples
        if(ano == 2026){
            System.out.println("Estamos em 2026");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
       
        //if , else
        if(idade>=18){
            System.out.println("\nVocê é maior de idade");
        }else{
            System.out.println("\nVocê é menor de idade");
        }

        //if , else if , else
        if (idade>=18 && idade<60){
            System.out.println("Você é adulto");
        }else if(idade>=60){
            System.out.println("Você é idoso");
        }else if(idade>=12){
            System.out.println("Você é adolescente");   
        }else{
            System.out.println("Você é criança");
        }
       
        System.out.println("\nVocê gosta de java?\n1-sim\n2-não");
        int opcao = scanner.nextInt();
        
        //switch case
        switch (opcao){

            case 1:
                System.out.print("Sim eu gosto de java");
                break;
            case 2:
                System.out.print("Não eu não gosto de java");
                break;
            default:
                System.out.println("A opção inválida");
        }

        scanner.close();
    
    }
}
