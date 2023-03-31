import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Quantas pessoas? ");
        int quantPessoas = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantPessoas; i++) {
            System.out.println((i + 1) + ". Nome: ");
            String nome = scanner.nextLine();

            System.out.println((i + 1) + ". Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println((i + 1) + ". Endereco: ");
            String endereco = scanner.nextLine();

            Pessoa pessoa = new Pessoa(nome, idade, endereco);
            pessoas.add(pessoa);
            System.out.println("Criado!");
        }
        System.out.println("Lista de pessoas cadastradas:");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Endereco: " + pessoa.getEndereco());
            System.out.println();
        }
    }
}