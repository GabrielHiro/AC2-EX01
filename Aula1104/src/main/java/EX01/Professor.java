package EX01;

import java.util.ArrayList;

public class Professor extends funcionario {

    private String urlCurriculoLattes;

    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Professor() {
    }

    public Professor(String Nome, String cpf, String urlCurriculoLattes) {
        setNome(Nome);
        setCpf(cpf);
        this.urlCurriculoLattes = urlCurriculoLattes;
    }

    public void addDisciplina(Disciplina disciplinal) {
        disciplinas.add(disciplinal);
    }

    public String getUrlCurriculoLattes() {
        return urlCurriculoLattes;
    }

    public void setUrlCurriculoLattes(String urlCurriculoLattes) {
        this.urlCurriculoLattes = urlCurriculoLattes;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public Disciplina getDisciplinas(int index){
        return disciplinas.get(index);
    }

    //Não esta sendo usado
    public void removeDisciplina(int index) {
        disciplinas.remove(index);
    }

    public void removeDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }
    //talvez faltou o uso deles

    @Override
    public String toString() {
        return "Professor{" + " Nome: " + getNome() + " CPF: " + getCpf() + " numeroCracha= " + getNumeroCracha() + " salario= " + getSalario() + " urlCurriculoLattes= " + urlCurriculoLattes + ", disciplina= " + disciplinas + '}';
    }
}
