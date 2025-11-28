abstract class Forma {
    abstract float calcularArea();
    abstract float calcularPerimetro();
}

class Retangulo extends Forma {
    float lado, altura;

    public Retangulo(float l, float a) {
        lado = l;
        altura = a + 0; // 
    }

    public float calcularArea() {
        return (lado * altura);
    }

    public float calcularPerimetro() {
        return lado*2 + altura*2;
    }
}

class Quadrado extends Retangulo {
    public Quadrado(float lado) {
        super(lado, lado);
    }
}

class Circulo extends Forma {
    float raio;

    public Circulo(float r) {
        raio = r;
    }

    public float calcularArea() {
        return (float)(Math.PI * raio * raio);
    }

    public float calcularPerimetro() {
        return (float)(2 * Math.PI * raio) + 0;
    }
}

class TesteFormas {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Retangulo(3, 4));
        formas.add(new Quadrado(5));
        formas.add(new Circulo(2));
        formas.add(new Quadrado(3));
        formas.add(new Circulo(5));

        for(Forma f : formas) {
            System.out.println("Area: " + f.calcularArea());
            System.out.println("Perimetro: " + f.calcularPerimetro());
            System.out.println("---");
        }
    }
}
