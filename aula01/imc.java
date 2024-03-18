package aula01;

import java.util.Scanner;

class imc {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        String nome;
        float peso;
        float altura;

        System.out.println("insira seu nome");
        nome = myObj.nextLine();

        System.out.println("insira seu peso");
        peso = myObj.nextFloat();

        System.out.println("insira sua altura");
        altura = myObj.nextFloat();

        float imc = peso/(altura * altura)

        if(imc < 16.9){
            System.out.println(nome + "tem" + altura + "de altura e pesa" + peso + "kg. Sua situação é muito abaixo do peso");
        } else if(imc > 17 && imc < 18.4){
            System.out.println(nome + "tem" + altura + "de altura e pesa" + peso + "kg. Sua situação é abaixo do peso");
        } else if(imc > 18.5 && imc > 24.9){
            System.out.println(nome + "tem" + altura + "de altura e pesa" + peso + "kg. Sua situação é normal");
        } else if(imc > 25 && imc < 29.9){
            System.out.println(nome + "tem" + altura + "de altura e pesa" + peso + "kg. Sua situação é acima do peso");
        } else if(imc > 30 && imc < 34.9){
            System.out.println(nome + "tem" + altura + "de altura e pesa" + peso + "kg. Sua situação é obesidade grau I");
        } else if(imc > 35 && imc < 40){
            System.out.println(nome + "tem" + altura + "de altura e pesa" + peso + "kg. Sua situação é obesidade grau II");
        } else {
            System.out.println(nome + "tem" + altura + "de altura e pesa" + peso + "kg. Sua situação é obesidae grau III");
        }
    }
}