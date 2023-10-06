/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Aluno Otávio
 */
public class TesteConta {
    public static void main(String [] args) {
        Conta conta = new Conta();
        
        conta.depositar(1000);
        conta.exibirSaldo();
        
        conta.sacar(100);
        conta.exibirSaldo();
    }
}
