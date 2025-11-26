public class PrestadorServico extends Contribuinte {
    
    private static final double ALIQUOTA_ISS_PJ = 0.05; 

    public PrestadorServico(String nome, String cpf, double salarioBruto) {
        super(nome, cpf, salarioBruto);
    }

    @Override
    public double calcularINSS() {
        // Prestador de Serviço (PJ) não tem desconto direto de INSS (pagamento autônomo)
        return 0.0;
    }

    @Override
    public double calcularIRPF() {
        // Exemplo: IRPF/Outros tributos retidos de 20%
        return salarioBruto * 0.20;
    }

    @Override
    public double calcularSalarioLiquido() {
        // Inclui imposto de serviço simulado de 5%
        double impostoServico = salarioBruto * ALIQUOTA_ISS_PJ;
        return salarioBruto - calcularINSS() - calcularIRPF() - impostoServico;
    }
    
    @Override
    public void exibirResumo() {
        System.out.println("\nTipo: Prestador de Serviço (PJ)");
        super.exibirResumo();
    }
}