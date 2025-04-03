import java.util.Scanner;
import java.util.Random;

public class exercicio_dois {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       //toLowerCase converte todos os caracteres de uma string para minúsculas
       System.out.print("Voce apostou em 'par' ou 'ímpar' ");
       String aposta =scanner.nextLine().toLowerCase();

       System.out.println("Digite o numero sorteado (1 a 36): ");
       int numeroSorteado = scanner.nextInt();

        if ((aposta.equals("par") && numeroSorteado % 2 == 0) ||
        (aposta.equals("impar") && numeroSorteado % 2 != 0)){
        System.out.println("Você ganhou a aposta!");
        }else{
            System.out.println("Você perdeu a aposta!");
        }
        scanner.close();
    }
}
