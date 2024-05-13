/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author CAMARGO
 */
public class Aluno {
    
    public static void main (String[ ] args) {
        AlunoObj aluno1;
        
        aluno1 = new AlunoObj();
        
        aluno1.setNome("rie");
        System.out.println(aluno1.getNome());
        
        aluno1.setIdade("16");
        System.out.println(aluno1.getIdade());
    }
}
