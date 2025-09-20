import static java.lang.IO.*;

void main() {

    boolean sair = false;
    String nome = readln("Digite o nome do pet: ");
    Pet meuPet = new Pet(nome, 5, 5);

    Alimento alimento1 = new Alimento("carne", 3, 2);
    Alimento alimento2 = new Alimento("batata frita", 1, 4);

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
            case "1" -> meuPet.alimentar();
            case "2" -> meuPet.brincar();
            case "3" -> meuPet.verStatus();
            case "4" -> sair = true;
            default -> println("opção inválida!");
        }
    }
}

