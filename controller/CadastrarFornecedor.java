
package controller;


import model.Fornecedor;

public class CadastrarFornecedor {
    
     public boolean cadastrar(String nome, String objeto, String contato, String cnpj ) {

        try {
            Fornecedor p = new Fornecedor();
            p.contato = contato;
            p.nome = nome;
            p.objeto = objeto;
            p.cnpj = cnpj;
          

            Fornecedor.dados.add(p);
            System.out.println(Fornecedor.dados.size());
        } catch (Exception e) {
            System.out.println("e " + e);
        }
        return true;

    }
    
    
}
