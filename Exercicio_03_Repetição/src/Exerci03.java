import java.util.Scanner;

public class Exerci03 {
    public static void main(String[] args){
        System.out.println(" === Sequência de números ===");

        Scanner entrada = new Scanner(System.in);
        int num;
        int i;
        System.out.println("Digite um numero: ");
         num = entrada.nextInt();

         System.out.print("Sequência: ");
         
        for(i = 1; i <= num; i ++){
            System.out.print( i + " ");
        }

    }
}
