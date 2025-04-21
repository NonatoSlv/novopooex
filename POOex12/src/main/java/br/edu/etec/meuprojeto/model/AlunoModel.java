/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.model;

/**
 *
 * @author Andre
 */
public class AlunoModel {
    private double nota1;
    private double nota2;

    public void setNota1(double n) {
        if (n >= 0 && n <= 10) {
            this.nota1 = n;
        } else {
            System.out.println("Erro: A nota deve estar entre 0 e 10.");
        }
    }

    public void setNota2(double n) {
        if (n >= 0 && n <= 10) {
            this.nota2 = n;
        } else {
            System.out.println("Erro: A nota deve estar entre 0 e 10.");
        }
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }
}
    

