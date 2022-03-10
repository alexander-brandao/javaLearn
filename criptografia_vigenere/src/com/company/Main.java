package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
    private static String encriptar(String texto, String chave) {
        String retorno = "";

        for(int i = 0; i < texto.length(); i++) {
            int letraDoTexto = texto.charAt(i);
            int letraDachave = chave.charAt(i % chave.length());
            int letraDoXor = (letraDoTexto ^ letraDachave);
            String caractere = Integer.toHexString(letraDoXor);

            retorno += (caractere.length() ==2 ? "" : "0") + caractere;
        }
        return retorno;
    }

    private static String descriptar(String texto, String chave) {
        String retorno = "";
        for(int i = 0; i < texto.length() -1; i+=2) {
            String letraDoTexto = texto.substring(i, i+2);
            int letraDachave = chave.charAt(i/2 % chave.length());
            int letraDoXor = (Integer.parseInt(letraDoTexto, 16) ^ letraDachave);


            retorno += (char) + letraDoXor;
        }
        return retorno;
    }
}
