import java.util.Scanner;

public class AppFolhaPagamento {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Cálculo de Folha de Pagamento ===");

        // 1. Solicitar dados do usuário
        System.out.print("Digite o Nome do Contribuinte: ");
        String nome = Scanner.nextLine();

        System.out.print("Digite o CPF do Contribuinte: ");
        String cpf = Scanner.nextLine();

        System.out.print("Digite o Salário Bruto: R$ ");
        double salarioBruto = Scanner.nextDouble();

        System.out.println("\n--- Seleção do Tipo de Contribuinte ---");
        System.out.println("1 = Funcionário CLT");
        System.out.println("2 = Estagiário");
        System.out.println("3 = Prestador de Serviço");
        System.out.print("Escolha o tipo (1/2/3): ");
        int tipoContribuinte = Scanner.nextInt();
        
        // Variável de referência do tipo Superclasse/Interface (DEMONSTRAÇÃO DO POLIMORFISMO)
        // A referência 'refContribuinte' será do tipo Contribuinte, 
        // mas o objeto real será uma das subclasses.
        Contribuinte refContribuinte = null;

        // 2. Instanciar dinamicamente o objeto correto
        switch (tipoContribuinte) {
            case 1:
                refContribuinte = new FuncionarioCLT(nome, cpf, salarioBruto);
                break;
            case 2:
                refContribuinte = new Estagiario(nome, cpf, salarioBruto);
                break;
            case 3:
                refContribuinte = new PrestadorServico(nome, cpf, salarioBruto);
                break;
            default:
                System.err.println("Tipo de contribuinte inválido. Saindo do sistema.");
                Scanner.close();
                return;
        }

        System.out.println("\n--- Execução Polimórfica dos Cálculos ---");
        
        // 3. Chamar o método comum e ver a execução especializada
        // O método correto (da subclasse) é chamado automaticamente.
        if (refContribuinte != null) {
            refContribuinte.exibirResumo(); 
        }
        
        Scanner.close();
    }
}