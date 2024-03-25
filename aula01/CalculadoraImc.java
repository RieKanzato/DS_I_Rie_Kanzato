package aula01;
import java.io.IOException;
import java.util.Scanner;

class CalculadoraImc {
    public static void main(String[] args) throws IOException{

        Scanner aaaa = new Scanner(System.in);
        try {
            String nome;
            double peso;
            double altura;
        

            System.out.println("insira seu nome:");
            nome = aaaa.nextLine();

            System.out.println("insira seu peso:");
            peso = aaaa.nextFloat();

            System.out.println("insira sua altura:");
            altura = aaaa.nextFloat();

            double result = peso/(altura * altura);

            if(result > 18.5){
                System.out.println(nome + " tem" + altura + " de altura e pesa" + peso + " kg. Sua situacao e magreza");
            } else if(result < 25){
                System.out.println(nome + " tem" + altura + " de altura e pesa" + peso + " kg. Sua situacao e normal");
            } else if(result < 30){
                System.out.println(nome + " tem" + altura + " de altura e pesa" + peso + " kg. Sua situacao e sobrepeso");
            } else{
                System.out.println(nome + " tem" + altura + " de altura e pesa" + peso + " kg. Sua situacao e obeso grau");
            }
        }
        finally {
            aaaa.close();
        }
    }
}