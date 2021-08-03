public class Conta {

    //fields
    private int numero;
    private double saldo;
    private double limite;
    private String nome;

    // Constructor
    public Conta(int numero, double saldo, double limite, String nome) {
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

    void deposita(double quantidade){
        this.saldo += quantidade;
    }
    // okayv

}
