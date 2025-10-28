import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner (System.in);
    
    String nome;
    double salarioFixo = sc.nextDouble();
    double valorVendas = sc.nextDouble();
    double montante = 0;
    double total = 0;
    
    
    montante = valorVendas * 15/100;
    total = salarioFixo + montante;
    
    System.out.printf("TOTAL = R$ %2.f\n"+total);
    
    

    }
 
}