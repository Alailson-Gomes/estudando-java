package desafios;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListexercicio {
    public static void main (String[] args){

        //Nivel Facil
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.print("\nDigite um nome: ");
            nomes.add(scanner.nextLine());
        }

        System.out.print("\n\nNomes registrados\n");
        System.out.printf("Quantidade de Nomes registrados: %d\n\n",nomes.size());

        for(int i=0;i<nomes.size();i++){
            System.out.printf("\n%dº Nome: %s",i+1, nomes.get(i));
        }



        //Nivel Medio
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.print("\n\nRegistrados Números\n");
        
        for(int i=0;i<5;i++){
            System.out.print("\nDigite um numero: ");
            numeros.add(scanner.nextInt());
        }
        
        System.out.println("\n\nMostrando Números\n");
        
        for(int i=0;i<numeros.size();i++){
            System.out.printf("\n Numeros: %d", numeros.get(i));
        }
        
        numeros.set(2,20);
        numeros.remove(4);
        
        System.out.println("\n\nMostrando Números\n");
        for(int i=0;i<numeros.size();i++){
            System.out.println("\n Numeros: "+numeros.get(i));
        }
        System.out.println("Tem o numero 10? "+numeros.contains(10));
        

        //Nivel Dificil
        ArrayList<String> nome = new ArrayList<>();
        System.out.println("Desafio Dificil");
        System.out.print("Quantos nomes desejam registrar? ");
        int tamanho = scanner.nextInt();
        System.out.println(scanner.nextLine());
        
        
        for(int i=0;i<tamanho;i++){
            System.out.printf("\nDigite o %dª nome: ",i+1);
            nome.add(scanner.nextLine());
        }
        
        System.out.println("\n\nNomes Registrados ");
        for(int i=0;i<tamanho;i++){
            System.out.printf("\n%dª nome: %s",i+1,nome.get(i));
        }
        
        System.out.println("\n\nProcurar Nome: ");
        String busca = scanner.nextLine();
        boolean encontrado = nome.contains(busca);
        System.out.print("Esse nome esta na lista? "+encontrado);
        if (encontrado){
            System.out.println("\nRemovendo da lista\n");
            nome.remove(busca);
        }

        System.out.println("\n\nLista Final ");
        for(int i=0;i<nome.size();i++){
            System.out.printf("\n%dª nome: %s",i+1,nome.get(i));
        }
        scanner.close();
    }
}