package aula01;
import java.io.IOException;
import java.util.Scanner;

class imc {
    public static void main(String[] args) throws IOException{

        Scanner aaaa = new Scanner(System.in);
        try {
            String nome;
            float peso;
            float altura;

           

            System.out.println("insira seu nome:");
            nome = aaaa.nextLine();

            System.out.println("insira seu peso:");
            peso = aaaa.nextFloat();

            System.out.println("insira sua altura:");
            altura = aaaa.nextFloat();

            float result = peso/(altura * altura);

            if(result < 16.9){
                System.out.println(nome + "tem" + altura + "de altura e pesa" + peso + "kg. Sua situacao e muito abaixo do peso");
            } else if(result > 17 && result < 18.4){
                System.out.println(nome + "tem" + altura + "de altura e pesa" + peso + "kg. Sua situacao e abaixo do peso");
            } else if(result > 18.5 && result > 24.9){
                System.out.println(nome + "tem" + altura + "de altura e pesa" + peso + "kg. Sua situacao e normal");
            } else if(result > 25 && result < 29.9){
                System.out.println(nome + "tem" + altura + "de altura e pesa" + peso + "kg. Sua situacao e acima do peso");
            } else if(result > 30 && result < 34.9){
                System.out.println(nome + "tem" + altura + "de altura e pesa" + peso + "kg. Sua situacao e obesidade grau I");
            } else if(result > 35 && result < 40){
                System.out.println(nome + "tem" + altura + "de altura e pesa" + peso + "kg. Sua situacao e obesidade grau II");
            } else {
                System.out.println(nome + "tem" + altura + "de altura e pesa" + peso + "kg. Sua situacao e obesidae grau III");
            }
        }
        finally {
            aaaa.close();
        }
    }
}