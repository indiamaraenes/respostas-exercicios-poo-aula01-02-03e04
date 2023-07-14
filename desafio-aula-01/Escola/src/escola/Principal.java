package escola;

public class Principal {

    public static void main(String[] args) {
        // Cria uma lista de alunos
        List<Aluno> alunos = new ArrayList<Aluno>();

        // Adiciona um aluno à lista
        Aluno aluno = new Aluno();
        aluno.nome = "Jorge Campos";
        aluno.matricula = "00221133";
        aluno.endereco = "Rua das rosas";
        aluno.telefone = "00-0000-0000";
        aluno.email = "fulano@dominio.com";
        alunos.add(aluno);

        // Imprime os dados dos alunos
        for (Aluno a : alunos) {
            System.out.println("Nome: " + a.nome + " Matrícula: " + a.matricula + " Endereço: " + a.endereco + " Telefone: " + a.telefone + " E-mail: " + a.email);
        }
    }
}