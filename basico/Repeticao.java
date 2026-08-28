package basico;
/*
    Estruturas de repetição

    - while: repete enquanto uma condição for verdadeira.
    - do while: executa o código pelo menos uma vez e depois verifica a condição.
    - for: repete código enquanto uma condição for verdadeira, geralmente usado
      quando sabemos ou controlamos a quantidade de repetições.
    - break: interrompe o loop completamente.
    - continue: pula a repetição atual e passa para a próxima.
    - loops aninhados: um loop dentro de outro loop.
*/

import java.util.Scanner;

public class Repeticao{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);


        //While
        System.out.println("\nContagem regressiva iniciando em: ");
        int contador = scanner.nextInt();
        while(contador>=1){
            System.out.println("Contagem regressiva: "+contador);
            contador--;
        }


        //Do While
        int num;
        do{
            System.out.println("Mensagem ativada ");
            System.out.println("Digite 1 para sair do loop: ");
            num = scanner.nextInt();
            
        }while(num!=1);


        //For
        System.out.println("\n\nContar até qual número? ");
        int cont = scanner.nextInt();
        for(int i=1;i<=cont;i++){
            System.out.println("Contagem: "+i);
        } 


        //for com continue e break
        System.out.println("\nA função a seguir tem limitação, tente descubrir");
        System.out.println("\nFiltar número pares até qual número? ");
        int valor = scanner.nextInt();
        for(int i=0;i<=valor;i++){
            if(i==0){
                System.out.println("Par: "+i);
            }else if(i>10){
                break;
            }else if(i % 2 !=0){
                continue;
            }
            System.out.println("Par: "+i);
        }
        
        //loops dentro de loops
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.printf("Linha: %d , Coluna: %d \n",i,j);
            }
        }

        scanner.close();
    }
}