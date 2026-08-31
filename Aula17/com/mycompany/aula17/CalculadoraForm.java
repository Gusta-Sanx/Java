package com.mycompany.aula17;

public class CalculadoraForm extends javax.swing.JFrame {
    private static final String TEXTO_INICIAL = "0";
    private static final String TEXTO_ERRO = "Erro";
    private static final String TEXTO_DIVISAO_ZERO = "Impossível dividir por 0";

    private CalculadoraP calc;
    private boolean limparDisplay;

    private javax.swing.JButton btnZero;
    private javax.swing.JButton btnUm;
    private javax.swing.JButton btnDois;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnQuatro;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSete;
    private javax.swing.JButton btnOito;
    private javax.swing.JButton btnNove;
    private javax.swing.JButton btnVirgula;
    private javax.swing.JButton btnMais;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnVezes;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnDELL;
    private javax.swing.JTextField txtDisplay;

    public CalculadoraForm() {
        initComponents();
        setLocationRelativeTo(null);

        calc = new CalculadoraP();
        limparDisplay = false;
        txtDisplay.setText(TEXTO_INICIAL);
    }

    private void digitarNum(String texto) {
        String display = txtDisplay.getText();

        if (deveLimparAntesDeDigitar(display)) {
            display = "";
            limparDisplay = false;
        }

        if (texto.equals(",") && display.contains(",")) {
            return;
        }

        if (texto.equals(",") && display.isEmpty()) {
            txtDisplay.setText("0,");
            return;
        }

        txtDisplay.setText(display + texto);
    }

    private boolean deveLimparAntesDeDigitar(String display) {
        return limparDisplay
                || display.equals(TEXTO_INICIAL)
                || display.equals(TEXTO_ERRO)
                || display.equals(TEXTO_DIVISAO_ZERO);
    }

    private void selecionarOperador(String op) {
        try {
            double valorAtual = lerNumeroDoDisplay();
            calc.prepararOperacao(valorAtual, op);
            limparDisplay = true;
        } catch (NumberFormatException e) {
            mostrarErro();
            limparDisplay = true;
        }
    }

    private double lerNumeroDoDisplay() {
        return Double.parseDouble(txtDisplay.getText().replace(",", "."));
    }

    private String formatarResultado(double valor) {
        if (valor == (long) valor) {
            return String.valueOf((long) valor);
        }

        return String.valueOf(valor).replace(".", ",");
    }

    private javax.swing.JButton criarBotao(String texto) {
        javax.swing.JButton botao = new javax.swing.JButton(texto);
        botao.setFont(new java.awt.Font("Segoe UI", 0, 18));
        botao.setFocusable(false);
        return botao;
    }

    private void mostrarErro() {
        txtDisplay.setText(TEXTO_ERRO);
        limparDisplay = true;
    }

    private void mostrarDivisaoPorZero() {
        txtDisplay.setText(TEXTO_DIVISAO_ZERO);
        limparDisplay = true;
    }

    private boolean displayEstaInvalido() {
        String display = txtDisplay.getText();
        return display.isEmpty()
                || display.equals(TEXTO_ERRO)
                || display.equals(TEXTO_DIVISAO_ZERO);
    }

    private void calcularResultado() {
        if (displayEstaInvalido()) {
            mostrarErro();
            return;
        }

        try {
            double segundoNumero = lerNumeroDoDisplay();
            double resultado = calc.calcular(segundoNumero);
            txtDisplay.setText(formatarResultado(resultado));
            limparDisplay = true;
        } catch (ArithmeticException e) {
            mostrarDivisaoPorZero();
        } catch (NumberFormatException e) {
            mostrarErro();
        }
    }

    private void limparTudo() {
        calc.limpar();
        txtDisplay.setText(TEXTO_INICIAL);
        limparDisplay = false;
    }

    private void limparEntrada() {
        txtDisplay.setText(TEXTO_INICIAL);
        limparDisplay = false;
    }

