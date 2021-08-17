public class Conta {

    //fields
    private int numero;
    public double saldo;
    private double limite;
    private String nome;

    // Constructor
    public Conta() {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.nome = nome;
    }

    // methods
    public boolean saca(double valor){
        if(this.saldo < valor){
            return false;
        }else{
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    public void deposita(double quantidade){
        this.saldo += quantidade;
    }


}
