import java.util.Scanner;

/**
 * @author hemmerson
 * on date 23/02/2023
 */
public class Main {
    public static void main(String[] args) {

        int numero;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String parImpar = "";
            System.out.println("Digite um numero para saber se é par ou impar: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0)
                parImpar = "PAR";
            else
                parImpar = "IMPAR";

            System.out.printf("O número digitado: %d, é %s\n", numero, parImpar);
        }
    }
}