package basico;
/*
    Operadores

    - Aritméticos: +, -, *, /, %
    - Atribuição: =, +=, -=, *=, /=, %=
    - Relacionais: ==, !=, >, <, >=, <=
    - Lógicos: &&, ||, !
    - Incremento e decremento: ++, --
    - Ternário: ?:
    
    Precedência:
    - Parênteses: ()
    - Aritméticos: *, /, % → +, -
    - Relacionais: <, >, <=, >=
    - Igualdade: ==, !=
    - Lógicos: && → ||
    - Ternário: ?:
*/

public class Operadores {
    public static void main(String[] args){

        //Operações básicas
        int a = 100;
        int b = 20;
        int soma = a+b;
        int sub = a-b;
        int mult = a*b;
        float div = (float) a/b;
        int res = a%b;
        System.out.println("Soma: "+soma );
        System.out.println("Subtração: "+sub );
        System.out.println("Multiplicação: "+mult );
        System.out.println("Divisão: "+div );
        System.out.println("Resto: "+res );


        //Operadores de atribuição
        int idade = 20;
        idade += 1;
        System.out.println("Idade+ "+idade);
        idade -= 1;
        System.out.println("Idade- "+idade); 
        idade *= 2;
        System.out.println("Idade* "+idade);
        idade /= 2;
        System.out.println("Idade/ "+idade);
        idade %= 2;
        System.out.println("Idade%"+idade);
        

        //Operadores relacionais
        int d = 10;
        System.out.println("Maior que 9? "+(d>9));
        System.out.println("Menor que 11? "+(d<11));
        System.out.println("Igual a 10? "+(d==10));
        System.out.println("Diferente de 10? "+(d!=10));
        System.out.println("Maior ou igual a 10? "+(d>=10));
        System.out.println("Menor ou igual a 10? "+(d<=10)); 
        

        //Operadores lógicos
        int peso = 50;
        boolean estudando = true;
        System.out.println("Peso>10 e <100: "+(peso>10 && peso<100));
        System.out.println("Peso>100 ou <60: "+(peso>100 || peso<60 ));
        System.out.println("Não estou estudando: "+(!estudando));
        

        //Operadores incremento e decremento
        int k = 10;
        System.out.println("k = "+k);
        k++;
        System.out.println("Incrementar +1: " + k);
        k--;
        System.out.println("Decrementar -1: " + k);


        //Operador Ternario
        int idadea = 18;
        String resultado = idadea>=18 ? "Maior de idade" : "Menor de idade" ;
        System.out.println(resultado);

        //Oredem de precedencia
        System.out.println("\n\nOrdem de precedencia\n");
        double conta = 2-2+3*4/2;
        System.out.println(conta);

    }
}
