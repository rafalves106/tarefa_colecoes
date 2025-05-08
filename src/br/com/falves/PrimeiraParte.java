/**
 * @author falvesmac
 */

package br.com.falves;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrimeiraParte {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    ArrayList<String> pessoas = new ArrayList<>();
    String opcao;

    System.out.println("Deseja cadastrar novas pessoas? ");
    opcao = s.nextLine();

    if(opcao.equalsIgnoreCase("Sim") || opcao.equalsIgnoreCase("S")){
      while(opcao.equalsIgnoreCase("Sim") || opcao.equalsIgnoreCase("S")){
        System.out.println("Digite o nome das pessoass (separados com vírgula) ");
        String entrada = s.nextLine();
        String[] nomes = entrada.split(",");

        for (String nome : nomes) {
          pessoas.add(nome.trim());
        }

        System.out.println("Deseja adicionar mais pessoas? ");
        opcao = s.nextLine();
      }
      Collections.sort(pessoas);
      exibirPessoas(pessoas);
    }
  }

  private static void exibirPessoas(ArrayList<String> pessoas) {
    System.out.println("Lista de pessoas em ordem alfabética: ");
    String letraAtual = "";

    for(String pessoa : pessoas){
      String primeiraLetra = pessoa.substring(0, 1).toUpperCase();

      if(!primeiraLetra.equals(letraAtual)){
        letraAtual = primeiraLetra;
        System.out.println("Pessoas com a letra " + letraAtual + ":");
      }
      System.out.println(pessoa);
    }
  }

}