
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int paramentroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int paramentroDois = terminal.nextInt();

        try {
            if (paramentroUm > paramentroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            for (int i = paramentroUm; i < paramentroDois; i++) {
                System.out.println("Imprimindo o número " + i);
            }

        } catch (NumberFormatException e) {
            System.err.println("Erro: Os parâmetros devem ser números inteiros.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Erro: Forneça dois números inteiros como parâmetros.");
        } catch (ParametrosInvalidosException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
