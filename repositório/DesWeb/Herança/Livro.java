
public class Livro{
 //Atributos
  private int codigo;//só essa classe tem acesso
  private String titulo;
  private String autor;
  private String editora;
  private int nrPaginas;
  private int edicao;

  //Metodos.:
    
     //Constructor method <()
     Livro(){
      this.codigo = 0;
      this.titulo = "";
      this.autor = "";
      this.editora = "";
      this.nrPaginas = 0;
      this.edicao = 0;
     }
     ////Constructor method <(parâmetros) -- pode conter mais de um met.Costr. < precisa conter mais ou menos ou dif. atributos
     Livro(int codigo, String titulo){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = "";
        this.editora = "";
        this.nrPaginas = 0;
        this.edicao = 0;
    }

    Livro(int codigo, String titulo, String autor, String editora, int nrPaginas, int edicao){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.nrPaginas = nrPaginas;
        this.edicao = edicao;
 
    }



    public int getCodigo(){//metodo de acesso para um dado privado.
       return codigo;
    }                 //  *parâmetro*
    public void setCodigo(int valor){
      //não retorna mas recebe parâmetro.
      codigo = valor;
    }


   //Acesso titulo
    public String getTitulo(){
      return this.titulo;
    }

    public void setTitulo(String titulo){
      this.titulo = titulo;
    }


   //Acesso Autor
    public String getAutor(){
      return this.autor;
    }
    public void setAutor(String autor){
      this.autor = autor;
    }


   //Acesso Edit
    public String getEditora(){
      return this.editora;
    }
    public void setEditora(String edit){
      this.editora = edit;
    }


   //Acesso Paginas
    public int getNrPaginas(){
      return this.nrPaginas;
    }

    public void setNrPaginas(int pags){
      this.nrPaginas = pags;
    }


   //Acesso Edicao
    public int getEdicao(){
      return this.edicao;
    }

    public void setEdicao(int edicao){
      this.edicao = edicao;
    }



    //ações
    public void Ler() {
      System.out.println("Estou Lendo...\n");
  }
    public void Cadastrar() {
      System.out.println("Estou Cadastrando...\n");
  }
    public void Localizar() {
      System.out.println("Estou Localizando...\n");
  }
}