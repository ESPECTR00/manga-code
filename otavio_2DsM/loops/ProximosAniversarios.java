/*
 * na Aula usaremos o "while"
 * Vai ficar repetindo até chegar no resultado desejado
 */
package loops;

/**
 *
 * @author Aluno Otávio
 */
public class ProximosAniversarios {
    public static void main(String [] args) {
        int suaIdade = 15;
        while(suaIdade < 18) {
            System.out.println(suaIdade);
            suaIdade = suaIdade + 1;
        }
    }
}
