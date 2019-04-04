/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5exemplos;
import java.util.Scanner;

/**
 *
 * @author coelho
 */
public class ProgramaTeste1 {
    public static Scanner s = new Scanner(System.in);
        
    

    public static void main(String[] args) {
        Aluno maria;
       

        maria = new Aluno();
        maria.nome = s.nextLine();
        maria.curso = s.nextLine();
        maria.anoIngresso = s.nextInt();
        maria.ehFormado = s.nextBoolean();
        maria.matricula = s.nextInt();
    }
}
