/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaçao;

import Conceito.Produto;

/**
 *
 * @author visitante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic he
        Produto pro1, pro2;
    pro1 = new Produto();
    pro1.setNome("Pão de Queijo");
    pro1.setPreco(100);
    pro1.setMargem(30);
    
    System.out.println("nome = "+pro1.getNome());
    System.out.println("preco de venda = "+pro1.calcularValorVenda());

    pro2 = new Produto();
    pro2.setNome("Pão Frances");
    pro2.setPreco(200);
    pro2.setMargem(40);
    
    System.out.println("nome = "+pro2.getNome());
    System.out.println("preco de venda = "+pro2.calcularValorVenda());
    }
    
}
