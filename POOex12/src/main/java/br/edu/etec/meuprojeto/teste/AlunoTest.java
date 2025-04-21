/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.teste;

import br.edu.etec.meuprojeto.model.AlunoModel;

/**
 *
 * @author Andre
 */
public class AlunoTest {
    public static void main(String[] args) {
        AlunoModel aluno = new AlunoModel();
        
        aluno.setNota1(8); // Válido
        aluno.setNota2(11);  // Inválido, mensagem de erro será exibida
        
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
    }
}

    

