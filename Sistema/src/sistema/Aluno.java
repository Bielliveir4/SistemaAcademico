
package sistema;


public class Aluno {

    String nome;
    String curso;
    int anoIngresso;
    boolean ehFormado;
    long matricula;

    String verificaStatus() {
        if (ehFormado) {
            return "O aluno ainda não completou os créditos";
        }
        return "O aluno entrou no ano" + anoIngresso + "e se formou";
    }

    long obtemMatricula() {
        return matricula;
    }
}
