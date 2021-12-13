import java.util.Scanner;

public class Strings {
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            String fraseUsua; int i, n, x = 0;
            System.out.print("Por favor, digite sua frase: ");
            fraseUsua = entrada.nextLine();

            System.out.println("O tamanho da string txt é: " + fraseUsua.length());

            n = fraseUsua.length(); // tamanho da string

            System.out.println("------------------------------------------------- ");
            System.out.println("A - " + fraseUsua.indexOf("a"));
            System.out.println("B - " + fraseUsua.indexOf("b"));
            System.out.println("C - " + fraseUsua.indexOf("c"));
            System.out.println("D - " + fraseUsua.indexOf("d"));
            System.out.println("E - " + fraseUsua.indexOf("e"));
            System.out.println("F - " + fraseUsua.indexOf("f"));
            System.out.println("G - " + fraseUsua.indexOf("g"));
            System.out.println("H - " + fraseUsua.indexOf("h"));
            System.out.println("I - " + fraseUsua.indexOf("i"));
            System.out.println("J - " + fraseUsua.indexOf("j"));
            System.out.println("K - " + fraseUsua.indexOf("k"));
            System.out.println("L - " + fraseUsua.indexOf("l"));
            System.out.println("M - " + fraseUsua.indexOf("m"));
            System.out.println("N - " + fraseUsua.indexOf("n"));
            System.out.println("O - " + fraseUsua.indexOf("o"));
            System.out.println("P - " + fraseUsua.indexOf("p"));
            System.out.println("Q - " + fraseUsua.indexOf("q"));
            System.out.println("R - " + fraseUsua.indexOf("r"));
            System.out.println("S - " + fraseUsua.indexOf("s"));
            System.out.println("T - " + fraseUsua.indexOf("t"));
            System.out.println("U - " + fraseUsua.indexOf("u"));
            System.out.println("V - " + fraseUsua.indexOf("v"));
            System.out.println("W - " + fraseUsua.indexOf("w"));
            System.out.println("X - " + fraseUsua.indexOf("x"));
            System.out.println("Y - " + fraseUsua.indexOf("y"));
            System.out.println("Z - " + fraseUsua.indexOf("z"));
        }
    }
