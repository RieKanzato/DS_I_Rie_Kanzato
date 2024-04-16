package aula03;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        for (int i = 0; i < 8; i++){
            System.out.println(n1);
            n1 = n1 + n2;
            n2 = n1 - n2;
        }
    }
}
