public class Conta {

    //fields
    private int numero;
    public double saldo;
    private double limite;
    public String nome;

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

    public boolean transferePara(Conta destino, double valor){
        boolean retirou = this.saca(valor);
        if(retirou == true){
            destino.deposita(valor);
            return true;
        } else {
            System.out.println("Não foi possivel fazer a tranferencia por falta de saldo.");
            return false;
        }
    }

}
