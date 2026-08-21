package basico;
/*
    Entrada de dados

    - Scanner: usado para receber dados digitados pelo usuário.
    - nextInt(): lê números inteiros.
    - nextDouble(): lê números decimais.
    - next(): lê uma palavra.
    - nextLine(): lê uma linha inteira, incluindo espaços.
    - next().charAt(0): lê um caractere.
    - nextBoolean(): lê true ou false.
    - close(): fecha o scanner.
*/

import java.util.Scanner;

public class EntradaDados{
  public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
    
     System.out.println("Digite seu nome: ");
     String nome = scanner.nextLine();

     System.out.println("Digite sua idade: ");
     int idade = scanner.nextInt();

     System.out.println("Digite seu peso: ");
     double peso = scanner.nextDouble();
     
     System.out.println("Digite sua Altura: ");
     double altura = scanner.nextDouble();
     
     System.out.println("Digite a inicial do nome: ");
     char inicial = scanner.next().charAt(0);
     
     System.out.println("Estudando? (true/false)");
     boolean estudando = scanner.nextBoolean();
     scanner.close();


     System.out.println("--- Dados pessoais ---"); 
     System.out.println("Nome: "+nome); 
     System.out.println("Idade: "+idade); 
     System.out.println("Peso: "+peso); 
     System.out.println("Altura: "+altura); 
     System.out.println("Inicial: "+inicial); 
     System.out.println("Estudando: "+estudando);   
             
  }
}