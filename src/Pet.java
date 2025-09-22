import static java.lang.IO.println;

public class Pet {
    String nome;
    Integer felicidade;
    Integer fome;

    Pet(String nome, Integer f1, Integer f2) {
        this.nome = nome;
        this.felicidade = f1;
        this.fome = f2;
    }

    void alimentar(Alimento comida) {
        this.fome = Math.max(0, this.fome - comida.valorNutricional);
        this.felicidade = Math.max(0, this.felicidade - comida.valorEnergia);
        println("O pet foi alimentado com sucesso!");
    }

    void brincar() {
        fome = Math.min(10, fome + 1);
        felicidade = Math.min(10, felicidade + 2);
        println("Você brincou com o pet!");
    }
    void verStatus() {
        println("""
            ******** status ********
            fome = %s
            felicidade = %s
            ************************
            """.formatted(fome, felicidade));
    }

}
