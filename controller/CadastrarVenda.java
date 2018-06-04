/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cliente;
import model.Produto;
import model.VendaProduto;

/**
 *
 * @author Meu computador
 */
public class CadastrarVenda {

    public boolean cadastrar(Cliente nome, Produto prod, Double preco) {

        try {
            VendaProduto p = new VendaProduto();
            p.c = nome;
            p.p = prod;
            p.total = preco;
            
            VendaProduto.dadosVenda.add(p);
            System.out.println(VendaProduto.dadosVenda.size());
            
        } catch (Exception e) {
            System.out.println("e " + e);
        }
        return true;

    }
}
