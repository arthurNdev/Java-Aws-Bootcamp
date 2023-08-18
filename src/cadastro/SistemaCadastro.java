package cadastro;

import cadastro.Pessoa;

public class SistemaCadastro {

    public static void main(String[] args) {

        // Criar uma pessoa no sistema
        Pessoa marcos = new Pessoa("123", "MARCOS");

        // Definir o endereço
        marcos.setEndereco("RUA MARECHAL");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
