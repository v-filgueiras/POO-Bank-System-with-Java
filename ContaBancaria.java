package SistemaBancarioSimples;

public class ContaBancaria {
    private String numeroConta;
    private double saldoConta;
    private Cliente cliente;

    public ContaBancaria(String numeroConta, double saldoConta, Cliente cliente) {
        setNumeroConta(numeroConta);
        setSaldoConta(saldoConta);
        setCliente(cliente);
    }

    public void setNumeroConta(String numeroDaConta) {
        if (numeroDaConta == null || numeroDaConta.isEmpty()) {
            throw new IllegalArgumentException("O número da conta não deve ser nulo ou vazio.");
        }
        this.numeroConta = numeroDaConta;
    }

    public void setSaldoConta(double saldoDaConta) {
        if (saldoDaConta < 0) {
            throw new IllegalArgumentException("O saldo não pode ser negativo.");
        }
        this.saldoConta = saldoDaConta;
    }

    public void setCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("O cliente não pode ser nulo.");
        }
        this.cliente = cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero.");
        }
        this.saldoConta += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero.");
        }
        if (valor > saldoConta) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        this.saldoConta -= valor;
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (destino == null) {
            throw new IllegalArgumentException("Conta de destino não pode ser nula.");
        }
        this.sacar(valor);
        destino.depositar(valor);
    }

    public void exibirInformacoes() {
        System.out.println("==== Dados da Conta ====");
        cliente.exibirInformacoes();
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Saldo da Conta: " + this.saldoConta);
        System.out.println("========================");
    }
}
