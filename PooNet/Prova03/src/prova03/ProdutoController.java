package prova03;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoController {

    public static double calcularMultiplicacao(double n1, double n2) throws MultiplicacaoPorZeroException {
        
        if (n1 == 0 || n2 == 0) {
            throw new MultiplicacaoPorZeroException("!!! MULTIPLICAÇÃO INVÁLIDA !!!");
        }
        return n1 * n2;
    }

    public static void salvarProdutos(List<Produto> produtos) throws IOException {
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("produtos.csv"))) {
            
            for (Produto produto : produtos) {
                writer.write(produto.toString());
                writer.newLine();
            }
        }
    }

    public static List<Produto> carregarDados(String caminho) throws IOException, FileNotFoundException, NumberFormatException {
        
        List<Produto> produtos = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(caminho))) {
            String linha;
            
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(",");
                
                if (partes.length != 4) {
                    throw new NumberFormatException("!!! FORMATO INVÁLIDO NO ARQUIVO CSV !!!");
                }
                
                String nome = partes[0];
                double preco = Double.parseDouble(partes[1]);
                int quantidade = Integer.parseInt(partes[2]);
                double valorTotal = Double.parseDouble(partes[3]);

                if (preco * quantidade != valorTotal) {
                    throw new NumberFormatException("!!! VALOR TOTAL INCONSISTENTE NO ARQUIVO CSV !!!");
                }

                produtos.add(new Produto(nome, preco, quantidade));
            }
        }
        return produtos;
    }

    public static void main(String[] args) {
        try {
            double resultado = calcularMultiplicacao(5, 0);
            System.out.println("Resultado: " + resultado);
            
        } catch (MultiplicacaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Produto1", 10.0, 2));
        produtos.add(new Produto("Produto2", 20.5, 3));

        try {
            salvarProdutos(produtos);
            System.out.println("Produtos salvos com sucesso.");
            
        } catch (IOException e) {
            System.out.println("Erro ao salvar produtos: " + e.getMessage());
        }

        try {
            List<Produto> produtosCarregados = carregarDados("produtos.csv");
            System.out.println("Produtos carregados:");
            
            for (Produto produto : produtosCarregados) {
                System.out.println(produto.getNome() + " - " + produto.getValorTotal());
            }
            
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Dados inválidos no arquivo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
