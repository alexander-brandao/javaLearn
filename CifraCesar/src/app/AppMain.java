package app;

import Cifrador.Cifrador;

public class AppMain {

    public static void main(String args[]){
        System.out.println("");
        System.out.println("");
        System.out.println("####### CIFRA ######");
        System.out.println("");
        System.out.println("");

        String eGuardar = "Isso sera um segredo";

        System.out.println("Entrada : " + eGuardar);

        Cifrador eCifrador = new Cifrador();

        String eGuardado = eCifrador.guardar(eGuardar);

        System.out.println("Guardado = " + eGuardado);
    }
}
