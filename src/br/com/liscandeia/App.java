package br.com.liscandeia;

import java.util.*;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adicione pessoas na Lista: ");
        System.out.println("(1 - Adicionar) - XXXX(aperte quelquer tecla para sair )XXXX");
        String adiciona = scanner.next();
        while (isContinuar(adiciona)){
            System.out.println("Escreva o nome, sexo (F - feminino, M - masculino) e idade separados por vírgula: ");
            String entrada = scanner.next();
            String[] partes = entrada.split(",");
            if (partes.length == 3) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim();
                int idade = Integer.parseInt(partes[2].trim());
                Pessoa pessoa = new Pessoa(nome, sexo, idade);
                pessoas.add(pessoa);
                System.out.println("Deseja Continuar Adicionando? ");
                System.out.println("(1 - Adicionar) - XXXX(aperte quelquer tecla para sair )XXXX");
                adiciona = scanner.next();
            } else {
                System.out.println("Formato incorreto. Certifique-se de fornecer nome, sexo e idade separados por vírgula.");
                System.out.println("Deseja Continuar Adicionando? ");
                System.out.println("(1 - Adicionar) - XXXX(aperte quelquer tecla para sair )XXXX");
                adiciona = scanner.next();
            }
        }

        System.out.println("Lista de Mulheres Adicionadas: ");
        System.out.println("NOME   SEXO");
        pessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("f"))
                .forEach(p -> System.out.println(p.getNome() + "  -  "  + p.getSexo()));
        System.out.println("Lista de Homens Adicionadas: ");
        System.out.println("NOME   SEXO");
        pessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("m"))
                .forEach(p -> System.out.println(p.getNome() + "  -  " + p.getSexo()));
        if (!isContinuar(adiciona)){
            sair();
        }

    }

    private static void sair() {
        System.out.println("Saindo...");
    }

    private static boolean isContinuar(String adiciona) {
        return adiciona.equals("1");
    }
}