import java.util.Scanner;
public class exercicio_um {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um numero de 1 a 36");
        int num1 = sc.nextInt();
        System.out.println("Escolha o numero sorteado");
        int num2 = sc.nextInt();

        if (num1 != num2) {
            System.out.println("Infelizmente voce perdeu");
        }else System.out.println("Parabens voce ganhou o valor de " + (num1 + num2));









    }
}
