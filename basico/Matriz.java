package basico;
import java.util.Scanner;

/*
    Matrizes

    - matriz: estrutura que armazena valores em linhas e colunas.
    - matriz possui duas dimensões: linha e coluna.
    - [] []: utilizados para declarar e acessar uma matriz.
    - índice: posição de um elemento. Começa em 0.
    - new: utilizado para criar uma matriz com tamanho definido.
    - length: informa a quantidade de linhas da matriz.
    - matriz[i].length: informa a quantidade de colunas de uma linha.
    - for: utilizado para percorrer as linhas e colunas.
    - for dentro de for: utilizado para percorrer toda a matriz.
*/

public class Matriz {
    public static void main(String[] args){

        //Matriz criada diretamente com valores
        int[][] numeros ={
            {10, 20, 30, 40},
            {50, 60, 70, 80},
            {90, 94, 96, 99}
        };

        //Acessando um elemento através da linha e da coluna
        System.out.println("Posição L0 C0 : "+numeros[0][0]);
        System.out.println("Posição L0 C1 : "+numeros[0][1]);
        System.out.println("Posição L0 C2 : "+numeros[0][2]);
        System.out.println("Posição L0 C3 : "+numeros[0][3]);

        //Quantidade de linhas da matriz
        System.out.println("Quantidade de linhas: "+numeros.length);
        
        //Quantidade de colunas da matriz
        System.out.println("Quantidade de colunas: "+numeros[0].length);
        
        
        //Percorrendo a matriz utilizando dois for
        System.out.println("\nElementos da Matriz\n");
        
        for(int i=0;i<numeros.length;i++){
            for(int j=0;j<numeros[i].length;j++){
                System.out.print(" | "+numeros[i][j]);
            }
            System.out.println(" |");
        }
        
        //Matriz criada com tamanho definido usando new
        System.out.println("\nPreenchendo a Matriz\n\n");
        int[][] valores = new int[2][3];
        Scanner scanner = new Scanner(System.in);
        
        //preenchendo a matriz
        for(int i=0;i<valores.length;i++){
            for(int j=0;j<valores[i].length;j++){
                System.out.printf("Linha %d | Coluna %d : ",i,j);
                valores[i][j] =scanner.nextInt();
            }
        }
        
        //Percorrendo a matriz
        for(int i=0;i<valores.length;i++){
            for(int j=0;j<valores[i].length;j++){
                System.out.print(" | "+valores[i][j]);
            }
            System.out.println(" |");
        }

        //Soma dos elementos,diaginal principal,maior e menor valores
        int soma = 0;
        int diagonalp = 0;
        int maiorvalor = valores[0][0];
        int menorvalor = valores[0][0];

        for(int i=0;i<valores.length;i++){
            for(int j=0;j<valores[i].length;j++){
             soma += valores[i][j];
             
             if(i==j){
                diagonalp += valores[i][j];
             }

             if(valores[i][j]<menorvalor){
                menorvalor = valores[i][j];
            }
            
            if(valores[i][j]>maiorvalor){
                 maiorvalor = valores[i][j];
             }
            }
        }
        
        System.out.println("\n\nSoma: "+soma);
        System.out.println("Diagonal Principal: "+diagonalp);
        System.out.println("Maior Valor: "+maiorvalor);
        System.out.println("Menor Valor: "+menorvalor);

        scanner.close();
    }
}
