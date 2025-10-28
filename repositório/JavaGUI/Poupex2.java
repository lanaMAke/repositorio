import javax.swing.*;
import java.awt.*;

public class Poupex2{

    public static void main(String[] args){


    JFrame frame = new JFrame("POUPEX");
    frame.setSize(500,300); // la/rg, alt;
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar a tela com o 'x'
    

    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    
    
   JLabel descricao1 = new JLabel("Juros ao mês %:");
    JTextField campo1 = new JTextField(5);
     campo1.setFont(new Font("Serif", Font.BOLD, 36));
     campo1.setLayout(new GridLayout(5, 2, 10, 10));
     descricao1.setLayout(new GridLayout(5, 2, 10, 10));

   JLabel descricao2 = new JLabel("Num. de anos:");
     descricao2.setLayout(new GridLayout(5, 2, 10, 10));
     JTextField campo2 = new JTextField(10);
     campo2.setBounds(20, 25, 100,200); 
   JLabel descricao3 = new JLabel("Depósito mensal R$:");
     descricao3.setLayout(new GridLayout(5, 2, 10, 10));
     JTextField campo3 = new JTextField(10);
     campo3.setBounds(30, 30, 100,200);
   JLabel descricao4 = new JLabel("Total poupado R$:");
     descricao4.setLayout(new GridLayout(5, 2, 10, 10));
   
    
    JButton okButton = new JButton("OK");
    
  

       

    
       
    panel.add(okButton);
    panel.add(campo1);
    panel.add(campo2);
    panel.add(campo3);
    panel.add(descricao1);
    panel.add(descricao2);
    panel.add(descricao3);
    panel.add(descricao4);


    frame.add(panel);
    frame.setVisible(true); // janela ser visivel
    }
}

