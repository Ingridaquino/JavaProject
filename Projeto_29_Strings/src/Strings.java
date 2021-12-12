public class Strings {
    public static void main(String[]args){
        String txt = "Ola Pessoal do IOS";
        String myStr1 = "Hello";
        String myStr2 = "Hello";

        char result = txt.charAt(0); //Caractere na posição zero
        System.out.println("Char na posição zero " + result);
        result = txt.charAt(10); //Caractere n posição dez
        System.out.println("Char na posição dez: " + result);

        //Compara Strings
        System.out.println("Compara myStr1 com myStr2: " + myStr1.compareTo(myStr2)); // returna 0
        System.out.println("Compara txt com myStr2: " + txt.compareTo(myStr2)); // retorna um valor > 0
        System.out.println("Compara myStr1 com txt: " + myStr1.compareTo(txt)); // retorna um valor < 0

        //Verifica o início e o final de um String
        System.out.println("Verifica início da string txt: " + txt.startsWith("Ola")); //retorna true
        System.out.println("Verifica início da string txt: " + txt.startsWith("O")); //retorna true
        System.out.println("Verifica início da string txt: " + txt.startsWith("o")); //retorna false

        System.out.println("Verifica final da string txt: " + txt.endsWith("IOS")); //retorna TRUE
        System.out.println("Verifica início da string txt: " + txt.endsWith("S")); //retorna TRUE
        System.out.println("Verifica início da string txt: " + txt.endsWith("s")); //retorna false

    }
}
