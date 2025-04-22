/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.sp.etec.model;

/**
 *
 * @author Admin
 */
public class Ativ2 {
   private String nome;
    private int idade;
    private String cpf;
    
    public Ativ2(String nome, int idade, String cpf){
    
        this.cpf = cpf;
        this.nome = nome;
        this.idade =idade;
    }
    
    public String getNome(){
    return nome;
    }
     public String getCpf(){
    return cpf;
    }
      public int getIdade(){
    return idade;
    }
       public String setNome(){
    nome = "gabryel";
        return null;
    }
        public String setCpf(){
    nome = "439-151-848-54";
        return null;
    }
        public int setIdade(){
    if (idade < 0){
        System.out.println("Idade negativa!");
    }
        else {
    System.out.println("Idade válida: " + idade);
}
    
        
    
