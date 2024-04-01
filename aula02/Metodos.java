package aula02;
public class Metodos {
    static void meuMetodo() {
        System.out.println("assim funciona um metodo");
    }
    // static define que esse método pertence a classe e não é Objeto. Void significa que o método não vai ter um retorno!
     
    static void meuMetodoComParametros(String nome, int idade) {
        System.out.println(nome + " tem " + idade);
    }

    public static void main(String[] args) {
        meuMetodo();
        meuMetodoComParametros("rie", 16);
    }
}