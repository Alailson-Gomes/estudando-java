package basico;
import java.util.Scanner;
/*
    Arrays

    - array: estrutura que armazena vários valores do mesmo tipo.
    - índice: posição de um elemento dentro do array. Começa em 0.
    - []: utilizado para declarar um array e acessar seus elementos.
    - new: utilizado para criar um array com tamanho definido.
    - length: informa a quantidade de elementos do array.
    - array[i]: acessa o elemento que está na posição i.
    - for: pode ser utilizado para percorrer todos os elementos do array.
*/

public class Arrays {
    public static void main(String[] args){

        //Array criado diretamente com valores
        int[] valores ={100,200,300,400,500};
        
        //Acessando um elemento através do índice
        System.out.println("Índice 0 : R$ "+valores[0]);
        
        //length informa a quantidade de elementos
        System.out.printf("Quantidade de elementos: %d\n",valores.length);
        
         //Array criado com tamanho definido usando new
        int[] numeros = new int[5];

        //Atribuindo valores individualmente às posições
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        System.out.println("\nPosições e elementos\n");
        //Percorrendo o array utilizando for
        for (int i=0;i<numeros.length;i++){
            System.out.printf("Posição %d elemento: %d \n",i,numeros[i]); 
        }
        
        System.out.println("\nArrays com String \n");
        //Array de String 
        String[] nomes ={"Alaison","Yachi","Wesley"};

        //Acessando elementos do array de String
        for(int i=0;i<nomes.length;i++){
            System.out.println("Nome: "+nomes[i]);
        }

        //Array com Scanner  
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[5];

        System.out.println("\nArrays com Scanner\n");
        for(int i=0;i<idades.length;i++){
            System.out.print("idade: ");
            idades[i]=scanner.nextInt();
        }

        System.out.println("\nApresentando Array Idade\n");
        for(int i=0;i<idades.length;i++){
            System.out.printf("Idade: %d \n",idades[i]);
        }

        scanner.close();
    }
}