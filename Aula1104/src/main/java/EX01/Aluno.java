
package EX01;

public class Aluno extends Pessoa{
    private String ra;
    private String curso;
    
    public Aluno(){
    
    }
    
    public Aluno(String nome, String cpf, String ra, String curso){
        setNome(nome);
        setCpf(cpf);
        
        this.ra = ra;
        this.curso = curso;
        
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "Nome: "+ getNome()+ "CPF: " + getCpf() + " ra= " + ra + " curso=" + curso + '}';
    }
    
}
