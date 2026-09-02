package desafios;
import java.util.Scanner;

public class Metodos {
    public static void main(String[] args){

        //Nivel Facil
        System.out.println("SaudaÇão\n");
        saudacao();
        
        
        //Nivel Medio
        System.out.println("Calcular\n");

        double n1=10,n2=2;
        double soma = somar(n1,n2);
        double subtracao = subtrair(n1, n2);
        double multiplicacao = multiplicar(n1, n2);
        double divisao = dividir(n1, n2);
        
        System.out.printf("Soma entre %.2f e %.2f : %.2f\n",n1,n2,soma);
        System.out.printf("Subtração entre %.2f e %.2f : %.2f\n",n1,n2,subtracao);
        System.out.printf("Multiplicação entre %.2f e %.2f : %.2f \n",n1,n2,multiplicacao);
        System.out.printf("Divisão entre %.2f e %.2f : %.2f\n",n1,n2,divisao);
        
        
        //Nivel Dificil
        System.out.println("\n\nVerificar aprovação\n");
        Scanner scanner = new Scanner(System.in);
        double nota1,nota2,nota3,media;
        boolean situacao;
        
        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();
        nota3 = scanner.nextDouble();

        media = calcularMedia(nota1,nota2,nota3);
        situacao = verificarAprovacao(media);     

        mostrarResultados(nota1,nota2,nota3,media,situacao);

        scanner.close();
    }

    //Metodos
    static void saudacao(){
        System.out.println("Olá, seja bem-vindo!");
    }

    static double somar(double n1,double n2){
        return n1+n2;
    }
    
    static double subtrair(double n1,double n2){
        return n1-n2;
    }
    
    static double multiplicar(double n1,double n2){
        return n1*n2;
    }
    
    static double dividir(double n1,double n2){
        return  n1/n2;
    }

    static double calcularMedia(double nota1, double nota2, double nota3){
        return (nota1 + nota2 + nota3) / 3;
    }

    static boolean verificarAprovacao (double media){
        return media >= 7.0;
    }

    static void mostrarResultados (double nota1, double nota2, double nota3,double media,boolean situacao){
        System.out.printf("\n\nSituação do aluno\n\n");
        System.out.printf("Notas: %.2f, %.2f, %.2f \n",nota1, nota2, nota3);
        System.out.printf("Média: %.2f \n",media);
        if(situacao){
            System.out.println("Situação : Aprovado ");
        }else {
            System.out.println("Situação : Reprovado ");
        }
    }
}