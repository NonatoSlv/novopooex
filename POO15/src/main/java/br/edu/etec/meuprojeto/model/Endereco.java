/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.model;

/**
 *
 * @author Andre
 */
public class Endereco {

    private String rua;
    private String bairro;
    private String cep;

    // Getters
    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    // Setters
    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(String cep) {
        // Validação: exatamente 8 dígitos
        if (cep.matches("\\d{8}")) {
            this.cep = cep;
        } else {
            System.out.println("CEP inválido! Deve conter exatamente 8 dígitos numéricos.");
        }
    }
}

    

