package controller;

import model.Cliente;

public class CadastrarCliente {

    public boolean cadastrar(String nome, String endereco, String contato, String cpf) {

        try {
            Cliente p = new Cliente();
            p.contato = contato;
            p.nome = nome;
            p.cpf = cpf;
            p.endereco = endereco;

            Cliente.dados.add(p);
            System.out.println(Cliente.dados.size());
        } catch (Exception e) {
            System.out.println("e " + e);
        }
        return true;

    }

//    public DefaultTableModel exibirDados() {
//        DefaultTableModel exibirDados = new DefaultTableModel();
//
//        exibirDados.addColumn("Nome");
//        exibirDados.addColumn("Cidade");
//        exibirDados.addColumn("CPF");
//        exibirDados.addColumn("Contato");
//
//        for (int i = 0; i < Produto.dados.size(); i++) {
//            exibirDados.addRow(new Object[]{Cliente.dados.get(i).nome, Cliente.dados.get(i).endereco, Cliente.dados.get(i).cpf , Cliente.dados.get(i).contato});
//
//        }
//
//        return exibirDados;
//    }
//
//    // Método para excluir
//    public void excluir(int linha) {
//        Produto.dados.remove(linha);
//    }
//
//    // Método para alterar
//    public void alterar(String Novonome, String Novoendereco, String Novocontato, String Novocpf) {
//
//        // Criar objeto
//        p.setNomeProduto(Novonome);
//        p.setValorProduto(Novoendereco);
//        p.setQuantidadeProduto(Novocontato);
//        p.setQuantidadeProduto(Novocpf);
//
//        // Realizar a alteração
//        Produto.dados.set(linha, p);
//
//    }
}
