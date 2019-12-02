
package model;

import java.util.ArrayList;

public class Bibliotecaria implements Library{
    private String nome;
    private String senha;
    private ArrayList<Livro> livros;
    private ArrayList<Aluno> alunos;
    private ArrayList<Aluno> alunosE;

    public ArrayList<Aluno> getAlunosE() {
        return alunosE;
    }

    public void setAlunosE(ArrayList<Aluno> alunosE) {
        this.alunosE = alunosE;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
    
    public Bibliotecaria(){
        this.livros = new ArrayList();
        this.alunos = new ArrayList();
        this.alunosE = new ArrayList();
    }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    

    @Override
    public void cadastrarLivro(Livro livro){
        if (livros.contains(livro)){
            System.out.println("Livro já faz parte do acervo!");
        }else{
            this.livros.add(livro);
            System.out.println("Livro cadastrado!");
        }
        
    }
   
    @Override
    public void excluirLivro(Livro livro){
        if (livros.contains(livro)){
            this.livros.remove(livro);
            System.out.println("Livro removido!");
        }else{
            System.out.println("Livro não encontrado, não é possível removê-lo");
        }
        
    }
 
    @Override
    public void visualizarLivro(){
        for (int i = 0; i < this.livros.size(); i++){
            System.out.println("Título: " + livros.get(i).getTitulo());
            System.out.println(" ");
            System.out.println("Descrição: " + livros.get(i).getDescricao());
            System.out.println(" ");
        }
    
    }
    public void cadastrarAluno(Aluno aluno){
        if (alunos.contains(aluno)){
            System.out.println("Não é possível efetuar o cadastro, aluno já cadastrado!");
        }else{
            this.alunos.add(aluno);
            System.out.println("Aluno cadastrado!");
        }
    }
    public void excluirAluno(Aluno aluno){
        if (alunos.contains(aluno)){
            this.alunos.remove(aluno);
            System.out.println("Aluno removido!");
        }else{
            System.out.println("Não há aluno cadastrado com essas informações, não é possível removê-lo");
        }
    }
}