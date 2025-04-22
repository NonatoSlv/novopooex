/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classseb;

/**
 *
 * @author pgabr
 */

public class ClasseB {
    public void acessarNumero() {
        ClasseA obj = new ClasseA();
        // System.out.println("Número da ClasseA: " + obj.numero); // ERRO: acesso não permitido
        System.out.println("Não é possível acessar o atributo 'numero' de ClasseA fora do pacote.");
    }
}

