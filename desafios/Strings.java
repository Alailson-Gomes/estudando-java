package desafios;
import java.util.Scanner;


public class Strings{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Nivel Facil
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("\nQuantidade de caracteres: "+nome.length());
        System.out.println("\nPrimeiro caractere: "+nome.charAt(0));
        System.out.println("\nTudo em Maiusculo: "+nome.toUpperCase());
        System.out.println("\nTudo em Minusculo: "+nome.toLowerCase());


        //Nivel medio
        System.out.print("\n Digite uma frase:");
        String frase = scanner.nextLine();
        

        System.out.println("\nQuantidade de caracteres: "+frase.length());
        System.out.println("\nCotem (java)?  "+frase.contains("java"));
        System.out.println("\nInicia com (A)? "+frase.startsWith("A"));
        System.out.println("\nTermina em (!)? "+frase.endsWith("!"));
        System.out.println("\nTudo maiuculo: "+frase.toUpperCase());


        //Nivel Dificil
        System.out.println("\n\n VAlidação de cadastro\n");
        
        System.out.print("\n Usuário: ");
        String usuario = scanner.nextLine();
        
        System.out.print(" Email: ");
        String email = scanner.nextLine();
        
        System.out.print(" Senha: ");   
        String senha = scanner.nextLine();

        //validação de cadastro
        
        boolean[] resultados= validarCadastro(usuario, email, senha);
        boolean usuariovalido = resultados[0];
        boolean emailarroba =  resultados[1];
        boolean emailCom =  resultados[2];
        boolean senhavalida = resultados[3];
        boolean senha123 = resultados[4];

        detalhes(usuariovalido, emailarroba, emailCom, senhavalida, senha123);
        situacaoCadastro(usuariovalido, emailarroba, emailCom , senhavalida);
    }

    
    static boolean[] validarCadastro(String usuario, String email, String senha){

        boolean usuariovalido = usuario.length()>=3;
        boolean emailarroba = email.contains("@");
        boolean emailCom = email.endsWith(".com");
        boolean senhavalida = senha.length()>=8;
        boolean senha123 = senha.contains("123");

       return new boolean[]{
        usuariovalido,
        emailarroba,
        emailCom,
        senhavalida,
        senha123
       };
    }   

    static void detalhes(boolean usuariovalido, boolean emailarroba, boolean emailCom, boolean senhavalida,  boolean senha123 ){
        System.out.println("\nUsuario valido: "+usuariovalido);
        System.out.println("\nEmail contem (@): "+emailarroba);
        System.out.println("\nEmail termina em (.com): "+emailCom);
        System.out.println("\nSenha >= 8 caracteres: "+senhavalida);
        System.out.println("\nSenha contem 123: "+senha123);
    }

    static void situacaoCadastro(boolean usuariovalido, boolean emailarroba, boolean emailCom, boolean senhavalida){
        if(usuariovalido && emailarroba && emailCom && senhavalida ){
            System.out.println("\nCadastro realizado com sucesso!");
        }else{
            System.out.println("\nCadastro não realizado!");
        }
    }
}

