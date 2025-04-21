/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.model;

/**
 *
 * @author Andre
 */
public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 1412.00) {
            this.salario = salario;
        } else {
            System.out.println("Salário inválido! O valor deve ser igual ou superior a R$ 1412,00." );
        }
    }

   
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}







    
