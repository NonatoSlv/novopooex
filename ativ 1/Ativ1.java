/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.sp.etec.model;

/**
 *
 * @author Admin
 */
public class Ativ1 {
    
    private String nome;
    private int idade;
    private String cpf;
    
    public Ativ1(String nome, int idade, String cpf){
    
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
        public int setIdade(){
    idade = 18;
        return 0;
        
    }
         public String setCpf(){
    nome = "439-151-848-54";
        return null;
    }
    }


