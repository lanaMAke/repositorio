public class LivroLivraria extends Livro{

    private double preco;
    private boolean novoUsado;
    private String localPrateleira;
    private String categoria;

    //Passando Parametros
    public double getPreco(){
        return preco;
    }
    public void setPreco(double valor){
        this.preco = valor;
    }

    public boolean getNovoUsado(){
        return novoUsado;
    }
    public void setNovoUsado(boolean novoUsado){//ultilizando o boo*
        this.novoUsado = novoUsado;
    }

    public String getLocalPrateleira(){
        return localPrateleira;
    }
    public void setLocalPrateleira(String posicao){
        this.localPrateleira = posicao;
    }

    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String category){
        this.categoria = category;
    }
   
    //methods
    public void Vender(){
        System.out.println("Vendi os livros disponiveis!\n\n");
    }
    
    @Override
     public void Localizar() {
      System.out.println("Estou Localizando Livro da Livraria...\n");
  }
    @Override
    public void Ler() {
      System.out.println("Estou Lendo o Livro na Livraria \n");
  }
    @Override
   public void Cadastrar() {
      System.out.println("Estou Cadastrando...\n");
   }
}