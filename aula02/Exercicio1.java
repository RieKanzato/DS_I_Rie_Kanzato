package aula02;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String p1;
        String p2;

        System.out.println("insira primeira palavra: ");
        p1 = myObj.nextLine();

        System.out.println("insira segunda palavra: ");
        p2 = myObj.nextLine();

        comparePalavras(p1, p2);

        System.out.println(msg);

        myObj.close();
    }

    static void comparePalavras(String p1, String p2) {
        System.out.println(p1.equals(p2));

        if (p1.equals(p2)) {
            System.out.println("A palavra " + p1 + "e a palavra " + p2 + "são iguais");
        } else {
            System.out.println("A palavra " + p1 + "e a palavra " + p2 + "não são iguais");
        }
    }
}