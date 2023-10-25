/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author hsousa
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    
    public Pessoa (){
    
    }
    
    public Pessoa (String nome, int idade, String cpf){
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
            
    }
    public String MostrarDados(){
    return "\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nCPF: " + getCpf();
    
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
