/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/*
 *
 * @author Aluno Otávio
 */
public class TestaAluno {
    public static void main(String [] args) {
     // nome_da_classe nome_instaciação = new nome_da_classe()
     //nome_da_classr --> Aluno(maiúsculo)
     // nome_da_instaciação --> aluno(minúsculo)
     // new --> cria cópia da classe na memória
     // nome_da_classe --> Aluno + ()
     Aluno aluno = new Aluno();
     //Carregando dadas na cópia da classe --> aluno
     aluno.nome = "prof.Cris";
     aluno.matricula = 1234567;
     aluno.telefone = "(11) 99999-9999";
     aluno.endereco = "Rua 1, Real Parque";
     
     System.out.println("Nome: " + aluno.nome);
     System.out.println("Matricula: " + aluno.matricula);
     System.out.println("Telefone: " + aluno.telefone);
     System.out.println("Endereço: " + aluno.endereco);
    }
    
}
