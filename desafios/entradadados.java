package desafios;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        String linha = "============================";

        //Nivel facil
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();

        System.out.println(linha);
        System.out.println("Informações");
        System.out.println(linha);
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Cidade: "+cidade);
        System.out.println(linha);
        
        
        //Nivel médio
        System.out.print("\nTitulo: ");
        String titulo = scanner.nextLine();
        
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        
        System.out.print("Publicado em: ");
        int publicado = scanner.nextInt();
        
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println(linha);
        System.out.println("Livro");
        System.out.println(linha);
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Publicado em: "+publicado);
        System.out.printf("Preço: R$ %.2f ",preco);
        System.out.println("\n"+linha);
        
        
        //Nivel dificil
        System.out.println("Nome: ");
        String nomef = scanner.nextLine();
        
        System.out.println("Idade: ");
        int idadef = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Cargo: ");
        String cargo = scanner.nextLine();
        
        System.out.println("Salario: ");
        double salario = scanner.nextDouble();
        
        System.out.println("Anos de empresa: ");
        int anoimpresa = scanner.nextInt();
        
        System.out.println("Trabalhando: ");
        boolean trabalho = scanner.nextBoolean();
        

        System.out.println(linha);
        System.out.println("Funcionario");
        System.out.println(linha);
        System.out.println("Nome: "+nomef);
        System.out.println("Idade: "+idadef);
        System.out.println("Cargo: "+cargo);
        System.out.println("Anos de empresa: "+anoimpresa);
        System.out.printf("Salario: R$ %.2f ",salario);
        System.out.println("Trabalhando: "+trabalho);
        System.out.println(linha);

        scanner.close();

    }
}
  