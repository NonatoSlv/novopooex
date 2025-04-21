/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.teste;

import br.edu.etec.meuprojeto.model.ContaModel;

/**
 *
 * @author Andre
 */
public class ContaTeste {
    public static void main(String[] args) {
        ContaModel conta = new ContaModel("12345-6", "Andrey", 500.00);

        System.out.println("Conta: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

     
        conta.depositar(250.00);     
        conta.sacar(45.00);    

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}

   
