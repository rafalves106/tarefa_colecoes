/**
 * @author falvesmac
 */

package br.com.falves;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SegundaParte {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> masc = new ArrayList<>();
        ArrayList<String> fem = new ArrayList<>();

        System.out.println("Digite o nome da pessoas e seu sexo(Nome - M/F, Nome - M/F): ");
        String entrada = s.nextLine();
        String[] pessoas = entrada.split(",");

        for (String pessoa : pessoas) {
            pessoa = pessoa.trim();

            if (pessoa.matches(".* - [MF]$")) {
                String[] dados = pessoa.split(" - ");
                String nome = dados[0].trim();
                String sexo = dados[1].trim();

                if (sexo.equalsIgnoreCase("M")) {
                    masc.add(nome);
                } else if (sexo.equalsIgnoreCase("F")) {
                    fem.add(nome);
                }
            } else {
                System.out.println("Entrada inválida: " + pessoa);
            }
        }

        Collections.sort(masc);
        Collections.sort(fem);

        exibirPessoas(masc, fem);
    }

    private static void exibirPessoas(ArrayList<String> masc, ArrayList<String> fem) {
        System.out.println("******* Lista de pessoas do sexo masculino: *******");
        for (String pessoa : masc) {
            System.out.println(pessoa);
        }
        System.out.println(" ");

        System.out.println("******* Lista de pessoas do sexo feminino: *******");
        for (String pessoa : fem) {
            System.out.println(pessoa);
        }
        System.out.println(" ");
    }
}