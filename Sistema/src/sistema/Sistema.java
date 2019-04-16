
package sistema;

import java.util.Scanner;


public class Sistema {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escolha [1] para professor e [2] para aluno:");
        int opcao = s.nextInt();
        s.nextLine();
        if (opcao == 1) {
            Professor p = new Professor();
            p.nome = NomeDoProfessor(p, s);
            p.siape = SIAPE(p, s);
            p.areas = AreasDoConhecimento(p, s);
           
            
           
            }
         else {
            Aluno a = new Aluno();
            a.nome = NomeDoAluno(a, s);
            a.curso = CursoDoAluno(a, s);
            a.matricula = MatriculaDoAluno(a,s);
            a.anoIngresso = AnoDeIngresso(a,s);
            a.ehFormado = false;
        }
     
        
    }
    
    //*Professor
    public static String NomeDoProfessor(Professor p, Scanner s) {
        System.out.println("Nome:");
         return p.nome = s.nextLine();
    }
    public static long SIAPE(Professor p, Scanner s) {
        System.out.println("SIAPE:");
        return p.siape = s.nextLong();
    }
    public static String[] AreasDoConhecimento(Professor p, Scanner s) {
        System.out.println("Quantas áreas?");
        int quantAreas = s.nextInt();
        p.areas = new String[quantAreas];
        System.out.println("Informe as áreas:");
            for (int i = 0; i < quantAreas; i++) {
                p.getAreas[i] = s.nextLine();}
        return p.areas;
        
    
    }
   //*Aluno
    public static String NomeDoAluno(Aluno a, Scanner s) {
            System.out.println("Nome:");
            return a.nome = s.nextLine();   
    }

    private static String CursoDoAluno(Aluno a, Scanner s) {
        System.out.println("Curso:");
        return a.curso = s.nextLine();
    }

    private static long MatriculaDoAluno(Aluno a, Scanner s) {
        System.out.println("Matricula:");
        return a.matricula = s.nextLong();
        
    }

    private static int AnoDeIngresso(Aluno a, Scanner s) {
          System.out.println("Ingresso:");
          return a.anoIngresso = s.nextInt();
    }

}

