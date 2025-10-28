public class Pessoa{
    //add mais um atributo
    private double identidade; // acrescentar vetor [11];
    private String nome;
    private int idade;
    private String nacionalidade;
    private String genero;

//Construtor padrão
Pessoa(){

   this.identidade = 0;
   this.nome = "Sem nome";
   this.idade = 0;
   this.genero = "Não Informado";
   this.nacionalidade = "Não informado";
}
Pessoa(String nome,double identidade,int idade,String nacionalidade, String genero){

   this.identidade = identidade;
   this.nome = nome;
   this.idade = idade;
   this.nacionalidade = nacionalidade;
   this.genero = genero;
}

//Acessos --<>
public String getNome(){
    return nome;
}
public void setNome(String name){
    this.nome = name;  
}

public double getIdentidade(){
  return identidade;
}
public void setIdentidade(double ident){
  this.identidade = ident;

}

public int getIdade(){
   return idade;
}
public void setIdade(int idade){
  this.identidade = idade;
}

public String getnacionalidade(){
  return nacionalidade;
}
public void setnacionalidade(String nacionalidade){
  this.nacionalidade = nacionalidade;
}

public String getGenero(){
  return genero;
}
public void setGenero(String genero){
  this.genero = genero;
}


//Ações --<>

public void Cadastrar(){
    System.out.println("Cadastrando...");
}
public void Acessar(){
  System.out.println("Acessando login...");
}
/*
public void ExibirInfo(){
  System.out.print("\t-- Confirmar dados -- \n");
  System.out.println("Nome.: "+nome);
  System.out.println("Idade.:"+idade);
  System.out.println("Genero.: "+genero);
  System.out.println(identidade);
  System.out.println(nacionalidade);

}*/

}