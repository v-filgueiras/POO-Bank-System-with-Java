package SistemaBancarioSimples;

public class TesteBanco {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("Victor Santana", "123.456.789-00", "Rua das Palmeiras, 100");
        Cliente cliente2 = new Cliente("Ana Souza", "987.654.321-00", "Avenida Brasil, 200");

        // Criando contas bancárias
        ContaBancaria conta1 = new ContaBancaria("001", 1000.0, cliente1);
        ContaBancaria conta2 = new ContaBancaria("002", 500.0, cliente2);

        // Exibindo informações iniciais
        System.out.println("=== Informações Iniciais ===");
        conta1.exibirInformacoes();
        conta2.exibirInformacoes();

        // Realizando operações
        System.out.println("\n=== Operações ===");
        System.out.println("Victor deposita R$500,00 na própria conta.");
        conta1.depositar(500);

        System.out.println("Ana saca R$100,00 da conta.");
        conta2.sacar(100);

        System.out.println("Victor transfere R$700,00 para Ana.");
        conta1.transferir(conta2, 700);

        // Exibindo informações após operações
        System.out.println("\n=== Informações Após Operações ===");
        conta1.exibirInformacoes();
        conta2.exibirInformacoes();

        // Testando exceções
        System.out.println("\n=== Teste de Erros ===");
        try {
            conta1.sacar(10000); // saldo insuficiente
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        try {
            conta2.depositar(-50); // valor inválido
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao depositar: " + e.getMessage());
        }
    }
}
