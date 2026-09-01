package basico;
import java.util.Random;
/*
    Métodos

    - método: bloco de código criado para realizar uma tarefa.
    - void: indica que o método não retorna um valor.
    - parâmetro: variável recebida pelo método.
    - argumento: valor passado ao chamar o método.
    - return: utilizado para retornar um valor.
    - static: permite chamar o método diretamente pela classe.
    - método sem parâmetros: não recebe valores.
    - método com parâmetros: recebe valores para utilizar durante a execução.
    - métodos podem receber mais de um parâmetro.
    - métodos podem retornar diferentes tipos de valores, como int, double e boolean.
    - um método pode chamar outro método.
*/
   
public class Metodos{
    public static void main(String[] args){
       
        
        String nome = "Alailson";
        double n1 = 10.2, n2 = 4.8;
        int idade = 20;
        int valor = 5;
        boolean maior = maioridade(idade);
        double resultado = somar(n1,n2);
        int num = numero();
        int dobro = dobrar(valor);
        int quadruplo = quadruplicar(valor);

        //chamando os metodos
        boasvindas();
        mostrarnome(nome);
        System.out.println("Resultado: "+resultado);
        System.out.println("Numero qualquer: "+num);
        System.out.println("Maior de idade? "+maior);
        System.out.println("Dobrar (5): "+dobro);
        System.out.println("Quadruplicar (5): "+quadruplo);
    }


    //Método sem parâmetros e sem retorno
    static void boasvindas(){
        System.out.println("Seja bem-vindo(a)!");
    }


    //Método com parâmetro e sem retorno
    static void mostrarnome(String nome){
        System.out.println("Olá, "+nome);
    }


    //Método com parâmetros e com retorno
    static double somar(double n1,double n2){
        return n1+n2;
    }


    //Método sem parâmetros e com retorno
    static int numero(){
        Random gerar = new Random();
        return gerar.nextInt(100)+1;
    }


    //Método boleano com parâmetros e com retorno
    static boolean maioridade(int idade){
      return idade >=18;
    }


    //Método chamando metodo, com parâmetros e com retorno
    static int dobrar(int valor){
        return valor*2;
    }

    static int quadruplicar(int valor){
        return dobrar(dobrar(valor));
    }
}