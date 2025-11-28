class Funcionario {
    protected String nome;
    protected double salario;

    public double valorInss() {
        return salario * 0.11;
    }
}

class Gerente extends Funcionario {
    private String setor;

    @Override
    public String toString() {
        return "Gerente: " + nome + " - Setor: " + setor + " - Sal: " + salario;
    }
}

class Vendedor extends Funcionario {
    private double comissao;

    @Override
    public String toString() {
        return "Vendedor: " + nome + " / Comissão: " + comissao;
    }
}

public class Teste {
    public static void main(String args[]) {
        Gerente g = new Gerente();
        g.nome = "Carlos";
        g.salario = 5000;

        Vendedor v = new Vendedor();
        v.nome = "Bruna";
        v.salario = 3000;

        System.out.println(g.toString());
        System.out.println(v.toString());
        System.out.println("INSS Gerente: " + g.valorInss());
    }
}
