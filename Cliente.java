package SistemaBancarioSimples;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(String nome, String cpf, String endereco) {
        setNome(nome);
        setCpf(cpf);
        setEndereco(endereco);
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

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome do cliente não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            throw new IllegalArgumentException("O CPF do cliente não pode ser nulo ou vazio.");
        }
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        if (endereco == null || endereco.isEmpty()) {
            throw new IllegalArgumentException("O endereço do cliente não pode ser nulo ou vazio.");
        }
        this.endereco = endereco;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
    }
}
