import java.util.Scanner;
import java.util.Random;

public class exercicio_tres {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Cartas sorteadas:");

        for (int i = 0; i < 5; i++) {
            int carta = random.nextInt(13) + 1;

            switch (carta) {
                case 1:
                    System.out.println("Ás");
                    break;
                case 11:
                    System.out.println("Valete");
                    break;
                case 12:
                    System.out.println("Dama");
                    break;
                case 13:
                    System.out.println("Rei");
                    break;
                default:
                    System.out.println(carta);
                    break;
            }
        }
    }

}
