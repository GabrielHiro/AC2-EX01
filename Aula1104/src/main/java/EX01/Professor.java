package EX01;

import java.util.ArrayList;

public class Professor extends funcionario {

    private String urlCurriculoLattes;

    private ArrayList<Disciplina> disciplinas;

    public Professor() {
        this.disciplinas = new ArrayList<>();
    }

    public Professor(String Nome, String cpf, String urlCurriculoLattes) {
        this.disciplinas = new ArrayList<>();
        setNome(Nome);
        setCpf(cpf);
        this.urlCurriculoLattes = urlCurriculoLattes;
    }

    public void addDisciplina(int i,Disciplina disciplinal) {
         disciplinas.add(i,disciplinal);
    }

    public String getUrlCurriculoLattes() {
        return urlCurriculoLattes;
    }

    public void setUrlCurriculoLattes(String urlCurriculoLattes) {
        this.urlCurriculoLattes = urlCurriculoLattes;
    }


    //Não esta sendo usado
    public void removeDisciplina(int index) {
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
