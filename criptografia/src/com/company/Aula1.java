package com.company;

public class Aula1 {

    /* AULA 1 CRIPTOGRAFIA VIGENERE */
    // ALGORITMO QUE ENCRIPTA E DECRIPTA A MENSAGEM

        //metodo que encripta mensagem
    static String encriptar(String texto, String chave) {
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
        //metodo que decripta
    static String descriptar(String texto, String chave) {
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
