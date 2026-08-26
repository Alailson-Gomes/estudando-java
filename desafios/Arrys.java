package desafios;
import java.util.Scanner;

public class Arrys {
    public static void main(String[] args){
        
        //Nivel Facil
        int[] numeros = {11,22,33,44,55};

        for (int i=0;i<numeros.length;i++){
            System.out.println("Número: "+numeros[i]);
        }


        //Nivel Médio
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[3];
        double soma=0;
        double media=0.0;
        
        System.out.println("\n\nDigite suas notas\n");
        
        for(int i=0;i<notas.length;i++){
            System.out.printf("Informe a %dº nota: ",i+1);
            notas[i] = scanner.nextDouble();
            soma +=notas[i];
        }
        
        System.out.println("\n\nNotas digitadas\n");
        for(int i=0;i<notas.length;i++){
            System.out.printf("%dº nota: %.2f \n",i+1,notas[i]);
        }

        media = soma/notas.length;
        System.out.println("\n\nInformações\n");
        System.out.printf("Soma: %.2f \n",soma);
        System.out.printf("Média: %.2f",media);


        //Nivel Dificil
        System.out.println("\n\nInforme 10 valores inteiros\n");
        int[] valores = new int[10];

        for(int i=0;i<valores.length;i++){
            System.out.printf("%dº valor : ",i+1);
            valores[i] = scanner.nextInt();
        }
        
        int maior=valores[0];
        int posimaior=0;
        int menor=valores[0];
        int posimenor=0;

        for (int i=0;i<valores.length;i++){
            if (valores[i]>maior) {
                maior = valores[i];
                posimaior = i;
            }else if(valores[i]<menor){
                menor = valores[i]; 
                posimenor = i;
            }
        }

        System.out.printf("Maior valor: %d  | posição %d\n",maior,posimaior+1);
        System.out.printf("Menor valor: %d  | posição %d\n",menor,posimenor+1);
        scanner.close();
    }
}
