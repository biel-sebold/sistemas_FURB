package view;

import model.*;
import model.enums.CategDespesa;
import model.enums.CategReceita;

import javax.swing.*;

import controller.FinancasController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Classe principal da GUI
public class MainFrame extends JFrame {
    private FinancasController controller = new FinancasController();

    public MainFrame() {
        setTitle("Controle de Receitas e Despesas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());

        // Painel superior (menu de navegação)
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton btnIncluirReceita = new JButton("Incluir Receita");
        JButton btnIncluirDespesa = new JButton("Incluir Despesa");
        JButton btnConsultarSaldo = new JButton("Consultar Saldo");
        JButton btnListarLancamentos = new JButton("Listar Lançamentos");

        topPanel.add(btnIncluirReceita);
        topPanel.add(btnIncluirDespesa);
        topPanel.add(btnConsultarSaldo);
        topPanel.add(btnListarLancamentos);

        add(topPanel, BorderLayout.NORTH);

        // Painel principal (troca de conteúdo)
        JPanel mainPanel = new JPanel(new CardLayout());
        JPanel incluirReceitaPanel = criarPainelIncluirReceita();
        JPanel incluirDespesaPanel = criarPainelIncluirDespesa();
        JPanel consultarSaldoPanel = criarPainelConsultarSaldo();
        JPanel listarLancamentosPanel = criarPainelListarLancamentos();

        mainPanel.add(incluirReceitaPanel, "Incluir Receita");
        mainPanel.add(incluirDespesaPanel, "Incluir Despesa");
        mainPanel.add(consultarSaldoPanel, "Consultar Saldo");
        mainPanel.add(listarLancamentosPanel, "Listar Lançamentos");

        add(mainPanel, BorderLayout.CENTER);

        // Botões de navegação
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        btnIncluirReceita.addActionListener(e -> cl.show(mainPanel, "Incluir Receita"));
        btnIncluirDespesa.addActionListener(e -> cl.show(mainPanel, "Incluir Despesa"));
        btnConsultarSaldo.addActionListener(e -> cl.show(mainPanel, "Consultar Saldo"));
        btnListarLancamentos.addActionListener(e -> cl.show(mainPanel, "Listar Lançamentos"));
    }

    // Painel para incluir receitas
    private JPanel criarPainelIncluirReceita() {
        JPanel panel = new JPanel(new GridLayout(5, 2));
        JLabel lblDescricao = new JLabel("Descrição:");
        JLabel lblValor = new JLabel("Valor:");
        JLabel lblData = new JLabel("Data (AAAA-MM-DD):");
        JLabel lblCategoria = new JLabel("Categoria:");

        JTextField txtDescricao = new JTextField();
        JTextField txtValor = new JTextField();
        JTextField txtData = new JTextField();
        JComboBox<CategReceita> cmbCategoriaR = new JComboBox<>(new DefaultComboBoxModel<CategReceita>(CategReceita.values()));

        JButton btnSalvar = new JButton("Salvar Receita");

        panel.add(lblDescricao);
        panel.add(txtDescricao);
        panel.add(lblValor);
        panel.add(txtValor);
        panel.add(lblData);
        panel.add(txtData);
        panel.add(lblCategoria);
        panel.add(cmbCategoriaR);
        panel.add(new JLabel()); // Placeholder
        panel.add(btnSalvar);

        btnSalvar.addActionListener(e -> {
            try {
                String descricao = txtDescricao.getText();
                double valor = Double.parseDouble(txtValor.getText());
                LocalDate data = LocalDate.parse(txtData.getText());
                CategReceita categoria = (CategReceita)cmbCategoriaR.getSelectedItem();

                Receita receita = new Receita(descricao, valor, data, categoria);
                controller.adicionarLancamento(receita);
                JOptionPane.showMessageDialog(this, "Receita salva com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar receita: " + ex.getMessage());
            }
        });

        return panel;
    }

    // Painel para incluir despesas
    private JPanel criarPainelIncluirDespesa() {
        JPanel panel = new JPanel(new GridLayout(5, 2));
        JLabel lblDescricao = new JLabel("Descrição:");
        JLabel lblValor = new JLabel("Valor:");
        JLabel lblData = new JLabel("Data (AAAA-MM-DD):");
        JLabel lblCategoria = new JLabel("Categoria:");

        JTextField txtDescricao = new JTextField();
        JTextField txtValor = new JTextField();
        JTextField txtData = new JTextField();
        JComboBox<CategDespesa> cmbCategoriaD = new JComboBox<>(new DefaultComboBoxModel<CategDespesa>(CategDespesa.values()));

        JButton btnSalvar = new JButton("Salvar Despesa");

        panel.add(lblDescricao);
        panel.add(txtDescricao);
        panel.add(lblValor);
        panel.add(txtValor);
        panel.add(lblData);
        panel.add(txtData);
        panel.add(lblCategoria);
        panel.add(cmbCategoriaD);
        panel.add(new JLabel()); // Placeholder
        panel.add(btnSalvar);

        btnSalvar.addActionListener(e -> {
            try {
                String descricao = txtDescricao.getText();
                double valor = (Double.parseDouble(txtValor.getText())*-1);
                LocalDate data = LocalDate.parse(txtData.getText());
                CategDespesa categoria = (CategDespesa) cmbCategoriaD.getSelectedItem();

                Despesa despesa = new Despesa(descricao, valor, data, categoria);
                controller.adicionarLancamento(despesa);
                JOptionPane.showMessageDialog(this, "Despesa salva com sucesso!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar despesa: " + ex.getMessage());
            }
        });

        return panel;
    }

    // Painel para consultar saldo
    private JPanel criarPainelConsultarSaldo() {
        JPanel panel = new JPanel(new BorderLayout());
        JButton btnConsultar = new JButton("Consultar Saldo");
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        panel.add(btnConsultar, BorderLayout.NORTH);
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        btnConsultar.addActionListener(e -> {
            double saldo = controller.calcularSaldoTotal();
            textArea.setText("Saldo disponível: " + saldo);
        });

        return panel;
    }

    // Painel para listar lançamentos
    private JPanel criarPainelListarLancamentos() {
        JPanel panel = new JPanel(new BorderLayout());
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JButton btnListar = new JButton("Listar Lançamentos");

        panel.add(btnListar, BorderLayout.NORTH);
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        btnListar.addActionListener(e -> {
            textArea.setText(controller.listarLancamentosOrdenados());
            //textArea.append();
        });

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}


