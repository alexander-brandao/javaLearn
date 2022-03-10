package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static com.company.Aula1.descriptar;
import static com.company.Aula1.encriptar;

public class Main {

    public static void main(String[] args) throws Exception {
        //declaracao de variaveis
        BufferedReader leitor = new BufferedReader(
                new InputStreamReader(
                        System.in));
        String entrada = "";
        String saida = "";
        String chave = "";
        String opcao = "";

        //Entrada de dados
        System.out.print("Digite o texto");
        entrada = leitor.readLine();


        System.out.print("Digite a chave");
        chave = leitor.readLine();


        System.out.print("Digite <E> para encriptar texto ou <D> para decriptar");
        opcao = leitor.readLine();

        //processamento
        if(opcao.equalsIgnoreCase("E")) {
            saida = encriptar(entrada, chave);
        } else {
            saida = descriptar(entrada,chave);
        }

        // saida de dados

        System.out.print(saida);
    }
}
