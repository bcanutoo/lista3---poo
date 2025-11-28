abstract class Animal {
    String nome;

    public abstract void fazerSom();

    public void correr() {
        System.out.println(nome + " correu!");
    }
}

class Cachorro extends Animal {
    public void fazerSom() {
        System.out.println("Au au");
    }
}

class Gato extends Animal {
    public void fazerSom() {
        System.out.println("Miau");
    }
}

class Cavalo extends Animal {
    public void fazerSom() {
        System.out.println("Iiirrrrí");
    }
}

class Veterinario {
    public void examinar(Animal a) {
        System.out.println("Examinando: ");
        a.fazerSom();
    }
}

class Zoologico {
    Animal[] jaulas = new Animal[10];
}

class TesteAnimais {
    public static void main(String[] args) {
        Animal a1 = new Cachorro();
        Animal a2 = new Gato();
        Animal a3 = new Cavalo();

        a1.fazerSom();
        a2.fazerSom();
        a3.fazerSom();

        Veterinario v = new Veterinario();
        v.examinar(a1);
        v.examinar(a2);
        v.examinar(a3);

        Zoologico zoo = new Zoologico();
        zoo.jaulas[0] = a1;
        zoo.jaulas[1] = a2;
        zoo.jaulas[2] = a3;

        for(int i=0;i<3;i++){
            zoo.jaulas[i].fazerSom();
            if(!(zoo.jaulas[i] instanceof Gato)) {
                zoo.jaulas[i].correr();
            }
        }
    }
}
