package aula04;
import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {

        String classificacao;
                
        String nome = JOptionPane.showInputDialog("insira seu nome");

        String peso = JOptionPane.showInputDialog("insira seu peso");
        float v1 = Float.parseFloat(peso);

        String altura = JOptionPane.showInputDialog("insira sua altura");
        float v2 = Float.parseFloat(altura);

        float result = v1/(v2 * v2);

        if(result > 18.5){
            classificacao = " kg. Sua situacao e magreza";
        } else if(result < 25){
            classificacao = " kg. Sua situacao e normal";
        } else if(result < 30){
            classificacao = " kg. Sua situacao e sobrepeso";
        } else{
            classificacao = " kg. Sua situacao e obeso grau";
        }

        String output = nome + "seu IMC é" + result + classificacao;
    
        JOptionPane.showMessageDialog(null, output);
    }    
}