    private void apagarUltimo() {
        String display = txtDisplay.getText();

        if (display.equals(TEXTO_ERRO) || display.equals(TEXTO_DIVISAO_ZERO) || display.length() <= 1) {
            txtDisplay.setText(TEXTO_INICIAL);
        } else {
            txtDisplay.setText(display.substring(0, display.length() - 1));
        }
    }

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNum("0");
    }

    private void btnUmActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNum("1");
    }

    private void btnDoisActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNum("2");
    }

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNum("3");
    }

    private void btnQuatroActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNum("4");
    }

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNum("5");
    }

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNum("6");
    }

    private void btnSeteActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNum("7");
    }

    private void btnOitoActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNum("8");
    }

    private void btnNoveActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNum("9");
    }

    private void btnVirgulaActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNum(",");
    }

    private void btnMaisActionPerformed(java.awt.event.ActionEvent evt) {
        selecionarOperador("+");
    }

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {
        selecionarOperador("-");
    }

    private void btnVezesActionPerformed(java.awt.event.ActionEvent evt) {
        selecionarOperador("*");
    }

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {
        selecionarOperador("/");
    }

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {
        calcularResultado();
    }

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {
        limparTudo();
    }

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {
        limparEntrada();
    }

    private void btnDELLActionPerformed(java.awt.event.ActionEvent evt) {
        apagarUltimo();
    }

    private void initComponents() {
        txtDisplay = new javax.swing.JTextField();
        btnCE = criarBotao("CE");
        btnC = criarBotao("C");
        btnDELL = criarBotao("DEL");
        btnSete = criarBotao("7");
        btnOito = criarBotao("8");
        btnNove = criarBotao("9");
        btnVezes = criarBotao("x");
        btnQuatro = criarBotao("4");
        btnCinco = criarBotao("5");
        btnSeis = criarBotao("6");
        btnMenos = criarBotao("-");
        btnUm = criarBotao("1");
        btnDois = criarBotao("2");
        btnTres = criarBotao("3");
        btnMais = criarBotao("+");
        btnDivisao = criarBotao("/");
        btnZero = criarBotao("0");
        btnVirgula = criarBotao(",");
        btnIgual = criarBotao("=");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        txtDisplay.setEditable(false);
        txtDisplay.setFont(new java.awt.Font("Segoe UI", 0, 32));
        txtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDisplay.setText("0");

        btnZero.addActionListener(this::btnZeroActionPerformed);
        btnUm.addActionListener(this::btnUmActionPerformed);
        btnDois.addActionListener(this::btnDoisActionPerformed);
        btnTres.addActionListener(this::btnTresActionPerformed);
        btnQuatro.addActionListener(this::btnQuatroActionPerformed);
        btnCinco.addActionListener(this::btnCincoActionPerformed);
        btnSeis.addActionListener(this::btnSeisActionPerformed);
        btnSete.addActionListener(this::btnSeteActionPerformed);
        btnOito.addActionListener(this::btnOitoActionPerformed);
        btnNove.addActionListener(this::btnNoveActionPerformed);
        btnVirgula.addActionListener(this::btnVirgulaActionPerformed);

        btnMais.addActionListener(this::btnMaisActionPerformed);
        btnMenos.addActionListener(this::btnMenosActionPerformed);
        btnVezes.addActionListener(this::btnVezesActionPerformed);
        btnDivisao.addActionListener(this::btnDivisaoActionPerformed);

        btnIgual.addActionListener(this::btnIgualActionPerformed);

        btnC.addActionListener(this::btnCActionPerformed);

        btnCE.addActionListener(this::btnCEActionPerformed);

        btnDELL.addActionListener(this::btnDELLActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDisplay)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnCE, 75, 75, 75)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnC, 75, 75, 75)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDELL, 75, 75, 75))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSete, 75, 75, 75)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnOito, 75, 75, 75)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnNove, 75, 75, 75)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnVezes, 75, 75, 75))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnQuatro, 75, 75, 75)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCinco, 75, 75, 75)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSeis, 75, 75, 75)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnMenos, 75, 75, 75))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnUm, 75, 75, 75)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDois, 75, 75, 75)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnTres, 75, 75, 75)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnMais, 75, 75, 75))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnDivisao, 75, 75, 75)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnZero, 75, 75, 75)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnVirgula, 75, 75, 75)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnIgual, 75, 75, 75)))
                    .addContainerGap())
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDisplay, 70, 70, 70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCE, 55, 55, 55)
                    .addComponent(btnC, 55, 55, 55)
                    .addComponent(btnDELL, 55, 55, 55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSete, 55, 55, 55)
                    .addComponent(btnOito, 55, 55, 55)
                    .addComponent(btnNove, 55, 55, 55)
                    .addComponent(btnVezes, 55, 55, 55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuatro, 55, 55, 55)
                    .addComponent(btnCinco, 55, 55, 55)
                    .addComponent(btnSeis, 55, 55, 55)
                    .addComponent(btnMenos, 55, 55, 55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUm, 55, 55, 55)
                    .addComponent(btnDois, 55, 55, 55)
                    .addComponent(btnTres, 55, 55, 55)
                    .addComponent(btnMais, 55, 55, 55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDivisao, 55, 55, 55)
                    .addComponent(btnZero, 55, 55, 55)
                    .addComponent(btnVirgula, 55, 55, 55)
                    .addComponent(btnIgual, 55, 55, 55))
                .addContainerGap()
        );

        pack();
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculadoraForm().setVisible(true);
            }
        });
    }
}
