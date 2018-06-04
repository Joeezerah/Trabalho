package controller;

import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import model.Cliente;
import static model.Cliente.dados;
import model.Produto;
import static model.Produto.dadosProd;

public class ListarCombobox {

    // Método de listar
    public DefaultComboBoxModel<Cliente> listar() {

        // Vetor
        Vector<Cliente> listaDeProdutos = new Vector<>();

        // Atribuir um título
        Cliente t = new Cliente();

        // Laço
        for (int i = 0; i < dados.size(); i++) {
            listaDeProdutos.add(dados.get(i));
        }
        
        listaDeProdutos.add(t);
        
        DefaultComboBoxModel<Cliente> modelo = new DefaultComboBoxModel<>(listaDeProdutos);

        // Retorno
        return modelo;
    }
    // Método de listar
    public DefaultComboBoxModel<Produto> listar1() {

        // Vetor
        Vector<Produto> listaDeProdutos = new Vector<>();

        // Atribuir um título
        Produto t = new Produto();

        // Laço
        for (int i = 0; i < dadosProd.size(); i++) {
            listaDeProdutos.add(dadosProd.get(i));
        }
        
        listaDeProdutos.add(t);
        
        DefaultComboBoxModel<Produto> modelo1 = new DefaultComboBoxModel<>(listaDeProdutos);

        // Retorno
        return modelo1;
    }


}


