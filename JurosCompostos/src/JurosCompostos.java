public class JurosCompostos {

    // metodo que retorna juros simples
    public  static double JurosSimples(double capital, double taxaDeJuros, double tempo){
        double jurosSimples = capital * taxaDeJuros * tempo;
        return jurosSimples;
    }



    public static void main(String[] args){
        System.out.println(JurosSimples(1000,0.1,3));


    }

    // System.out.println(JurosSimples(100,0.02,3));
}
