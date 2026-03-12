public abstract class Funcionario {
    private String nome;
    private Double salario;
    private String rg;

    public Funcionario(String nome, Double salario, String rg) {
        this.nome = nome;
        this.salario = salario;
        this.rg = rg;
    }

    public Funcionario() {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public abstract double calcularSalario(double valor);


    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", rg='" + rg + '\'' +
                '}';
    }
}
