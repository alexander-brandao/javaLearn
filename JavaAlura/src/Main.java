public class Main {


    public static void main(String[] args){
        //primeiro a classe, depois o objeto, recebe(=), depois o NEW  e a classe de novo
        Conta conta1 = new Conta();
        conta1.nome = "paulo";
        conta1.deposita(100);

        Conta conta2 = new Conta();
        conta2.nome = "paulo";
        conta2.deposita(100);

        if(conta1 == conta2){
            System.out.println("contas iguais");
        } else{
            System.out.println("contas diferentes");
        }

    }
    /* conta1.deposita(1000);

        if(conta1.saca(500)){
            System.out.println("consegui sacar");
        } else {
            System.out.println("nao consegui sacar");
        } */
}
