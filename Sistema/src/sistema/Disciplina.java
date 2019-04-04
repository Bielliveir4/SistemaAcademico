
package aula5exemplos;

public class Disciplina {
String nome;
Aluno alunos[];
Professor professor;
int ano;
float notas[];

boolean removerAluno(String nome) {
    for ( int i = 0; i < alunos.length; i++) {
        if (alunos[i] != null && alunos[i].nome.equals(nome)) {
            alunos[i] = null;
            return true;
}
}
    return false;
}
boolean alterarNota(float nota, String nome) {
return registrarNota(nota, nome);
} 
boolean registrarNota(float nota, String nome) {
    for ( int i = 0; i < notas.length; i++) {
        if (alunos[i] !=null && alunos[i].nome.equals(nome)) {
            notas[i] = nota;
            return true;
            }
        }
return false;
}
}
    
  
    

