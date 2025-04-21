/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.model;

/**
 *
 * @author Andre
 */
public class Empresa {
    private String nome;
    private String setor;

    public Empresa(String nome, String setor) {
        this.nome = nome;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void exibirInfo() {
        System.out.println("Informações da Empresa: Nome da Empresa " + nome + ", Setor: " + setor + ".");
    }

    private void gerarRelatorio() {
        System.out.println("Relatório gerado com sucesso.");
    }
}

