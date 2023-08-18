package escola;

public class Escola {

    public static void main(String[] args) {

        Aluno arthur = new Aluno();

        arthur.setNome("Arthur");
        arthur.setIdade(19);

        System.out.println("O aluno " + arthur.getNome() + " tem "
                + arthur.getIdade() + " anos");
    }
}
