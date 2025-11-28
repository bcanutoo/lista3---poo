interface Pagamento {
    void processar(double valor);
}

class PagamentoCartaoCredito implements Pagamento {
    public void processar(double valor) {
        System.out.println("Processando no crédito: R$" + valor + "...");
    }
}

class PagamentoBoleto implements Pagamento {
    public void processar(double valor) {
        System.out.println("Gerando boleto no valor de R$" + valor);
    }
}

class PrincipalPagamento {
    public static void main(String[] args) {
        ArrayList<Pagamento> lista = new ArrayList<>();

        lista.add(new PagamentoCartaoCredito());
        lista.add(new PagamentoBoleto());
        lista.add(new PagamentoCartaoCredito());

        double[] valores = {100.0, 250.5, 79.90};

        for(int i=0;i<lista.size();i++){
            lista.get(i).processar(valores[i]);
        }
    }
}
