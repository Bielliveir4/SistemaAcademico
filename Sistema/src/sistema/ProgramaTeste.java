/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5exemplos;

/**
 *
 * @author coelho
 */
public class ProgramaTeste {

    public static void main(String[] args) {
        Aluno jorge = AdicionaAluno("Jorge Adão de Albuquerque",
                "Técnico em Informática Integrado ao Ensino Médio",
                2019, 
                false,
                28348745);

        
    }
    public static Aluno AdicionaAluno(String nome, String curso, int anoIngresso, boolean ehFormado, long matricula) {
     Aluno jorge = new Aluno();
     jorge.nome = nome;
     jorge.curso = curso;
     jorge.anoIngresso = anoIngresso;
     jorge.ehFormado = ehFormado;
     jorge.matricula = matricula;
     return jorge;
     
     
    }
}
