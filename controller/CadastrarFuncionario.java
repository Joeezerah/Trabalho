package controller;

import model.CadastroF;

public class CadastrarFuncionario {

    public boolean cadastrar(String nome, String usu, String contato, String cpf, String senha, String permissao) {

        try {
            CadastroF p = new CadastroF();
            p.contato = contato;
            p.nome = nome;
            p.cpf = cpf;
            p.usu = usu;
            p.senha = senha;
            p.permmissao = permissao;

            CadastroF.dados.add(p);

        } catch (Exception e) {
            System.out.println("e " + e);
        }
        return true;

    }

}
