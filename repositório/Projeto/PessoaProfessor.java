public class PessoaProfessor extends Pessoa{

private int diciplinasTrabalhadas;
private double identificacao;
private String instituicao;
private int anoExperiencia;
private String cursoAdminist;
private double contato;

PessoaProfessor(){
 this.diciplinasTrabalhadas = 0;
 this.identificacao = 0;
 this.instituicao = "Nao mencionado";
 this.anoExperiencia = 0;
 this.cursoAdminist = "Nao mencionado";
 this.contato = 0000000000;
}
PessoaProfessor(String nome,double identidade,int idade,String nacionalidade, String genero,
int diciplinasTrabalhadas,double identificacao,int anoExperiencia,String cursoAdministint, double contato){

super(nome, identidade, idade, nacionalidade, genero);

this.diciplinasTrabalhadas = diciplinasTrabalhadas;
this.identificacao = identificacao;
this.instituicao = instituicao;
this.anoExperiencia = anoExperiencia;
this.cursoAdminist = cursoAdminist;
this.contato = contato;
}

//Acessos --<>

public int getDiciplinasTrabalhadas(){
    return diciplinasTrabalhadas;
}
public void setDiciplinasTrabalhadas(int diciplinasTrabalhadas){
    this.diciplinasTrabalhadas = diciplinasTrabalhadas;
}

public double getIdentificacao(){
    return identificacao;
}
public void setIdentificacao(double identificacao){
   this.identificacao = identificacao;
}

public String getInstituicao(){
    return instituicao;
}
public void setInstituicao(String instituicao){
    this.instituicao = instituicao;
}

public int getAnoExperiencia(){
    return anoExperiencia;
}
public void setAnoExperiencia(int anoExperiencia){
    this.anoExperiencia = anoExperiencia;
}

public String getCursoAdmnist(){
    return cursoAdminist;
}
public void setCursoAdminist(String cursoAdminist){
    this.cursoAdminist = cursoAdminist;
}

public double getContato(){
    return contato;
}
public void setContato(double contato){
    this.contato = contato;
}

//Ações --<>

@Override
public void Cadastrar(){
    System.out.println("Cadastrando Professor...");
}
@Override
public void Acessar(){
  System.out.println("Acessando loginProfessor, aguarde...");
}
/*
@Override
public void ExibirInfo(){
  System.out.print("\t-- Confirmar dados -- \n");
  PessoaProfessor();
}*/

}

