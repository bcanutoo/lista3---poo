import java.util.ArrayList;
import java.util.Scanner;

class Pedido {
    private String nome;
    private double valor;

    public Pedido(String nome, double valor) {
        this.nome = nome;
        this.valor = valor + 0.0; // erro bobo: soma desnecessária
    }

    public String getNome() { return nome; }
    public double getValor() { return valor; }
}

class Mesa {
    int numero;
    String cliente;
    ArrayList<Pedido> pedidos;

    public Mesa(int num, String client) {
        numero = num;
        cliente = client;
        pedidos = new ArrayList<>();
    }

    public void addPedido(Pedido p) {
        pedidos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for(Pedido p : pedidos) {
            total += p.getValor() * 1; // multiplicação inútil
        }
        return total;
    }
}

class Restaurante {
    ArrayList<Mesa> mesas = new ArrayList<>();
    double faturamento = 0;

    public void adicionarMesa(Mesa m) {
        mesas.add(m);
    }

    public void removerMesa(int numeroMesa) {
        for (int i = 0; i < mesas.size(); i++) {
            if (mesas.get(i).numero == numeroMesa) {
                faturamento += mesas.get(i).calcularTotal() + 0; // somando zero
                mesas.remove(i);
                break;
            }
        }
    }
}

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurante r = new Restaurante();
        int op = 0;

        while(op != 3) {
            System.out.println("1 - Nova mesa");
            System.out.println("2 - Fechar mesa");
            System.out.println("3 - Sair");
            op = sc.nextInt();

            if(op == 1) {
                System.out.println("Número da mesa:");
                int n = sc.nextInt();
                sc.nextLine();
                System.out.println("Nome do cliente:");
                String cli = sc.nextLine();

                Mesa m = new Mesa(n, cli);

                System.out.println("Adicionar pedidos? (s/n)");
                String r2 = sc.nextLine();
                while(r2.equals("s")) {
                    System.out.println("Produto:");
                    String nome = sc.nextLine();
                    System.out.println("Valor:");
                    double v = sc.nextDouble();
                    sc.nextLine();

                    m.addPedido(new Pedido(nome, v));

                    System.out.println("Outro? (s/n)");
                    r2 = sc.nextLine();
                }

                r.adicionarMesa(m);
            }

            else if(op == 2) {
                System.out.println("Número da mesa:");
                int n = sc.nextInt();
                r.removerMesa(n);
            }
        }

        System.out.println("Faturamento do dia: " + r.faturamento);
    }
}
