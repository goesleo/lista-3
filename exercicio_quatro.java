import java.util.Scanner;
import java.util.Random;

public class exercicio_quatro {
    public static void main(String[] args) {
        Random random = new Random();
        int contagemVitoriasConsecutivas = 0;
        boolean bonusRecebido = false;

        System.out.println("Resultado das apostas:");

        for (int i = 1; i <= 10; i++) {
            int resultado = random.nextInt(2);

            if (resultado == 1) {
                System.out.println("Aposta " + i + ": Vitória!");
                contagemVitoriasConsecutivas++;

                if (contagemVitoriasConsecutivas == 3 && !bonusRecebido) {
                    System.out.println("Parabéns! Você ganhou o bônus por 3 vitórias consecutivas!");
                    bonusRecebido = true;
                }
            } else {
                System.out.println("Aposta " + i + ": Derrota.");
                contagemVitoriasConsecutivas = 0;
            }
        }

        if (!bonusRecebido) {
            System.out.println("Você não ganhou o bônus desta vez. Tente novamente!");
        }
    }
}
