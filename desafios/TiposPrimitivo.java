package desafios;

public class TiposPrimitivo {
    public static void main(String[] args){
        
        
        //Nivel Facil
        String nome = "Alailson";
        char inicial = 'A';
        int idade = 20;
        double peso = 60.00;
        double altura = 1.60;
        boolean estudando = true;
        
        System.out.println("Nome: "+nome);
        System.out.println("Inicial: "+inicial);
        System.out.println("Idade: "+idade);
        System.out.printf("Peso: %.2f"+"kg\n",peso);
        System.out.printf("Altura: %.2f"+"m\n",altura);
        System.out.println("Estudando: "+estudando);


        //Nivel medio
        String produto = "Café";
        int estoque = 10;
        double preco = 14;
        char inicialp = 'C';
        boolean disponivel = true;

        System.out.println("\nProduto: "+produto);
        System.out.println("Estoque: "+estoque);
        System.out.printf("Preço: R$ %.2f \n",preco);
        System.out.println("Inicial: "+inicialp);
        System.out.println("Disponivel: "+disponivel);


        //Nivel dificil
        String nomeA = "Alailson";
        int idadeA = 20;
        double alturaA = 1.60;
        int nota1 = 10;
        int nota2 = 8;
        boolean aprovacao = true;
        double media = (nota1+nota2)/2;

        String linha = "===================";
        System.out.println(linha);
        System.out.println("Cadastro Aluno");
        System.out.println(linha);
        System.out.println("Nome: "+nomeA);
        System.out.println("Idade: "+idadeA);
        System.out.printf("Altura: %.2f m",alturaA);
        System.out.println("\n Nota1: "+nota1);
        System.out.println("Nota2: "+nota2);
        System.out.println("Média: "+media);
        System.out.println("Aprovado: "+aprovacao);
        System.out.println(linha);

    }
}
