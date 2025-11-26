public abstract class Contribuinte implements CalculadoraTributo {
    
    // Atributos privados
    private String nome;
    private String cpf;
    protected double salarioBruto; 
    
    // Construtor...
    public Contribuinte(String nome, String cpf, double salarioBruto) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBruto = salarioBruto;
    }
    
    // Métodos Comuns - ALTERAR AQUI
    public void exibirResumo() {
        System.out.println("--- Resumo do Contribuinte ---");
        // Use os getters aqui para mostrar que eles estão sendo utilizados:
        System.out.println("Nome: " + getNome()); // AGORA CHAMA O GETTER
        System.out.println("CPF: " + getCpf());   // AGORA CHAMA O GETTER
        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("INSS/Contribuição: R$ %.2f%n", calcularINSS());
        System.out.printf("IRPF: R$ %.2f%n", calcularIRPF());
        System.out.printf("** Salário Líquido: R$ %.2f **%n", calcularSalarioLiquido());
        System.out.println("-----------------------------");
    }
    
    // Getters e Setters (Mantidos como estavam)
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public double getSalarioBruto() { return salarioBruto; }
    public void setSalarioBruto(double salarioBruto) { this.salarioBruto = salarioBruto; }
}