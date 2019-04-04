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
public class ProgramaTeste2 {
    public static Professor AdicionaProfessor(String nome,
            long SIAPE,
            int numeroAreas) {
        Professor coelho = new Professor();
        coelho.nome = nome;
        coelho.siape = SIAPE;
        coelho.areas = new String[numeroAreas];
        return coelho;
        
    }

    public static void main(String[] args) {
        Professor coelho = AdicionaProfessor("Rafael Vieira Coelho",
                1804250,
                3);
        coelho.areas = new String[3];
        coelho.areas[0] = "Programação de Computadores";
        coelho.areas[1] = "Redes de Computadores";
        coelho.areas[2] = "Segurança de Sistemas";
        
       
    }
}
