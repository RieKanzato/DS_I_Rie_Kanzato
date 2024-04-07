package aula02;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String frase;
        String palavra;

        System.out.println("insira uma frase: ");
        frase = myObj.nextLine();

        System.out.println("insira uma palavra: ");
        palavra = myObj.nextLine();

    }

    static String leitorFrase(String frase, String palavra) {
        if (frase.contains(palavra)) {
            return "A frase" + frase + "contem a palavra" + palavra;
        } else {
            return "A frase" + frase + "não possui a palavra" + palavra;
        }   
    }
}