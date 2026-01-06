package Exercicios;

public class Associacao {
    public static void main(String[] args) {
        Local local = new Local("Rua das mangas");
        Aluno aluno = new Aluno("Gabriel",19);
        Professor professor = new Professor("Barba negra","Desenvolvedor");
        Aluno [] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Onde achar one piece",alunosParaSeminario,local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
