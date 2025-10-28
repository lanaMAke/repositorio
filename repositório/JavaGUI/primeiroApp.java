import java.awt.*;
import javax.swing.*;

//estrutura -- ( do menor para o maior <>) -- ordem de visibilidade.

/*
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
*/


public class PrimeiroApp{

    public static void main(String[] args){
        System.out.println("Hello GUI");


        JFrame frame = new JFrame("Minha  primeira Janela");
         frame.setSize(400, 300); // por pixels ( largura, altura);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //encerrar programa.(method - feche o programa ao sair) variável global do Jframe 

          
        
/*
        JFrame frame1 = new JFrame("Minha Segunda Janela");
          frame1.setSize(400, 300); // por pixels ( largura, altura);
          frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //encerrar programa.(method - feche o programa ao sair) variável global do Jframe
            frame1.setVisible(true); // (aparecer) -- sempre no fim. 
*/
        JPanel panel = new JPanel(); 
      //  panel.setBackground(Color.BLUE); //plano de fundo
        panel.setLayout(new BorderLayout());



        JButton button = new JButton("Clique aquii!!");
       // button.setBackground(); //cor do butão.
        button.setForeground(Color.PINK); // cor do TEXTO do butão.
        button.setPreferredSize(new Dimension(50, 20));
        JButton button2 = new JButton("Cuidado aiai");
       // button2.setBackground(); //cor do butão.
        button2.setForeground(Color.PINK); // cor do TEXTO do butão.
        button2.setPreferredSize(new Dimension(50, 20)); // tamanho do botão.
         
        JTextField textField = new JTextField(10);
        textField.setFont(new Font("Serif", Font.BOLD, 36));


            JLabel label = new JLabel("Digite...");
       //fonte -- nome da fonte, negrtito || outras coisas, tam.
        label.setFont(new Font(" Serif", Font.BOLD, 30));
        label.setHorizontalAlignment(JLabel.CENTER); //posicionamento das msg.
     //   label.setVerticalAligment(); //posicionamento das msg.




      /* Adicionar um Listener no click do button */
       // e = variavel ( retorno salvo na variavel) -- retorno da ação da função
      button.addActionListener(e -> { // exibição = do que digitou
                JOptionPane.showMessageDialog(null, textField.getText(), "...", 2);
        });

      button2.addActionListener(e -> { //exibição = label
                JOptionPane.showMessageDialog(null, label.getText(), "...", 2);
        });
    
        
         //tamanho do textField
       
        


        JTextArea textArea = new JTextArea();
        
       
       //agrupamento de componente com componente
        JPanel formPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        formPanel.add(label);
        formPanel.add(textField);        
        


        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        buttonPanel.add(button2);
        buttonPanel.add(button);


        panel.add(formPanel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.SOUTH);// add um componente.
      //  panel.add(button, BorderLayout.EAST);// add um componente no frame. 
        panel.add(textArea, BorderLayout.EAST);

        //Centralizar tela

        frame.setLocationRelativeTo(null);
        frame.add(panel); // add um componente no frame. 
        frame.setVisible(true); // (aparecer) - final de tudo.

        // janela splash ( aviso -- tela padrão -- capturar informação)    method ShowMessageDialog(<null>,String,String,int)
     //   JOptionPane.showMessageDialog(null,"Mensagem","Titulo",0); // (0 - X && 1 ! info && 3 ^ alerta)
    }
}