import java.awt.*;//biblioteca
import javax.swing.*; //biblioteca (classes)
 
import java.awt.event.ActionEvent; // guarda as ações
import java.awt.event.ActionListener; // ação 


public class Poupex{
 
 public static void main( String [] args){

//janela
    JFrame frame = new JFrame("POUPEX");
    
    frame.setSize(200,500);//tam altura, larg;
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // posição da janela quando abrir (centro)
    frame.setForeground(new Color(0,0,0));//cor
    frame.setFont(new Font(" Serif", Font.BOLD, 30));// fonte e tamanho 

//Painel
    JPanel panel = new JPanel();
    panel.setSize(300,300);
    panel.setLayout(new GridBagLayout()); //layout do painel( posição dos componentes).
   
    JLabel descricao0 = new JLabel();
    descricao0.setText("Juros ao mês %:");
    descricao0.setBounds(0,1,100,10);//posicao e tam ( x,y,largura,altura).
    //cor.
    //fonte e tam.
    JLabel descricao1 = new JLabel();
    descricao1.setText("Num. de anos:");
    descricao0.setBounds(0,1,100,10);
    JLabel descricao2 = new JLabel();
    descricao2.setText("Deposito mensal R$:");

   //add no painel frases
   panel.add(descricao0);
   panel.add(descricao1);
   panel.add(descricao2);
   
   
   //add no painel Botão (mais simples || direta)
   panel.add(new JButton("OK"),BorderLayout.SOUTH);
   


    frame.add(panel);
    frame.setVisible(true);


//<> forma de expecificar posicao dos componentes ( como matriz [indiceLinha][indiceColuna])

   //posicao representada errado ( estão centralizados - precisam está na lateral)
    GridBagConstraints posicao = new GridBagConstraints();
    
    //<> -- exibindo texto
 /* posicao.gridx = 0; //posicao x( (coluna)
    posicao.gridy = 0; //posicao y; (linha)
    panel.add(new JLabel("Juros ao mes %:"), posicao);*/

// -- campo pra receber valor
    posicao.gridx = 1;
    posicao.gridy = 0;
    panel.add(new JTextField(10), posicao);

   //<> -- exibindo texto
   /* posicao.gridx = 0; 
    posicao.gridy = 1; 
    panel.add(new JLabel("Num. de anos:"), posicao);*/
// -- campo pra receber valor
    posicao.gridx = 1;
    posicao.gridy = 1;
    panel.add(new JTextField(10), posicao);

 //<> --
 /*   posicao.gridx = 0; 
    posicao.gridy = 2; 
    panel.add(new JLabel("Deposito mensal R$:"), posicao);*/

    posicao.gridx = 1;
    posicao.gridy = 2;
    panel.add(new JTextField(10), posicao);

   
 }
}