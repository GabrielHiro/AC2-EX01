// Nome: gabriel Hiro Furukawa
// Prof.: Edison Feitosa
// Curso: ADS 3°S
package EX01;

public class funcionario extends Pessoa {

    private int numeroCracha;
    private double salario;

    public funcionario() {
    }

    public funcionario(String Nome, String Cpf, int NumeroCracha, double Salario) {
        setNome(Nome);
        setCpf(Cpf);
        numeroCracha = NumeroCracha;
        salario = Salario;
    }

    public int getNumeroCracha() {
        return numeroCracha;
    }

    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "funcionario{ "+ " Nome: "+ getNome()+ " CPF: + " + getCpf()  + " numeroCracha= " + numeroCracha + ", salario= " + salario + " }";
    }
    
}
