interface Veiculo {
    void acelerar();
    void frear();
}

interface Eletrico {
    void carregarBateria(int porcentagem);
}

class CarroCombustao implements Veiculo {
    public void acelerar() {
        System.out.println("carro a combustão acelerando...");
    }

    public void frear() {
        System.out.println("carro a combustão freando...");
    }
}

class CarroEletrico implements Veiculo, Eletrico {
    public void acelerar() {
        System.out.println("carro elétrico acelerando silenciosamente...");
    }

    public void frear() {
        System.out.println("carro elétrico freando com regeneração...");
    }

    public void carregarBateria(int porcentagem) {
        System.out.println("carregando " + porcentagem + "% da bateria");
    }
}

class PrincipalCarros {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new CarroCombustao());
        veiculos.add(new CarroEletrico());
        veiculos.add(new CarroCombustao());

        for(Veiculo v : veiculos){
            v.acelerar();
            v.frear();

            if(v instanceof CarroEletrico) {
                ((Eletrico)v).carregarBateria(50);
            }
        }
    }
}
