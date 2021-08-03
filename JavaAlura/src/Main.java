public class Main {


    public static void main(String[] args){
        //primeiro a classe, depois o objeto, recebe(=), depois o NEW  e a classe de novo
        Conta conta1 = new Conta();
        conta1.deposita(1000);

        if(conta1.saca(500)){
            System.out.println("consegui sacar");
        } else {
            System.out.println("nao consegui sacar");
        }
    }
}
