
import java.util.ArrayList;
import java.util.Scanner;


public class BancoSecomp {
     String nome;
    ArrayList<String> lista = new ArrayList(); // Inicialização de um array que 
    // chamado lista onde ficará armazenado os nomes das pessoas do evento.
    
    public String leitura(){ // Função de leitura.
        
        Scanner leitor = new Scanner(System.in);
        String pessoa = leitor.nextLine();
        return pessoa;
    }
    
    public void cadastro(String pessoa){
        
        int repete = 0; // Variável para verificar se um nome foi repetido ou 
        // não. Caso for 1, o nome é repetido, caso for 0 o nome serpa inserido
        // na lista.
        int tamanho = pessoa.length(); // Tamanho da lista em números.
        
         if (tamanho == 0){
                System.out.println("Digite o nome da pessoa");
                cadastro(leitura());
            } 
                
       for (int i = 0; i < lista.size(); i++) { // For para validar se um nome
           //é repetido ou não.
            if (lista.get(i).equals(pessoa) ) {
                System.out.println("\nNome repetido");
                return;
            }
        }
        lista.add(pessoa); // Adiciona a pessoa na lista do evento.
    }
    
    public void imprimirLista(){ // Função para impressão da lista de pessoas
        // do evento.
        
        for(String nome : lista){
            System.out.println(nome);
        }
    } 
}
