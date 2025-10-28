public class SistemaLivro{

    public static void main(String[] args){
      //Livro 
        

        Livro livro = new Livro();
        livro.setCodigo(1);
        livro.setTitulo("Codigo da Vinci");
        livro.setAutor("Desconhecido");
        livro.setEditora("Editora xyz");
        livro.setNrPaginas(100);
        livro.setEdicao(3);

        livro.Ler();
        livro.Cadastrar();
        livro.Localizar();
         
        mensagem = "Codigo.: "+ livro.getCodigo()+
                   "\nTitulo.: "+livro.getTitulo()+
                   "\nAutor.:  "+livro.getAutor()+
                   "\neditora.: "+livro.getEditora()+
                   "\nN° de Paginas.:"+livro.getNrPaginas()+
                   "\nEdiçao.: "+ livro.getEdicao();
        System.out.println("=================================================");
        System.out.println("Dados do Modulo Livro.: "+mensagem);
        

      // livro Biblioteca 
        LivroBiblioteca livrobiblioteca =  new LivroBiblioteca();

        livrobiblioteca.setCodigo(11);
        livrobiblioteca.setTitulo("Cinderela");
        livrobiblioteca.setAutor("Desconhecido");
        livrobiblioteca.setEditora("Editora 123");
        livrobiblioteca.setNrPaginas(200);
        livrobiblioteca.setEdicao(6);

        livrobiblioteca.Ler();
        livrobiblioteca.Cadastrar();
        livrobiblioteca.Localizar();

        mensagem = "Codigo.: "+ livro.getCodigo()+
                   "\nTitulo.: "+livrobiblioteca.getTitulo()+
                   "\nAutor.:  "+livrobiblioteca.getAutor()+
                   "\neditora.: "+livrobiblioteca.getEditora()+
                   "\nN° de Paginas.:"+livrobiblioteca.getNrPaginas()+
                   "\nEdiçao.: "+livrobiblioteca.getEdicao();
        System.out.println("=================================================");
        System.out.println("Dados do Modulo Biblioteca.: "+mensagem);

      //Livro Livraria
      LivroLivraria livrolivraria = new LivroLivraria();

      livrolivraria.setCodigo(25);
      livrolivraria.setTitulo("Chora");
      livrolivraria.setAutor("Eu");
      livrolivraria.setEditora("Editora lalala");
      livrolivraria.setNrPaginas(900);
      livrolivraria.setEdicao(1);

      livrolivraria.setCategoria("romance");
      livrolivraria.setPreco(10.56);
      livrolivraria.setNovoUsado(true);//falso = 0 -- true = 1
      livrolivraria.setLocalPrateleira("Piso qualquer");

        livrolivraria.Ler();
        livrolivraria.Cadastrar();
        livrolivraria.Localizar();
        livrolivraria.Vender();
      
      mensagem = "Codigo.: "+ livro.getCodigo()+
                   "\nTitulo.: "+livrolivraria.getTitulo()+
                   "\nAutor.:  "+livrolivraria.getAutor()+
                   "\neditora.: "+livrolivraria.getEditora()+
                   "\nN° de Paginas.:"+livrolivraria.getNrPaginas()+
                   "\nEdiçao.: "+livrolivraria.getEdicao()+
                   "\nCategoria.: "+livrolivraria.getPreco()+
                   "\nPreço.: "+livrolivraria.getNovoUsado()+
                   "\nLocalizaçao do livro.: "+livrolivraria.getLocalPrateleira();

     
       
       System.out.println("=================================================");
       System.out.println("Dados do Modulo Livraria.: "+mensagem);

      Livro livro2 = new Livro(99,"titanic");
      System.out.println("Livro 2.: "+livro2.getTitulo());

    /* LivroBiblioteca livrobiblioteca2 = new LivroBiblioteca(1, "Se puidesse contar as Estrelas", "Marca", 300, 22,"lalaa", "Ficcao");
     System.out.println("Livro da Biblioteca.: "+)*/
     
    }
}