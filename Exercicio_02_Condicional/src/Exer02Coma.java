import java.util.Scanner;

public class Exer02Coma {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite sua idade: ");
        numero = entrada.nextInt();

        if( numero > 18){
            System.out.println("Maior de idade");
        }
        else{
            System.out.println("Menor de idade");
        }

        entrada.close();
    }
}


