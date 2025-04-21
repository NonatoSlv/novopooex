/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.teste;

import br.edu.etec.meuprojeto.model.Funcionario;

/**
 *
 * @author Andre
 */
    public class TesteFuncionario {
  
    public static void main(String[] args) {
        Funcionario f = new Funcionario();

        f.setNome("Andrey");
        f.setCargo("Desenvolvedor");
        f.setSalario(13300); 

       
        System.out.println("Nome: " + f.getNome());
        System.out.println("Cargo: " + f.getCargo());
        System.out.println("Salário: R$ " + f.getSalario());
    }
}



