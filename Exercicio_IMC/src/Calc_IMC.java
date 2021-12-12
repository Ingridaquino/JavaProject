import java.util.Scanner;
//7.	O IMC (índice de Massa Corporal) é uma medida do grau de obesidade de uma pessoa.
//•	Faça um algoritmo que leia a altura e o peso de 10 pessoas.
//•	Calcular o IMC de cada pessoa e vericar quantas pessoas estão com o IMC entre 18,5 e 24,9
// que é considerado sem obesidade.
// IMC = peso / altura^2
public class Calc_IMC {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int idade, cont = 1;
        double altura, somaAltura = 0, alturaX = 0, peso, imc;
        int idadeX = 0, pesoX = 0;

        do{
            System.out.println("Digite uma altura");
            altura = entrada.nextDouble();

            System.out.println("Digite um peso");
            peso = entrada.nextDouble();

            // pessoas com peso menor que 40
            if(peso < 40){
                pesoX++;    // conta a qntde de pessoas
            }

            cont++;
            System.out.println("\n");
        }while(cont <= 3);

        if(alturaX > 0){
            // se existirem pessoas entre 10 e 20 anos
            System.out.println("A média de pessoas entre 10 e 20 anos é: " + (somaAltura / alturaX) + "\n");
        } else{
            // se não existirem pessoas entre 10 e 20 anos
            System.out.println("Nenhuma pessoa tem idade entre 10 e 20 anos \n");
        }

        imc = pesoX / (altura * altura);
        if(imc >= 18.5 && imc <= 24.9){
            // se existirem pessoas com peso inferior a 40 kilos
            System.out.println("A percentagem de pessoas com peso inferior a 40 é: " + (pesoX * 100 / (cont - 1)) + " %");
        } else{
            // se não existirem pessoas com peso inferior a 40 kilos
            System.out.println("Nenhuma pessoa tem peso inferior a 40 kilos");
        }
    }
}