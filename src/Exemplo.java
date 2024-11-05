import java.util.Scanner;

public class Exemplo
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in))
        {
            while (true)
            {
                System.out.println("Digite o nome (ou 'sair' para encerrar):");
                String nome = lerNome(sc);
                if (nome.equalsIgnoreCase("sair")) break;
                System.out.println("Digite a idade:");
                int idade = lerIdade(sc);
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println();
            }
        }
    }
    public static String lerNome(Scanner sc)
    {
        return sc.nextLine();
    }
    public static int lerIdade(Scanner sc)
    {
        return sc.nextInt();
    }
}