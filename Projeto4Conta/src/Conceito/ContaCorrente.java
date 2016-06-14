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
public class ContaCorrente {
    
   private int banco;
   private  int agencia;
   private int conta;
   private float taxa;
   private float limite;
   private float saldo;
    private float saque;

    /**
     * @return the banco
     */
    public int getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(int banco) {
        this.banco = banco;
    }

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the conta
     */
    public int getConta() {
        return conta;
    }

    /**
     * @param conta the conta to set
     */
    public void setConta(int conta) {
        this.conta = conta;
    }

    /**
     * @return the taxa
     */
    public float getTaxa() {
        return taxa;
    }

    /**
     * @param taxa the taxa to set
     */
    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    /**
     * @return the limite
     */
    public float getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    /**
     *
     * @param valor
     * @return
     */
    public float Depositar(float valor){
        this.saldo= saldo+valor;
        return saldo;
    }
    
    public float Sacar( float saque){
        if( saldo>= saque){
            this.saque= saldo-saque-taxa;
            return saque;
        }else{
                System.out.println("Saldo é insuficiente");
            }
        return 0;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    /**
     *
     * @return
     */
    public float getDisponivel(){
        this.saldo= saldo+limite;
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setSaque(float saque) {
        this.saque = saque;
    }

    
}

