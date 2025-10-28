public class PessoaAluno extends Pessoa{

private int diciplinas; //Quant. diciplinas
private double matricula; //add vetor [9];
private String curso;

PessoaAluno(){
 this.diciplinas = 0;
 this.matricula = 0;
 this.curso = "Não mencionada";   
}
PessoaAluno(double identidade, String nome,int idade,String nacionalidade,String genero,int diciplinas,int matricula,String instituicao){

super(identidade, nome, idade, nacionalidade, genero);

this.diciplinas = diciplinas;
this.matricula = matricula;
this. instituicao = instituicao;
}

//Acessos --<>
public int getDiciplinas(){
    return diciplinas;
}
public void setDiciplinas(int diciplinas){
    this.diciplinas = diciplinas;
}

public double getMatricula(){
    return matricula;
}
public void setMatricula(double matricula){
    this.matricula = matricula;
}

public String getCurso(){
    return curso;
}
public void setCurso(String curso){
   this.curso = curso;
}

//Ações --<>

@Override
public void Cadastrar(){
    System.out.println("Cadastrando Aluno...");
}

@Override
public void Acessar(){
  System.out.println("Acessando loginAluno aguarde ...");
}
/*
@Override
public void ExibirInfo(){
  System.out.print("\t-- Exibindo dados -- \n");
  PessoaAluno();
}*/
}