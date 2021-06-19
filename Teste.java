import java.util.Scanner;

public class Teste{

    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        String nome = entrada.next();
        System.out.print(nome);
        entrada.close();
    }
}