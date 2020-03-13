
import java.util.Scanner;


public class Main {


  private static BancoSecomp banco;

  public static void main(String[] args) {
    banco = new BancoSecomp();
      /*
        1 - encapsular
        2 - organizar estrutura
         */
    //BancoSecomp banco = new BancoSecomp(); // Instanciação da classe Banco |
    //Secomp
    // colocando o menu dentro de um método para organização, legibilidade e acesso
    /*
     1 - utilizar mais métodos
     */
    menu();
  }

  private static void menu() {
    String x = new String(); // Variável para armazenar leitura da opção no
    // menu.
    /*
      1 - melhor utilização das bibliotecas (da forma que estava, o scanner era realocado a toda iteração
     */
    Scanner leitor = new Scanner(System.in);
    while (true) {

      System.out.println("1 - Incluir um nome");
      System.out.println("2 - Listar nomes\n");
//      Scanner leitor = new Scanner(System.in);
      x = leitor.nextLine();

      switch (x) {
        case "1":
          String nome;
          nome = banco.leitura();
          banco.cadastro(nome);
          break;

        case "2":
          banco.imprimirLista();
          break;

        default:
          System.out.println("Valor inválido");
          break;
      }
      leitor.close();
    }
  }
}
