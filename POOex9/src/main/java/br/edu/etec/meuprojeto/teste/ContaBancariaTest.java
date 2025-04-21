/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.teste;

import br.edu.etec.meuprojeto.model.ContaBancaria;

/**
 *
 * @author Andre
 */
public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("andrey", 1000.00);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        conta.sacar(300);  

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}

    
