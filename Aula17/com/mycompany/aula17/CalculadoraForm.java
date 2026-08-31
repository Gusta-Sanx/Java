
package com.mycompany.aula17;

public class CalculadoraForm extends javax.swing.JFrame {

    private CalculadoraP calc;
    private boolean limparDisplay;

    public CalculadoraForm() {
        initComponents();
        setLocationRelativeTo(null);

        calc = new CalculadoraP();
        limparDisplay = false;
        txtDisplay.setText("0");
    }

    private void digitarNumero(String texto) {
        if (limparDisplay || txtDisplay.getText().equals("0") || txtDisplay.getText().equals("Erro")) {
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
        double valorAtual = Double.parseDouble(
            txtDisplay.getText().replace(",", ".")
        );

        calc.prepararOperacao(valorAtual, op);

        limparDisplay = true;
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

    private void apagarUltimoCaractere() {
        String texto = txtDisplay.getText();

        if (texto.equals("Erro") || texto.length() <= 1) {
            txtDisplay.setText("0");
            limparDisplay = false;
            return;
        }

        txtDisplay.setText(
            texto.substring(0, texto.length() - 1)
        );
    }

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNumero("0");
    }

    private void btnUmActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNumero("1");
    }

    private void btnDoisActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNumero("2");
    }

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNumero("3");
    }

    private void btnQuatroActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNumero("4");
    }

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNumero("5");
    }

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNumero("6");
    }

    private void btnSeteActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNumero("7");
    }

    private void btnOitoActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNumero("8");
    }

    private void btnNoveActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNumero("9");
    }

    private void btnVirgulaActionPerformed(java.awt.event.ActionEvent evt) {
        digitarNumero(",");
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
        calc.limpar();
        txtDisplay.setText("0");
        limparDisplay = false;
    }

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {
        txtDisplay.setText("0");
        limparDisplay = false;
    }

    private void btnDELLActionPerformed(java.awt.event.ActionEvent evt) {
        apagarUltimoCaractere();
    }
}

