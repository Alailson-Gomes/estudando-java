package basico;
/*
    Strings

    - String: representa uma sequência de caracteres.
    - índice: posição de um caractere. Começa em 0.
    - length(): quantidade de caracteres.
    - charAt(): acessa um caractere pelo índice.
    - equals(): compara o conteúdo de duas Strings.
    - equalsIgnoreCase(): compara ignorando maiúsculas e minúsculas.
    - toUpperCase(): converte para maiúsculas.
    - toLowerCase(): converte para minúsculas.
    - contains(): verifica se contém determinado texto.
    - substring(): extrai parte da String.
*/

public class Strings{
    public static void main(String[] args){

    String nome = "Alailson";

    //Quantidade de caracteres
    System.out.println("\nQuantidade de caracteres: "+nome.length());

    //Acessando um caractere
    System.out.println("\nCaracter do índice 5:"+nome.charAt(5));

    String palavra1 = "Estudando";
    String palavra2 = "Estudando";
    String texto1 = "Java";
    String texto2 = "java";

    //Comparando duas palavras
    System.out.println("\nAs palavras são iguais? "+ palavra1.equals(palavra2));
    System.out.println("\nSão iguais? ignorando maiúscula e minúscula. "+texto1.equalsIgnoreCase(texto2));

    //Convertendo maiúsculas e minúsculas
    System.out.println("\nConvertendo para maiúsculo: "+nome.toUpperCase());
    System.out.println("\nConvertendo para minúsculo: "+nome.toLowerCase());

    //Verificando se contém um texto
    System.out.println("\nO nome contém 'lail' ? "+nome.contains("lail"));

    //Extraindo parte da String
    System.out.println("\nParte da String do índice 0 a 5: "+nome.substring(0,5));

    //Verifica se começa com determinado texto
    System.out.println("Começa com A? "+nome.startsWith("A"));

    //Verifica se termina com determinado texto
    System.out.println("Termina em son? "+nome.endsWith("son"));

    //Remove espaços no início e no final
    String texto = "   Java   ";
    System.out.println("'" + texto.trim() + "'");

    }
}