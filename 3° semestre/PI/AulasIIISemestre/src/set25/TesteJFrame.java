package set25;

import javax.swing.*;
import java.awt.*;

public class TesteJFrame extends JFrame {
    JLabel nome;
    JTextField txtNome;

    public TesteJFrame() {
        setTitle("Primeira janela Swing");
        setSize(357, 100);
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(194, 245, 208));
        centralizar();
        nome = criarJLabel("Eita nois", 10, 10, 270, 50);
        txtNome = criarTexto(10 , 50, 270, 75);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JTextField criarTexto(int desq, int dtopo, int larg, int alt){
        JTextField jt = new JTextField();
        jt.setBounds(desq, dtopo, larg, alt);
        jt.setText("Insira texto aqui");
        jt.setHorizontalAlignment(JTextField.CENTER);
        add(jt);
        return jt;
    }

    public JLabel criarJLabel(String txt, int desq, int dtopo, int larg, int alt){
        JLabel l1 = new JLabel(txt);

        l1.setLocation(desq, dtopo);
        l1.setSize(larg, alt);

        l1.setOpaque(true);
        l1.setBackground(new Color(255,255,255));
        l1.setForeground(new Color(0,0,0));
        l1.setFont(new Font("Courier new", Font.BOLD, 12));
        l1.setToolTipText("JLabel Exemplo");

        l1.setHorizontalAlignment(SwingConstants.LEFT);
        l1.setVerticalAlignment(SwingConstants.TOP);

        add(l1);
        return l1;
    }

    public void centralizar(){
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();

        if (janela.height > screen.height){
            setSize(janela.width, screen.height);
        }
        if (janela.width > screen.height) {
            setSize(screen.width, janela.height);
        }

        setLocation((screen.width - janela.width)/2, (screen.height - janela.height)/2);
    }
}
