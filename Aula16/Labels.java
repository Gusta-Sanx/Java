import javax.swing.*;

public class Labels {
    private JPanel panel1;
    private JButton buttonSomar;
    private JLabel labelNumero1;
    private JLabel labelNumero2;
    private JTextField textNumero1;
    private JTextField textNumero2;
    private JLabel textResultado;
    private JButton buttonsSub;
    private JButton buttonMult;
    private JButton buttonDivi;
    private JTextField labelResultado;

    public Labels() {
        buttonSomar.addActionListener(e -> {
            double numero1 = Double.parseDouble(textNumero1.getText());
            double numero2 = Double.parseDouble(textNumero2.getText());

            double resultado = numero1 + numero2;

            labelResultado.setText("" + resultado);
        });
        buttonsSub.addActionListener(e -> {
            double numero1 = Double.parseDouble(textNumero1.getText());
            double numero2 = Double.parseDouble(textNumero2.getText());

            double resultado = numero1 - numero2;

            labelResultado.setText(""+resultado);
        });
        buttonDivi.addActionListener(e ->{
            double numero1 = Double.parseDouble(textNumero1.getText());
            double numero2 = Double.parseDouble(textNumero2.getText());

            try{
                double resultado = numero1 / numero2;
                labelResultado.setText(""+resultado);
                if(numero1 == 0 || numero2 == 0){
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException err) {
                labelResultado.setText("Imposivel dividir por 0");
            }
        });
        buttonMult.addActionListener(e->{
            double numero1 = Double.parseDouble(textNumero1.getText());
            double numero2 = Double.parseDouble(textNumero2.getText());

            double resultado = numero1 * numero2;

            labelResultado.setText(""+resultado);
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Labels");
        frame.setContentPane(new Labels().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}