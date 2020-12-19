/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

import pilha.*;

/**
 *
 * @author Helder
 */
public class Pilha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilhaContato pilha =new PilhaContato();
        pilha.inserir(new Contato("Jackson", "(87) 99999999", null));
        pilha.inserir(new Contato("Elizpilhaeu", "(87) 99999999", null));
        pilha.inserir(new Contato("Charles", "(87) 99999999", null));
        pilha.inserir(new Contato("Iallyson", "(87) 99999999", null));
        pilha.inserir(new Contato("Andreia", "(87) 99999999", null));
        pilha.inserir(new Contato("João", "(87) 99999999", null));
        pilha.inserir(new Contato("Thiago", "(87) 99999999", null));
        System.out.println("");
        pilha.imprimir();

        pilha.remover();
        pilha.remover();
        
        System.out.println("Imprimindo depois de remover 2x");
         pilha.imprimir();
    }
    
}
