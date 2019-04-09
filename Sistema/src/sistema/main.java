package sistema;

import sistema.Aluno;
import sistema.Professor;
import sistema.SetorEnsino;

 
import java.util.Scanner;

public class main {
    public static Scanner s = new Scanner (System.in);
 
    public static void main(String[] args) {
       
        int escolha = verificaIdentidade();
        switch (escolha) {
                case 1:
                    menu_alunos();
                    break;
                case 2:
                    menu_professor();
                    break;
                case 3:
                    menu_ensino();
            }
        
        System.out.println("");
        
    }

    private static int verificaIdentidade() {
        System.out.println("Qual sua Função dentro do IF?");
        System.out.println("\"MENU 1: \\n [1] Aluno \\n [2] Professor \\n [3] Setor de Ensino \\n [4] Sair\"");
        int ID = s.nextInt();
        return ID;
    }

    private static void menu_alunos() {
        System.out.println("MENU 2: \n [1] Ver Cursos [2] Ver notas [3]Voltar ao Main");
        int oqacessar = s.nextInt();  
        do{
            switch (oqacessar) {
                case 1:
                   ;
                    
                case 2:
                   ;
            }
        } while (oqacessar >=1 && oqacessar < 3 && oqacessar != 3);
        
          }

    private static void menu_professor() {
        System.out.println("MENU 2: \n [1]Dar Notas de uma disciplina \n [2]Alterar uma nota \n [3]Adicionar Área \n [4]Remover Área [5]Voltar ao Main");
        int oqacessar = s.nextInt();
        do{
            switch (oqacessar) {
                case 1:
                   ;
                   
                case 2:
                   ;
                    
                case 3:
                    ;
               case 4:
                    ;
            }
        } while (oqacessar >=1 && oqacessar < 5 && oqacessar != 5);
    }
    

    private static void menu_ensino() {
        System.out.println("MENU 2: \n [1] Cadastrar Aluno [2] Cadastrar Curso [3] Adicionar Disciplina ao Curso [4] Cadastrar Professor [5]Voltar ao Main");
        int oqacessar = s.nextInt();
        do{
            switch (oqacessar) {
                case 1:
                   ;
                    
                case 2:
                   ;
                   
                case 3:
                    ;
               case 4:
                    ;
            }
        } while (oqacessar >=1 && oqacessar < 5 && oqacessar != 5);
        }
        
    }

    
    
    

