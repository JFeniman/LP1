/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conceito;

/**
 *
 * @author visitante
 */
public class Produto {
    private String nome;
    private float preco;
    private float margem;

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
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return the margem
     */
    public float getMargem() {
        return margem;
    }

    /**
     * @param margem the margem to set
     */
    public void setMargem(float margem) {
        this.margem = margem;        
        if(margem >=0 && margem <=100);
    }
     public float calcularValorVenda(){
         this.preco=preco+(preco*margem/100);
         return preco;         
         
     }
    
}
