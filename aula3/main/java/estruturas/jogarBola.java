/*
 * Aqui utilizamos o "boolean" para ver se voê pode jogar ou não 
 * para jogar você tem que ser bom no futebol ou você tem que ser o dono da bola
 */
package estruturas;

/**
 *
 * @author Aluno Bola
 */
public class jogarBola {
    public static void main(String[] args) {
        
        boolean sabeJogar;
        boolean donoDaBola;
        
        sabeJogar = false;
        donoDaBola = false;
        //alterando essas variavel você muda o resultado final
       
        if ((sabeJogar  == true) && (donoDaBola == true)) {
            System.out.println("Pode jogar");
        } else if ((sabeJogar == false) && (donoDaBola == true)) {
            System.out.println("Pode jogar");
        } else {
            System.out.println("Esqquece... você não pode jogar");
        }
    }
}
