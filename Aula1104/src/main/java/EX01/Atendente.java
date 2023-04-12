
package EX01;

public class Atendente extends funcionario{
    private String setor;
    private String funcao;
    
    public Atendente(){}
    
    public Atendente(String Nome, String cpf, String Setor, String funcao){
        setNome(Nome);
        setCpf(cpf);
        setor = Setor;
        this.funcao = funcao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Atendente{" + " Nome: "+ getNome() + " CPF: " + getCpf() + " setor= " + setor + " funcao= " + funcao + "}";
    }
    
    
}
