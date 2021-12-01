import java.util.Scanner ;
public class Exer01Coma {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número inteiro: ");
        numero = entrada.nextInt();

        if( numero > 20){
            System.out.println("A metade do número é: " + numero / 2);
        }
        else{
            System.out.println("O número digitado é: " + numero);
        }

        entrada.close();
    }
}
