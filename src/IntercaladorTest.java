import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class IntercaladorTest {

    @Test
    public void testIntercalarVetoresComTamanhoIgual() {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] resultado = Intercalador.intercalar(a, b);
        int[] esperado = {1, 4, 2, 5, 3, 6};
        assertArrayEquals(esperado, resultado);
    }
}