package cadastro;

public class Pessoa {

    private final String nome;
    private final String cpf;
    private String endereco;

    public Pessoa (String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
