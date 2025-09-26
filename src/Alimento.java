public class Alimento {
    String nome;
    Integer valorNutricional;
    Integer valorEnergia;

    Alimento(String nome, Integer valorNutricional, Integer valorEnergia) {
        this.nome = nome;
        this.valorNutricional = valorNutricional;
        this.valorEnergia = valorEnergia;
    }

    // ------- método para selecionar alimento -------- //

    Alimento retornarAlimento(Alimento[] alimentos){

    System.out.printf("**********************\n");
    for(int i = 0; i < alimentos.length; i++){
      System.out.printf("  %3d.  %5s      \n", i+1, alimentos[i].nome);
    }
    System.out.printf("**********************\n");

    String opt = "0";

    System.out.print("");
    opt = IO.readln();
    int optInt = 0;

    try {
      optInt = Integer.parseInt(opt);
    } catch (Exception e) {
      System.out.printf("***************************\n");
      System.out.printf(" Insira uma comida válida\n");
      System.out.printf("***************************\n");


      return null;
    }

    try {
      return alimentos[optInt - 1];
    } catch (Exception e) {
      System.out.printf("***************************\n");
      System.out.printf(" Insira uma comida válida\n");
      System.out.printf("***************************\n");
    }

    return null;

  }

}
