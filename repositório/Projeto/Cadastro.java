import java.util.Scanner;


public class Cadastro{
    public static void main(String[] args){
   
   //instancia
   Pessoa cadastropessoa1 = new Pessoa();
   PessoaAluno cadastroAluno1 = new PessoaAluno();
   PessoaProfessor cadastroProfessor1 = new PessoaProfessor();




// Pessoa
   cadastropessoa1.identidade(1);
   cadastropessoa1.nome ("Alana");
   cadastropessoa1.nacionalidade("Brasileira");
   cadastropessoa1.genero("Feminino");

   cadastropessoa1.Cadastrar();
   cadastropessoa1.Acessar();
 //  cadastropessoa1.ExibirInfo();
   System.out.println("===================================");

//Pessoa Aluno
   cadastroAluno1.identidade(21);
   cadastroAluno1.nome ("Petri");
   cadastroAluno1.nacionalidade("Americano");
   cadastroAluno1.genero("Masculino");

   cadastroAluno1.Diciplinas(6);
   cadastroAluno1.Matricula(1);
   cadastroAluno1.Curso("Mecatronica");

   cadastroAluno1.Cadastrar();
   cadastroAluno1.Acessar();
 //  cadastroAluno1.ExibirInfo();
   System.out.println("===================================");

//Pessoa Professor
   cadastroProfessor1.identidade(7);
   cadastroProfessor1.nome ("Adri");
   cadastroProfessor1.nacionalidade("Argentina");
   cadastroProfessor1.genero("Feminino");


   cadastroProfessor1.diciplinasTrabalhadas(5);
   cadastroProfessor1.identificacao(12);
   cadastroProfessor1.instituicao("CR7");
   cadastroProfessor1.anoExperiencia(3);
   cadastroProfessor1.cursoAdminist("Dança da cadeira");
   cadastroProfessor1.contato(40);

   cadastroProfessor1.Cadastrar();
   cadastroProfessor1.Acessar();
 //  cadastroProfessor1.ExibirInfo();
   System.out.println("**************************************");  




    }
}