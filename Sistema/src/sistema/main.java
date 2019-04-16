package sistema;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import sistema.Aluno;
import sistema.Professor;
import sistema.SetorEnsino;

public class main {
    BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
 
    public static void main(String[] args) throws IOException {
       Aluno[] alunos = new Aluno[1000];
       Professor[] professores = new Professor[60];
        int escolha = verificaIdentidade();
        switch (escolha) {
                case 1:
                    menu_alunos();
                    
                case 2:
                    menu_professor();
                   
                case 3:
                    menu_ensino();
                case 4:
                    break;
            }
        
        System.out.println("");
        
    }

    private static int verificaIdentidade() throws IOException {
        System.out.println("Qual sua Função dentro do IF?");
        System.out.println("MENU 1: \n [1] Aluno \n [2] Professor \n [3] Setor de Ensino \n [4] Sair");
        int ID = s.readLine();
        return ID;
    }

    private static void menu_alunos() {
        System.out.println("MENU 2: \n [1] Ver Cursos \n [2] Ver notas \n [3]Voltar ao Main");
        int oqacessar = s.readLine();  
        do{
            switch (oqacessar) {
                case 1:
                    verCursos();
                   
                    
                case 2:
                    verNotas();
                   
            }
        } while (oqacessar >=1 && oqacessar < 3 && oqacessar != 3);
        
          }

    private static void menu_professor() {
        System.out.println("MENU 2: \n [1]Dar Notas de uma disciplina \n [2]Alterar uma nota \n [3]Adicionar Área \n [4]Remover Área [5]Voltar ao Main");
        int oqacessar = s.readLine();
        do{
            switch (oqacessar) {
                case 1:
                    DarNotas();
                   
                   
                case 2:
                    AterarNotas();
                   
                    
                case 3:
                    NovaArea();
                    
               case 4:
                   RemoverArea();
               
               case 5:
                   break;
            }
        } while (oqacessar >=1 && oqacessar < 5 && oqacessar != 5);
    }
    

    private static void menu_ensino() {
        System.out.println("MENU 2: \n [1] Cadastrar Aluno \n [2] Cadastrar Curso \n [3] Adicionar Disciplina ao Curso \n [4] Cadastrar Professor \n [5]Voltar ao Main");
        int oqacessar = s.readLine();
        do{
            switch (oqacessar) {
                case 1:
                    cadastrarAluno();
                    
                case 2:
                    cadastrarCurso();

                case 3:
                    nova_DisciplinaAOCurso();

               case 4:
                   novoProfessor();
                   
               case 5:
                   break;
            }
        } while (oqacessar >=1 && oqacessar < 5 && oqacessar != 5);
        }

    private static void verCursos() {
        SetorEnsino.verCursos();
        
    }

    private static void verNotas() {
          }

    private static void DarNotas() {
          }

    private static void AterarNotas() {
           }

    private static void NovaArea() {
          }

    private static void RemoverArea() {
          }

    private static void novoProfessor() {
          }

    private static void nova_DisciplinaAOCurso() {
         }

    private static void cadastrarCurso() {
        }

    private static void cadastrarAluno() {
          }
        
    }

    
    
    

