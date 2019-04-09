
package sistema;



public class Curso {

    private String nome;
    private String ppc;
    private Disciplina disciplinas[];

    public boolean novaDisciplina(String nome, int ano, String professor) {
        for (int i = 0; i < getDisciplinas().length; i++) {
            if (getDisciplinas()[i] != null) {
                getDisciplinas()[i] = new Disciplina(professor, nome, ano);
                return true;
            }
        }
        return false;
    }

    public boolean removerDisciplina(String nome) {
        for (int i = 0; i < getDisciplinas().length; i++) {
            if (getDisciplinas()[i] != null && getDisciplinas()[i].getNome().equals(nome)) {
                getDisciplinas()[i] = null;
                return true;
            }
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPpc() {
        return ppc;
    }

    public void setPpc(String ppc) {
        this.ppc = ppc;
    }

    public sistema.Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
       this.setDisciplinas(disciplinas);
  }

    public Curso(String nome, String ppc, sistema.Disciplina[] disciplinas) {
        this.nome = nome;
        this.ppc = ppc;
        this.disciplinas = disciplinas;
    }

    public Curso(String nome, String ppc) {
        this.nome = nome;
        this.ppc = ppc;
    }

    
}
