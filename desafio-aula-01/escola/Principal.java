
package escola;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "Heloisa Costa";
        aluno.matricula = "00221133";
        aluno.endereco = "Rua das rosas";
        aluno.telefone = "00-0000-0000";
        aluno.email = "helo@seudominio.com";

        System.out.println("Nome: " + aluno.nome + " Matrícula: " + aluno.matricula + " Endereço: " +
                aluno.endereco + " Telefone: " + aluno.telefone + " E-mail: " + aluno.email);

    }

}
