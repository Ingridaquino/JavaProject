import java.util.Random;

public class DesafioVetor {
    public static void main(String[] args){
        Random random = new Random();
        int array[] = new int[10000]; // 5 números serão gerados.
        int contador = 0;

        for (int i=0; i<array.length; i++) {
            array[i] = random.nextInt(10000); // Gera números aleatórios com limite 50.
            System.out.println(array[i]); // Saída, são gerados 5 números.
        }

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (array[j] == array[i]) {
                    contador++;
                }
            }
            System.out.println("O número  " + array[j] + " apareceu " + contador + " vezes!");
            contador = 0; //lembre de resetar...
        }
    }
}
