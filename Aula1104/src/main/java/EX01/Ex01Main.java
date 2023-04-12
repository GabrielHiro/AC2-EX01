// Nome: gabriel Hiro Furukawa
// Prof.: Edison Feitosa
// Curso: ADS 3°S
package EX01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01Main {

    public static void main(String[] args) {

        int iProf = 0;
        int iDisci = 0;
        
        
        ArrayList<Pessoa> P = new ArrayList<>();

        Disciplina dis = new Disciplina();
        Professor pro = new Professor();
        Atendente ate = new Atendente();
        Aluno alu = new Aluno();

        Scanner Inp = new Scanner(System.in);
        int a = 0;

        while (a == 0) {
            System.out.println(" | --- - -- -- --| Cadastro - Odin |- - -- - - - -|");
            System.out.println(" 1 - Inserir Disciplina");
            System.out.println(" 2 - Inserir Professor");
            System.out.println(" 3 - Inserir Atendente");
            System.out.println(" 4 - Inserir Aluno");
            System.out.println(" 5 - Adicionar Disciplina ao Professor");
            System.out.println(" 6 - Mostrar Pessoas");
            System.out.println(" 7 - Sair");
            System.out.print(" Digite Aqui: ");
            int F = Inp.nextInt();
            switch (F) {
                case 1 -> {
                    System.out.println("Codigo: ");
                    dis.setCodigo(Inp.nextInt());
                    System.out.println("Nome: ");
                    dis.setNome(Inp.next());
                    iDisci++;
                    System.out.println("Disciplina adicionada com sucesso!");
                }

                case 2 -> {
                    System.out.println("Nome: ");
                    pro.setNome(Inp.next());
                    System.out.println("CPF: ");
                    pro.setCpf(Inp.next());
                    System.out.println("Numero do Cracha: ");
                    pro.setNumeroCracha(Inp.nextInt());
                    System.out.println("Salario: ");
                    pro.setSalario(Inp.nextInt());
                    System.out.println("urlCurriculoLattes: ");
                    pro.setUrlCurriculoLattes(Inp.next());
                    iProf++;
                    P.add(pro);
                    System.out.println("Professor adicionado com sucesso!");
                }
                case 3 -> {
                    System.out.println("Nome: ");
                    ate.setNome(Inp.next());
                    System.out.println("CPF: ");
                    ate.setCpf(Inp.next());
                    System.out.println("Numero do Cracha: ");
                    ate.setNumeroCracha(Inp.nextInt());
                    System.out.println("Salario: ");
                    ate.setSalario(Inp.nextDouble());
                    System.out.println("Setor: ");
                    ate.setSetor(Inp.next());
                    System.out.println("Função: ");
                    ate.setFuncao(Inp.next());
                    P.add(ate);

                    System.out.println("Atendente adicionado com sucesso!");
                }
                case 4 -> {
                    System.out.println("Nome: ");
                    alu.setNome(Inp.next());
                    System.out.println("CPF: ");
                    alu.setCpf(Inp.next());
                    System.out.println("RA: ");
                    alu.setRa(Inp.next());
                    System.out.println("Curso: ");
                    alu.setCurso(Inp.next());
                    P.add(alu);

                    System.out.println("Aluno adicionado com sucesso!");
                }

                case 5 -> {
                    if (iProf == 0 || iDisci == 0) {
                        System.out.println("Não há professores ou disciplinas cadastrados.");
                    } else {
                        pro.addDisciplina(iDisci-1,dis);
                        System.out.println("Disciplina Adionado ao Professor.");
                    }
                }

                case 6 -> {
                    for (int i = 0; i < P.size(); i++) {
                        System.out.println(P.get(i));
                    }
                }
                case 7 -> {
                    System.out.println("Saindo...");
                    a = 1;
                }
                default -> {
                    System.out.println("ERRO - Você Digitou o numero invalido.");
                }

            }

        }

    }
}
