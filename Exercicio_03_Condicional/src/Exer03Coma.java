import java.util.Scanner;

public class Exer03Coma {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        double numero1;
        double numero2;

        System.out.println("Digite um número: ");
        numero1 = entrada.nextDouble();
        System.out.println("Digite um segundo número: ");
        numero2 = entrada.nextDouble();

        if( numero1 > numero2){
            System.out.println("Em ordem decrescente : " + numero1);
            System.out.println(numero2);

        }
        else{
            System.out.println("Em ordem decrescente : " + numero2);
            System.out.println(numero1);
        }

        entrada.close();
    }
}
