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
            System.out.println(nome,"tem", altura,"de altura e pesa", peso, "kg. Sua situação é muito abaixo do peso");
        } else if(imc > 17){
            System.out.println(nome,"tem", altura,"de altura e pesa", peso, "kg. Sua situação é muito abaixo do peso");
        }
    }
}