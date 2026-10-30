
public class Fibonacci {

    public static void main(String [] args) {
        int anterior = 0;
        int atual = 1;
        for(int i = 0 ; i<10 ; i ++){
            System.out.println(anterior);
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }

}
