
package model;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;



public class Aluno extends Bibliotecaria{ 
    
    private String nome;
    private String matricula;
    private String curso;
    private String cpf;
    private String telefone;
    private String nascimento;
    private ArrayList<Livro> livrosE;
    
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

    
    public ArrayList<Livro> getLivrosE() {
        return livrosE;
    }

    public void setLivrosE(ArrayList<Livro> livrosE) {
        this.livrosE = livrosE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    public Aluno(){
        livrosE = new ArrayList();
    }
    
    public void visualizarLivrosDisponiveis(){
        for (int i = 0; i < this.livros.size(); i++){
            System.out.println("Título: " + livros.get(i).getTitulo());
            System.out.println(" ");
            System.out.println("Descrição: " + livros.get(i).getDescricao());
            System.out.println(" ");
        }

    }
    public void solicitarEmprestimo(Livro livro){
        if (livrosE.size() == 4) {
            System.out.println("Não é possível socilitar empréstimo.");
        }else{
            livrosE.add(livro);
            Date dataEmprestimo = new Date();
            dataEmprestimo.getTime();
            System.out.println("Livro emprestado com sucesso em "+ formatador.format(dataEmprestimo) + ".");
            
            
        }
    }
    public void devolverLivro(Livro livro){
        livrosE.remove(livro);
        System.out.println("Livro devolvido!");
        
    }
    public void renovarEmprestimo(){
        
    }
   
    public void pesquisarLivro(String string){
        if (livros.contains(string) ){
            System.out.println(string);
        }else{
            
        }      
        
        
    }
    public void livrosEmprestados(){
        for (int i = 0; i < this.livrosE.size(); i++ ){
            System.out.println(livrosE.get(i).getTitulo());
            System.out.println(" ");
            System.out.println(livrosE.get(i).getDescricao());
            System.out.println(" ");
        }
    }
}
