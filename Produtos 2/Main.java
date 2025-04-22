/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.sp.etec.teste;

import br.edu.sp.etec.model.Produto;

/**
 *
 * @author pgabr
 */
public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Camiseta", 49.90);
        System.out.println(p1.getNome() + " - R$ " + p1.getPreco());

        p1.setPreco(-10.0); // Isso será rejeitado
        System.out.println("Tentativa de preço inválido: R$ " + p1.getPreco());
    }
}
