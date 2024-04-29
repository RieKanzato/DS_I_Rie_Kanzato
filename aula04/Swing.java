package aula04;
import javax.swing.*;
public class Swing {

    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("qual seu nome?");
        String output = name + " nome bosta";
        JOptionPane.showMessageDialog(null, output);
    }
}