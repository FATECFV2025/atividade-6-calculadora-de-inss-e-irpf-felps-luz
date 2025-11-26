public class FuncionarioCLT extends Contribuinte {

    public FuncionarioCLT(String nome, String cpf, double salarioBruto) {
        super(nome, cpf, salarioBruto);
    }

    @Override
    public double calcularINSS() {
        // Exemplo: 10% de INSS
        return salarioBruto * 0.10;
    }

    @Override
    public double calcularIRPF() {
        double salarioBase = salarioBruto - calcularINSS();
        // Exemplo: 15% de IRPF sobre o salário base, se for superior a R$ 2000
        if (salarioBase > 2000) {
            return salarioBase * 0.15;
        }
        return 0.0;
    }

    @Override
    public double calcularSalarioLiquido() {
        return salarioBruto - calcularINSS() - calcularIRPF();
    }
    
    @Override
    public void exibirResumo() {
        System.out.println("\nTipo: Funcionário CLT");
        super.exibirResumo();
    }
}