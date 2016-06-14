/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaçao;

import Conceito.ContaCorrente;
import javax.swing.JOptionPane;

/**
 *
 * @author visitante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
       ContaCorrente ret= new ContaCorrente();
        
       int op=1;
       
       while(op!=0)
       {
           op=Integer.parseInt(JOptionPane.showInputDialog(null,"1-Inormar Banco\n2-Informar Agência\n3-Informar Conta\n4-Informar Limite\n5-Informar Saldo\n6-Disponivel\n7-Informações\n0-Sair"));
           if(op==1)
               ret.setBanco(Integer.parseInt(JOptionPane.showInputDialog("Digite o seu banco")));
           else if(op==2)
               ret.setAgencia(Integer.parseInt(JOptionPane.showInputDialog("Digite sua agencia")));
           else if(op==3)
               ret.setConta(Integer.parseInt(JOptionPane.showInputDialog("Digite sua conta")));
           else if(op==4)
               ret.setLimite(Float.parseFloat(JOptionPane.showInputDialog("Digite o seu limite")));
           else if(op==5)
               ret.setSaldo(Float.parseFloat(JOptionPane.showInputDialog("Digite o seu saldo")));
           else if(op==6)
               JOptionPane.showMessageDialog(null,"O valor disponível é="+ret.getDisponivel());     
           else if(op==7)
               JOptionPane.showMessageDialog(null, "Banco: "+ret.getBanco()+"\nAgência: "+ret.getAgencia()+"\nConta: "+ret.getConta()+"\nLimite: "+ret.getLimite()+"\nSaldo disponível"+ret.getDisponivel());
           else
               continue;
       }
       
       
       
       
       
       
       
       
       
       
       
    }
    
}
