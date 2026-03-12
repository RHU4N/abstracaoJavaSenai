public class Engenheiro extends Funcionario {
    private String crea;

    public Engenheiro() {}

    @Override
    public double calcularSalario(double valor) {
        return valor - (valor * 0.27);
    }


    public Engenheiro(String nome, Double salario, String rg, String crea) {
        super(nome, salario, rg);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "Engenheiro{" +
                "crea='" + crea + '\'' +
                '}';
    }
}
