// Nome: Gabriel Hiro Furukawa
// Prof.: Edison Feitosa
// Curso: ADS 3°S

package EX01;

public class Pessoa {

    private String nome;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String Nome, String Cpf){
        nome = Nome;
        cpf = Cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return " Nome: " + getNome() + " CPF: " + getCpf();
    }
    
}
