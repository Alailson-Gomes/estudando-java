package basico;
/*
    ArrayList

    - ArrayList: estrutura que armazena vários valores e possui tamanho dinâmico.
    - add(): adiciona um elemento ao ArrayList.
    - get(): acessa um elemento através do índice.
    - set(): altera um elemento existente.
    - remove(): remove um elemento.
    - size(): informa a quantidade de elementos.
    - contains(): verifica se um elemento está presente.
    - isEmpty(): verifica se o ArrayList está vazio.
    - clear(): remove todos os elementos.
*/

import java.util.ArrayList;
public class ArrayListEstudo {    
    public static void main(String[] args){
            //Criando um ArrayList de String
        ArrayList<String> nomes = new ArrayList<>();

        //Adicionando elementos
        nomes.add("Alailson");
        nomes.add("Yachi");
        nomes.add("Wesley");

        //Acessando um elemento através do índice
        System.out.println("Primeiro nome: " + nomes.get(0));

        //Quantidade de elementos
        System.out.println("Quantidade de nomes: " + nomes.size());

        //Alterando um elemento
        nomes.set(1, "João");

        //Percorrendo o ArrayList
        System.out.println("\nNomes:");

        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        //Verificando se um elemento existe
        System.out.println("\nContém Alailson? " + nomes.contains("Alailson"));

        //Removendo um elemento pelo índice
        nomes.remove(2);

        System.out.println("\nDepois da remoção:");

        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
    }
}
