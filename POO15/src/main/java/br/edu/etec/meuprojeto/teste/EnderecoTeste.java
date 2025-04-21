/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.teste;

import br.edu.etec.meuprojeto.model.Endereco;

/**
 *
 * @author Andre
 */
public class EnderecoTeste {

    public static void main(String[] args) {
        Endereco e = new Endereco();

        e.setRua("Rua das Flores");
        e.setBairro("Centro");

       
        e.setCep("12345678");  

        System.out.println("Rua: " + e.getRua());
        System.out.println("Bairro: " + e.getBairro());
        System.out.println("CEP: " + e.getCep());
    }
}

   
