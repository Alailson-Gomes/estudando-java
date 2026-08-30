package desafios;
import java.util.Scanner;
public class Matriz {
    public static void main(String[] args){

        //Nivel Facil
        int[][] matriz1 ={
            { 2, 4, 6 },
            { 8, 1, 3 },
            { 5, 7, 9 }
        };

        System.out.println("\nMatriz 1\n");
        for(int i=0;i<matriz1.length;i++){
            for(int j=0; j<matriz1[i].length;j++){
                System.out.print(" | "+matriz1[i][j]);
            }
            System.out.println(" | ");
        }


        //Nivel Medio
        Scanner scanner = new Scanner(System.in);
        int[][] matriz2 = new int[3][3];
        int soma=0;
        
        for(int i=0;i<matriz2.length;i++){
            for(int j=0;j<matriz2[i].length;j++){
                System.out.printf("Linha %d | Coluna %d : ",i,j);
                matriz2[i][j] = scanner.nextInt();        
                soma +=matriz2[i][j];
            }
            System.out.println("");
        }

        System.out.println("\nMatriz 2\n");

        for(int i=0;i<matriz2.length;i++){
            for(int j=0;j<matriz2[i].length;j++){
                System.out.print(" | "+matriz2[i][j]);
            }
            System.out.println(" | ");
        }


        System.out.println("\nSoma da matriz 2: "+soma);
        

        //Nivel Dificil
        System.out.println("\nMatriz 3\n");
        int[][] matriz3 = new int[4][4];


        //prencher
        for(int i=0;i<matriz3.length;i++){

            for(int j=0; j<matriz3[i].length;j++){
                System.out.printf("Linha: %d | Coluna %d: ",i,j);
                matriz3[i][j] = scanner.nextInt();
            }
            System.out.println("");
        }


        //Mostrar
        for(int i=0;i<matriz3.length;i++){
            for(int j=0;j<matriz3[i].length;j++){
                System.out.print(" | "+matriz3[i][j]);
            }
            System.out.println(" | ");
        }


        //Analisar
        int somatorio = 0;
        int diagonalp = 0;
        
        int[] posimaior = new int[2];
        int[] posimenor = new int[2];
        
        int maior = matriz3[0][0];
        int menor = matriz3[0][0];

         for(int i=0;i<matriz3.length;i++){
            for(int j=0;j<matriz3[i].length;j++){

                somatorio += matriz3[i][j];    
    
                if(i==j){
                   diagonalp += matriz3[i][j];
                }

                if(matriz3[i][j]>maior){
                   maior = matriz3[i][j];
                   posimaior[0]=i;
                   posimaior[1]=j;
                }

                if(matriz3[i][j]<menor){
                    menor = matriz3[i][j];
                    posimenor[0]=i;
                    posimenor[1]=j;
                }
            }
        }

        System.out.println("Soma matriz 3 : "+somatorio);
        System.out.println("Diagonal Principal : "+diagonalp);
        System.out.println("Maior elemento : "+maior);
        System.out.println("Menor elemento : "+menor);
        System.out.printf("Posição maior Linha: %d | Coluna: %d: ",posimaior[0],posimaior[1]);
        System.out.printf("Posição menor Linha: %d | Coluna: %d: ",posimenor[0],posimenor[1]);
        
        scanner.close();
    }
}
