/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.teste;

import br.edu.etec.meuprojeto.model.Empresa;

/**
 *
 * @author Andre
 */
public class EmpresaTest {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Stark","producao");
        
        // Acessando o método público
        empresa.exibirInfo();
       
        // Tentando acessar o método privado
        // empresa.gerarRelatorio(); // Isso causará um erro de compilação
    }
}
 
