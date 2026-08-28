package basico;
/*
    Tipos primitivos

    - byte: número inteiro pequeno (-128 a 127)
    - short: número inteiro (-32.768 a 32.767)
    - int: número inteiro (-2.147.483.648 a 2.147.483.647)
    - long: número inteiro muito grande
    - float: número decimal (aprox. 6 a 7 dígitos de precisão)
    - double: número decimal (aprox. 15 a 16 dígitos de precisão)
    - char: um único caractere
    - boolean: valor lógico (true ou false)

    Casting - conversão de tipos
    - Implícito: conversão automática para um tipo compatível
    - Explícito: conversão feita manualmente usando (tipo)

    Constantes
    - final: impede que o valor de uma variável seja alterado

    null
    - Representa ausência de referência em tipos que trabalham com objetos
*/
public class TiposPrimitivos{
    public static void main(String[] args){

        byte pequeno = 127;
        short medio = 32767;
        int grande =2147483647;
        long muitoGrande = 9223372036854775807L;
        float decimalpequeno = 3.14f;
        double decimalgrande = 3.141592653589793;
        char caractere = 'A';
        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println(pequeno);
        System.out.println(medio);
        System.out.println(grande);
        System.out.println(muitoGrande);
        System.out.println(decimalpequeno);
        System.out.println(decimalgrande);
        System.out.println(caractere);
        System.out.println(verdadeiro);
        System.out.println(falso);


        //Casting - conversão de tipos
        int numero = 10 ;
        double valor = numero;
        System.out.println("\n"+valor);
        
        //Conversão explicita
        double nd = 14.1467;
        int ni =(int)nd;
        System.out.println(ni);

        //Constantes
        final double PI = 3.14159;
        System.out.println(PI);

        //null. objetos/referências
        String nome = null;
        System.out.println(nome);
        nome = "Alailson";
        System.out.println(nome);
    }
}