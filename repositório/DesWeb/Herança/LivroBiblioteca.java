public class LivroBiblioteca extends Livro{


  private String localPrateleira;
  private String categoria;
  private int prazoEntrega;
  private String nomeQuemEmprestou;

//metodos

  // padrão Construtor
    LivroBiblioteca(){}

    
  // padrão Construtor += todos os parâmetros
    LivroBiblioteca(int codigo, String titulo, String autor, String editora, int nrPaginas, 
                    int edicao, String localPrateleira, String categoria, int prazoEntrega, 
                    String nomeQuemEmprestou ){
  //acesso ao DadMethod <padrãozinho p/ modificar os parametros>
     super(codigo, titulo, autor, editora, nrPaginas, edicao);
     //
     this.localPrateleira = localPrateleira;
     this.categoria = categoria;
     this.prazoEntrega = prazoEntrega;
     this.nomeQuemEmprestou = nomeQuemEmprestou;  
    }

  // Uso de Get - ajuda na exibição la no prgram. principal == com return*   &&    Uso do Set - (Absorver || receber) valores == sem return*
   public String getLocalPrateleira(){
    return localPrateleira;
   }
   public void setLocalPrateleira(String prateleira){
    this.localPrateleira = prateleira;
   }

   public String getCategoria(){
    return categoria;
   }
   public void setCategoria(String categoria){
    this.categoria = categoria;
   }

   public int getPrazoEntrega(){
    return prazoEntrega;
   }
   public void setPrazoEntrega(int prazo){
    this.prazoEntrega = prazo; 
   }
   
   public String getQuemEmprestou(){
   return nomeQuemEmprestou;
   }
   public void setQuemEmprestou(String nome){
    this.nomeQuemEmprestou = nome;
   }

   //Açoes
   public void Alugar(){
     System.out.println("Estou Alugando! \n");
   }

   public void Devolver(){
    System.out.println("Estou para Devolver...\n");
   }

   //Polimorfismo ( modificar metodo que tem na superclass)
  @Override
     public void Localizar() {
      System.out.println("Estou Localizando Livro da Biblioteca...\n");
  }
  @Override
    public void Ler() {
      System.out.println("Estou Lendo o Livro na Biblioteca \n");
  }
  @Override
   public void Cadastrar() {
      System.out.println("Estou Cadastrando Livro na biblioteca\n");
}
}