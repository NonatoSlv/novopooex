/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.teste;

import br.edu.etec.meuprojeto.model.SubSistema;

/**
 *
 * @author Andre
 */
public class ConfigTeste {

    public static void main(String[] args) {
        SubSistema sistema = new SubSistema("v1.2.3");
        sistema.mostrarVersao();
    }
}


