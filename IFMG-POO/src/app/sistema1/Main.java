/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.sistema1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Diego
 */
public class Main {
    
    //Declarei a lista de clientes fora do escopo da main
    static List<Cliente> clientes = new ArrayList<>();
    static List<Produto> produtos = new ArrayList<>();
    static List<Venda> vendas = new ArrayList<>();
    
    public static String input(String titulo){
        return JOptionPane.showInputDialog(titulo);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        clientes.add(new Cliente("diego", "123", 20));
        clientes.add(new Cliente("joao", "1234", 20));
        
        produtos.add(new Produto("lapis", 30));
        produtos.add(new Produto("caneta", 20));
        produtos.add(new Produto("borracha", 50));
        
        //Collections.sort(produtos);
        Collections.sort(produtos, new Comparator<Produto>() {
            @Override
            public int compare(Produto o1, Produto o2) {
                return Double.compare(o1.getPreco(), o2.getPreco());
            }
        });
        
        //Exemplo de conversao
        int x = 10;
        String val = String.valueOf(x);
        int y = Integer.valueOf(val);
        
        String op = "";
        while(!op.equals("0")){
            System.out.println("Sistema de vendas");
            System.out.println();
            System.out.println("Opções");
            System.out.println("0 - Sair do sistema");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Cadastrar produto");
            //Caso existir o cliente com o cpf informado, retorne o nome do cliente, caso contrario, retorne "Cliente não cadastrado"
            System.out.println("3 - Consultar cliente por cpf");
            //Listar as descricoes de todos os produtos em que o valor informado seja maior do que x
            System.out.println("4 - Listar produtos >= x");
            //TODO: Cadastrar venda para os clientes
            System.out.println("5 - Cadastrar venda");
            
            op = input("Digite uma opção ?");
            switch(op){
                case "1":
                    CadastrarCliente();
                break;
                case "2":
                    CadastrarProduto();
                break;
                case "3":
                    Cliente cli = ConsultarCpf();
                break;
                case "4":
                    ListarProdutos();
                break;
                case "5":
                    CadastrarVenda();
                break;
            }
            
            
        }
        
    }

    private static void CadastrarCliente() {
        
        String nome = input("Digite o nome do cidadao");
        String cpf = input("Digite o cpf do cidadao");
        int idade = Integer.valueOf(input("Digite a idade do cidadao"));
        
        clientes.add(new Cliente(nome, cpf, idade));
        System.out.println("Clientes cadastrados: " + clientes.size());
        
    }

    private static Cliente ConsultarCpf() {
        
        String cpf = input("Digite o cpf do cidadao");
        
        for (Cliente cliente : clientes) {
            if(cliente.getCpf().equals(cpf)){
                return cliente;
            }
        }
        
        return null;
        
    }

    private static void CadastrarProduto() {
        String descricao = input("Digite a descricao do produto");
        double preco = Double.valueOf(input("Digite o preco do produto"));
        
        produtos.add(new Produto(descricao, preco));
    }

    private static List<Produto> ListarProdutos() {
        
        double preco = Double.valueOf(input("Digite o preco do produto a ser listado"));
        
        List<Produto> aux = new ArrayList<>();
        for (Produto produto : produtos) {
            if(produto.getPreco() >= preco){
                aux.add(produto);
            }
        }
        
        return aux;
        
        
    }

    private static void CadastrarVenda() {
        
        Cliente cli = ConsultarCpf();
        
        //Cliente existe
        if(cli != null){
            
            //Cadastro dos produtos para esta venda
            List<Produto> prod = new ArrayList<>();
            int op;
            do {
                
                System.out.println("Digite o cod do produto");
                System.out.println("Digite 0 para sair das vendas dos produtos");
                for (int i = 0; i < produtos.size(); i++) {
                    System.out.println((i+1) + produtos.get(i).getDesc());
                }
                
                op = Integer.valueOf(input("Digite o código do produto"));
                
                if(op != 0){
                    prod.add(produtos.get(op - 1));
                }
                
            } while (op != 0);
            
            double valorTotal = 0;
            for (Produto produto : prod) {
                valorTotal += produto.getPreco();
            }
            
            vendas.add(new Venda(cli, prod, valorTotal));
            
            
        } else{
            System.out.println("Erro, cpf n cadastrado");
        }
        
        
    }
    
}
