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

    @Test
    public void testIntercalarVetoresComTamanhoDiferente() {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6};
        int[] resultado = Intercalador.intercalar(a, b);
        int[] esperado = {1, 5, 2, 6, 3, 4};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testIntercalarVetorAComTamanhoZero() {
        int[] a = {};
        int[] b = {4, 5, 6};
        int[] resultado = Intercalador.intercalar(a, b);
        int[] esperado = {4, 5, 6};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testIntercalarVetorBComTamanhoZero() {
        int[] a = {1, 2, 3};
        int[] b = {};
        int[] resultado = Intercalador.intercalar(a, b);
        int[] esperado = {1, 2, 3};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testIntercalarVetoresComTamanhoUm() {
        int[] a = {9};
        int[] b = {7};
        int[] resultado = Intercalador.intercalar(a, b);
        int[] esperado = {9, 7};
        assertArrayEquals(esperado, resultado);
    }

}