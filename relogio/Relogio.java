/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.sp.etec.model;

/**
 *
 * @author pgabr
 */
public class Relogio {
    private int minuto;

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto inválido! Insira um valor entre 0 e 59.");
        }
    }

    public int getMinuto() {
        return minuto;
    }
}
