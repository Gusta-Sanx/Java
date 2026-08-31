package com.mycompany.aula17;

public class Calculadora extends javax.swing.JDialog {

    public Calculadora(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }

    public Calculadora() {
        this(null, true);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        javax.swing.JLabel lblMensagem
                = new javax.swing.JLabel();

        setDefaultCloseOperation(
                javax.swing.WindowConstants.DISPOSE_ON_CLOSE
        );

        setTitle("Calculadora");
        setResizable(false);

        lblMensagem.setHorizontalAlignment(
                javax.swing.SwingConstants.CENTER
        );

        lblMensagem.setText(
                "JDialog da Calculadora"
        );

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
                                        .addComponent(
                                                lblMensagem,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                260,
                                                Short.MAX_VALUE
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
                                        .addGap(40, 40, 40)
                                        .addComponent(lblMensagem)
                                        .addContainerGap(
                                                40,
                                                Short.MAX_VALUE
                                        )
                        )
        );

        pack();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {

            Calculadora dialog
                    = new Calculadora();

            dialog.setVisible(true);
        });
    }
}
