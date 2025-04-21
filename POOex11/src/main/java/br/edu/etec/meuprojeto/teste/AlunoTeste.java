/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.teste;

import br.edu.etec.meuprojeto.model.Aluno;

/**
 *
 * @author Andre
 */
public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("andrey", 5.5, 5.0);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        System.out.println("Média: " + aluno.calcularMedia());

        if (aluno.estaAprovado()) {
            System.out.println("Situação: Aprovado ");
        } else {
            System.out.println("Situação: Reprovado ");
        }
    }
}

    
