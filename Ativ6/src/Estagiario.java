public class Estagiario extends Contribuinte {

    public Estagiario(String nome, String cpf, double salarioBruto) {
        super(nome, cpf, salarioBruto);
    }

    @Override
    public double calcularINSS() {
        // Estagiário geralmente não tem desconto de INSS
        return 0.0;
    }

    @Override
    public double calcularIRPF() {
        // Estagiário geralmente é isento de IRPF
        return 0.0;
    }

    @Override
    public double calcularSalarioLiquido() {
        // Salário líquido é igual ao bruto (sem descontos)
        return salarioBruto;
    }
    
    @Override
    public void exibirResumo() {
        System.out.println("\nTipo: Estagiário");
        super.exibirResumo();
    }
}
