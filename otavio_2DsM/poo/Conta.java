/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Discente
 */
public class Conta {
    int numero;
    double saldo;
    
    void depositar (double valor){
        this.saldo += valor;
    }
    void sacar (double valor) {
        this.saldo -= valor;
    }
    
    void exibirSaldo(){
        System.out.println("Saldo: " + this.saldo);
    }
}
