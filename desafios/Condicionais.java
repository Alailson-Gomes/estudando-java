package desafios;
import java.util.Scanner;

public class Condicionais {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String linha = "========================";
        
        //Nivel Facil
        int idade = 0;

        System.out.println(linha);
        System.out.print("Verificção de idade \n");
        System.out.println(linha);
        
        System.out.print("Qual sua idade? ");
        idade = scanner.nextInt();
        scanner.nextLine();
        
        if (idade<=0){
            System.out.println("Idade inválida");
        }else if(idade >=18){
            System.out.println("Você é adulto!");
        }else if (idade<=12) {
            System.out.println("Você é uma criança!");                
        }else {
            System.out.println("Você é um adolecente!");                
        }
        System.out.println(linha+"\n\n");
        
    
        //Nivel Medio
        int nota1,nota2,nota3;
        double media;
        String nome;
        String situacao;

        System.out.println(linha);
        System.out.println("Situção Aluno");
        System.out.println(linha);
        
        System.out.print("Informe o nome do aluno: ");
        nome = scanner.nextLine();

        System.out.print("\n1º Nota : ");
        nota1 = scanner.nextInt();
        
        System.out.print("2º Nota : ");
        nota2 = scanner.nextInt();
        
        System.out.print("3º Nota : ");
        nota3 = scanner.nextInt();
        
        media = (nota1+nota2+nota3)/3.0;
        
        if (media<7 && media>=5){
            situacao = "Recuperação";
        }else if(media<5){
            situacao = "Reprovado";
        }else{
            situacao = "Aprovado";
        } 
        
        System.out.println(linha);
        System.out.println("Situção Aluno");
        System.out.println(linha);

        System.out.printf("Aluno: %s \n",nome);
        System.out.printf("Média: %.2f \n",media);
        System.out.printf("Situação: %s \n",situacao);
        System.out.println(linha);


        //Nivel dificil
        int opcao;

        System.out.println(linha);
        System.out.println("Cadastro");
        System.out.println(linha);
        
        System.out.println("Você pretende aprender Java? \n1-Sim \n2-Não \n3-Talvez");
        System.out.print("Opcao: ");
        opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Bons estudos");
                break;
            case 2:
                System.out.println("Que pena");
                break;
            case 3: 
                System.out.println("Indeciso?");
                break;
            default:
                System.out.println("Opção inválida");
        }
        System.out.println(linha);
        scanner.close();
    }
}