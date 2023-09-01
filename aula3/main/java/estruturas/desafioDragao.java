package estruturas;

import java.util.Scanner;

public class desafioDragao {
    public static void main(String[] args) {
        float  altura;
        float  peso;
        float  IMC;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva a sua altura");
        altura = scan.nextFloat();
        
        System.out.println("Escreva seu peso");
        peso = scan.nextFloat();
        
        IMC = (peso /(altura * altura));
        
        if (IMC <= 18.5){
            System .out.println("Abaixo do Peso");
        }else if((IMC >= 18.5) && (IMC <= 24.9)){
            System .out.println("Peso Normal");
        }else if((IMC >= 25) && (IMC <= 29.9)){
            System.out.println("Sobre Peso");
        }else if((IMC >= 30) && (IMC <= 34.9)){
            System.out.println("Obesidade Grau 1");
        }else if((IMC >= 35) && (IMC <= 39.9)){
            System.out.println("obesidade Grau 2");
        }else if(IMC >= 40){
            System .out.println("Obesidade Grau 3 ou Mórbida");
        }
    } 
}
