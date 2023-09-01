/*
 * Vamos fazer um verdadeiro ou falso com o "IF" e "ELSE" 
 * Fazer com uma entrada de balada, para verificar se você pode entrar nela ou não
 */
package estruturas;

import java.util.Scanner;

/**
 *
 * @author Aluno Otávio
 */
public class entradaBalada {
    public static void main (String [] args){
        int idade;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        idade = scan.nextInt();
        
        if (idade>=18) {
            System .out.println("Pode entrar");
        } else{
            System.out.println("Não pode entrar");
        }
        
    }
}