package com.mycompany.aula17;

public class CalculadoraForm extends javax.swing.JFrame {

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
    }

    private void digitarNumero(String texto) {

        if (limparDisplay
                || txtDisplay.getText().equals("0")
                || txtDisplay.getText().equals("Erro")) {

            if (texto.equals(",")) {
                txtDisplay.setText("0,");
            } else {
                txtDisplay.setText(texto);
            }

            limparDisplay = false;
            return;
        }

        if (texto.equals(",") && txtDisplay.getText().contains(",")) {
            return;
        }

        txtDisplay.setText(txtDisplay.getText() + texto);
    }

    private void selecionarOperador(String op) {

        try {
            double valorAtual = Double.parseDouble(
                    txtDisplay.getText().replace(",", ".")
            );

            calc.prepararOperacao(valorAtual, op);

            limparDisplay = true;

        } catch (NumberFormatException e) {
            txtDisplay.setText("Erro");
            limparDisplay = true;
        }
    }

    private void calcularResultado() {

        try {
            double segundoNumero = Double.parseDouble(
                    txtDisplay.getText().replace(",", ".")
            );

            double resultado = calc.calcular(segundoNumero);

            if (resultado == (long) resultado) {
                txtDisplay.setText(String.valueOf((long) resultado));
            } else {
                txtDisplay.setText(
                        String.valueOf(resultado).replace(".", ",")
                );
            }

            limparDisplay = true;

        } catch (ArithmeticException | NumberFormatException e) {
            txtDisplay.setText("Erro");
            limparDisplay = true;
        }
    }

    private void limparTudo() {
        calc.limpar();
        txtDisplay.setText("0");
        limparDisplay = false;
    }

    private void limparSomenteDisplay() {
        txtDisplay.setText("0");
        limparDisplay = false;
    }

    private void apagarUltimoCaractere() {

        if (limparDisplay || txtDisplay.getText().equals("Erro")) {
            txtDisplay.setText("0");
            limparDisplay = false;
            return;
        }

        String texto = txtDisplay.getText();

        if (texto.length() <= 1) {
            txtDisplay.setText("0");
        } else {
            txtDisplay.setText(
                    texto.substring(0, texto.length() - 1)
            );
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        txtDisplay = new javax.swing.JTextField();

        btnC = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnDELL = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();

        btnSete = new javax.swing.JButton();
        btnOito = new javax.swing.JButton();
        btnNove = new javax.swing.JButton();
        btnVezes = new javax.swing.JButton();

        btnQuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();

        btnUm = new javax.swing.JButton();
        btnDois = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnMais = new javax.swing.JButton();

        btnZero = new javax.swing.JButton();
        btnVirgula = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();

        setDefaultCloseOperation(
                javax.swing.WindowConstants.EXIT_ON_CLOSE
        );

        setTitle("Calculadora");
        setResizable(false);

        txtDisplay.setEditable(false);
        txtDisplay.setFont(
                new java.awt.Font("Segoe UI", 1, 24)
        );

        txtDisplay.setHorizontalAlignment(
                javax.swing.JTextField.RIGHT
        );

        txtDisplay.setText("0");

        btnC.setText("C");

        btnC.addActionListener(evt -> {
            limparTudo();
        });

        btnCE.setText("CE");

        btnCE.addActionListener(evt -> {
            limparSomenteDisplay();
        });

        btnDELL.setText("DEL");

        btnDELL.addActionListener(evt -> {
            apagarUltimoCaractere();
        });

        btnDivisao.setText("/");

        btnDivisao.addActionListener(evt -> {
            selecionarOperador("/");
        });

        btnSete.setText("7");

        btnSete.addActionListener(evt -> {
            digitarNumero("7");
        });

        btnOito.setText("8");

        btnOito.addActionListener(evt -> {
            digitarNumero("8");
        });

        btnNove.setText("9");

        btnNove.addActionListener(evt -> {
            digitarNumero("9");
        });

        btnVezes.setText("x");

        btnVezes.addActionListener(evt -> {
            selecionarOperador("*");
        });

        btnQuatro.setText("4");

        btnQuatro.addActionListener(evt -> {
            digitarNumero("4");
        });

        btnCinco.setText("5");

        btnCinco.addActionListener(evt -> {
            digitarNumero("5");
        });

        btnSeis.setText("6");

        btnSeis.addActionListener(evt -> {
            digitarNumero("6");
        });

        btnMenos.setText("-");

        btnMenos.addActionListener(evt -> {
            selecionarOperador("-");
        });

        btnUm.setText("1");

        btnUm.addActionListener(evt -> {
            digitarNumero("1");
        });

        btnDois.setText("2");

        btnDois.addActionListener(evt -> {
            digitarNumero("2");
        });

        btnTres.setText("3");

        btnTres.addActionListener(evt -> {
            digitarNumero("3");
        });

        btnMais.setText("+");

        btnMais.addActionListener(evt -> {
            selecionarOperador("+");
        });

        btnZero.setText("0");

        btnZero.addActionListener(evt -> {
            digitarNumero("0");
        });

        btnVirgula.setText(",");

        btnVirgula.addActionListener(evt -> {
            digitarNumero(",");
        });

        btnIgual.setText("=");

        btnIgual.addActionListener(evt -> {
            calcularResultado();
        });

        javax.swing.GroupLayout layout
                = new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING
                )
                        .addGroup(
                                layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(
                                                layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.LEADING
                                                )
                                                        .addComponent(txtDisplay)
                                                        .addGroup(
                                                                layout.createSequentialGroup()

                                                                        .addGroup(
                                                                                layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                        false
                                                                                )
                                                                                        .addComponent(btnC, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                                                        .addComponent(btnSete, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                                                        .addComponent(btnQuatro, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                                                        .addComponent(btnUm, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                                                        .addComponent(btnZero, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                                        )

                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED
                                                                        )

                                                                        .addGroup(
                                                                                layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                        false
                                                                                )
                                                                                        .addComponent(btnCE, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                                                        .addComponent(btnOito, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                                                        .addComponent(btnCinco, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                                                        .addComponent(btnDois, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                                                        .addComponent(btnVirgula, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                                        )

                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED
                                                                        )

                                                                        .addGroup(
                                                                                layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                        false
                                                                                )
                                                                                        .addComponent(btnDELL, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                                                        .addComponent(btnNove, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                                                        .addComponent(btnSeis, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                                                        .addComponent(btnTres, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                                                        .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                                        )

                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED
                                                                        )

                                                                        .addGroup(
                                                                                layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                        false
                                                                                )
                                                                                        .addComponent(btnDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                                                        .addComponent(btnVezes, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                                                        .addComponent(btnMenos, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                                                        .addComponent(btnMais, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                                                        )
                                                        )
                                        )
                                        .addContainerGap()
                        )
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING
                )
                        .addGroup(
                                layout.createSequentialGroup()

                                        .addContainerGap()

                                        .addComponent(
                                                txtDisplay,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                55,
                                                javax.swing.GroupLayout.PREFERRED_SIZE
                                        )

                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
                                        )

                                        .addGroup(
                                                layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.BASELINE
                                                )
                                                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnDELL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        )

                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED
                                        )

                                        .addGroup(
                                                layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.BASELINE
                                                )
                                                        .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        )

                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED
                                        )

                                        .addGroup(
                                                layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.BASELINE
                                                )
                                                        .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        )

                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED
                                        )

                                        .addGroup(
                                                layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.BASELINE
                                                )
                                                        .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnMais, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        )

                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED
                                        )

                                        .addGroup(
                                                layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.BASELINE
                                                )
                                                        .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        )

                                        .addContainerGap()
                        )
        );

        pack();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new CalculadoraForm().setVisible(true);
        });
    }
}
