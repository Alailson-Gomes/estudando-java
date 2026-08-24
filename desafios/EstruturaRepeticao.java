package desafios;
import java.util.Scanner;

public class EstruturaRepeticao {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Nivel Facil
        for(int i =1;i<=10;i++){
            System.out.printf("Número: %d \n",i);
        }


        //Nivel Medio
        System.out.println("Somar todos os numero até: ");
        int n = scanner.nextInt();
        int i = 0;
        int soma = 0;
        
        while(i<n){
            i = i+1;
            soma +=i;
        }

        System.out.println(soma);

        //Nivel Dificil 
        String senha = "java123";
        String tentativa;

        
        do{
            System.out.print("Digite a senha: ");
            tentativa = scanner.next();

            if (tentativa.equals(senha)) {
                System.out.println("Acesso concedido");
            }else {
                System.out.println("Acesso negado, tente novamente");
            }

        }while(!tentativa.equals(senha));

        scanner.close();
    }
}