/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.meuprojeto.model;

/**
 *
 * @author Andre
 */
   public class SubSistema extends ConfigSistema {

    public SubSistema(String versaoSistema) {
        super(versaoSistema);
    }

    public void mostrarVersao() {
        System.out.println("Versão do sistema: " + getVersaoSistema());
    }
}


 
