
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

import main.Contador;
import main.ParametrosInvalidosException;

public class ContadorTest {

    Contador contador = new Contador();

    @SuppressWarnings("static-access")
    @Test
    public void testParametrosValidos() {
        assertDoesNotThrow(() -> contador.contar(12, 30));
    }

    @Test
    public void testPrimeiroParametroMaiorQueSegundo() {
        try {
            contador.contar(3, 2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    @Test
    public void testParametrosNaoNumeros() {
        try {
            contador.contar(Integer.parseInt("abc"), 2);
        } catch (NumberFormatException e) {
            System.out.println("Exceção de formato inválido capturada: " + e.getMessage());
        } catch (ParametrosInvalidosException e) {
            fail("Não deveria lançar uma exceção de parâmetros inválidos");
        }
    }
}
