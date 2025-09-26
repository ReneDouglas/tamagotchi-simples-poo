import static java.lang.IO.*;

void main() {

    boolean sair = false;
    String nome = readln("Digite o nome do pet: ");
    Pet meuPet = new Pet(nome, 5, 5);

    Alimento alimento1 = new Alimento("Chocolate", 1, 0); // nome do alimento, valor nutricional, gosto ruim
    Alimento alimento2 = new Alimento("Fruta", 2, 3);
    Alimento alimento3 = new Alimento("Carne", 5, 0);

    Alimento[] alimentos = {alimento1, alimento2, alimento3};

    while(!sair) {
        println("""
                =================================
                =========== BEM VINDO ===========
                =================================
                NOME DO PET: %s
                *********************************
                """.formatted(nome));
        String opcao = readln("""
                [1] - Alimentar
                [2] - Brincar
                [3] - Ver Status
                [4] - Sair
                Digite a sua opção:
                """);
        switch(opcao) {
          case "1" :  

            Alimento comida = new Alimento("", 0, 0).retornarAlimento(alimentos);
            while (comida == null) {
              comida = new Alimento("", 0, 0).retornarAlimento(alimentos);
            }

            meuPet.alimentar(comida);

            break;

          case "2" : meuPet.brincar(); break;
          case "3" : meuPet.verStatus(); break;
          case "4" : sair = true; break;
          default : println("opção inválida!");
        }
    }
}

