/*
 *Agora vamos fazer com notas
 * Vamos ver se a nota que digitou for maior que "0" e menor que "10" vai ser válida
 */
package estruturas;

import java.util.Scanner;

/**
 *
 * @author Aluno Otávio
 */
public class notaValida {

    public static void main(String[] args) {
        float nota;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite sua nota [0.0 - 10.0]:");
        nota = entrada.nextFloat();
        
        if((nota <= 10.0) && (nota >= 0.0)){
            System.out.println("Nota Válida");
        }else{
            System.out.println("Nota Inválida, fechando app");
        }
     }
}
