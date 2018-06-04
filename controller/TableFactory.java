package controller;

import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Fornecedor;
import model.Produto;

public class TableFactory {

    public DefaultTableModel exibirDados() {
        DefaultTableModel exibirDados = new DefaultTableModel();

        exibirDados.addColumn("Nome");
        exibirDados.addColumn("Cidade");
        exibirDados.addColumn("CPF");
        exibirDados.addColumn("Contato");

        for (int i = 0; i < Cliente.dados.size(); i++) {
            exibirDados.addRow(new Object[]{Cliente.dados.get(i).nome, Cliente.dados.get(i).endereco, Cliente.dados.get(i).cpf, Cliente.dados.get(i).contato});

        }

        return exibirDados;
    }

    public void excluir(int linha) {
        Cliente.dados.remove(linha);
    }

    public void alterar(String Novonome, String Novoendereco, String Novocpf, String Novocontato, int linha) {

        Cliente p = new Cliente();
        p.nome = Novonome;
        p.endereco = Novoendereco;
        p.cpf = Novocpf;
        p.contato = Novocontato;

        // Realizar a alteração
        Cliente.dados.set(linha, p);

    }

    public DefaultTableModel exibirDadoss() {
        DefaultTableModel exibirDadoss = new DefaultTableModel();

        exibirDadoss.addColumn("Nome");
        exibirDadoss.addColumn("Valor");
        exibirDadoss.addColumn("Quantidade");

        for (int i = 0; i < Produto.dadosProd.size(); i++) {
            exibirDadoss.addRow(new Object[]{Produto.dadosProd.get(i).nome, Produto.dadosProd.get(i).valor, Produto.dadosProd.get(i).quantidade});

        }

        return exibirDadoss;
    }

    public void excluirr(int linha) {
        Produto.dadosProd.remove(linha);
    }

    public void alterarr(String Novonome, String Novovalor, String Novoquantidade , int linha) {

        Produto p = new Produto();
        p.nome = Novonome;
        p.valor = Novovalor;
        p.quantidade = Novoquantidade;
        

        // Realizar a alteração
        Produto.dadosProd.set(linha, p);

    }

    public DefaultTableModel exibirDados3() {
        DefaultTableModel exibirDados3 = new DefaultTableModel();

        exibirDados3.addColumn("Nome Objeto Fornecido");
        exibirDados3.addColumn("Nome Fornecedor");
        exibirDados3.addColumn("CNPJ");
         exibirDados3.addColumn("Contato");

        for (int i = 0; i < Fornecedor.dados.size(); i++) {
            exibirDados3.addRow(new Object[]{Fornecedor.dados.get(i).contato, Fornecedor.dados.get(i).nome, Fornecedor.dados.get(i).cnpj,Fornecedor.dados.get(i).objeto });

        }

        return exibirDados3;
    }

    public void excluir3(int linha) {
        Fornecedor.dados.remove(linha);
    }

    public void alterar3(String Novocontato, String Novonome, String Novocnpj, String Novoobjeto, int linha) {

        Fornecedor p = new Fornecedor();
        p.contato = Novocontato;
        p.nome = Novonome;
        p.cnpj = Novocnpj;
        p.objeto = Novoobjeto;
        // Realizar a alteração
        Fornecedor.dados.set(linha, p);

    }
    
   
}
