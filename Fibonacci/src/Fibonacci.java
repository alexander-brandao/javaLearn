public class Fibonacci {

    //metodo estatico para realizar os calculos
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    // metodo principal que executa a recursividade

    public static void main(String[] args) {

        // Imprime os 10 primeiros termos
        for (int i = 0; i < 10; i++) {
            System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
        }

    }
}
