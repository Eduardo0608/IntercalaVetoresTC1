import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class IntercaladorTest {

    @Test
    public void testIntercalarVetoresComTamanhoIgual() {
        // Teste para intercalar vetores de tamanho igual
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] resultado = Intercalador.intercalar(a, b);
        int[] esperado = {1, 4, 2, 5, 3, 6};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testIntercalarVetoresComTamanhoDiferente() {
        // Teste para intercalar vetores com tamanhos diferentes
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6};
        int[] resultado = Intercalador.intercalar(a, b);
        int[] esperado = {1, 5, 2, 6, 3, 4};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testIntercalarVetorAComTamanhoZero() {
        // Teste para intercalar quando o vetor A tem tamanho zero
        int[] a = {};
        int[] b = {4, 5, 6};
        int[] resultado = Intercalador.intercalar(a, b);
        int[] esperado = {4, 5, 6};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testIntercalarVetorBComTamanhoZero() {
        // Teste para intercalar quando o vetor B tem tamanho zero
        int[] a = {1, 2, 3};
        int[] b = {};
        int[] resultado = Intercalador.intercalar(a, b);
        int[] esperado = {1, 2, 3};
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void testIntercalarVetoresComTamanhoUm() {
        // Teste para intercalar vetores com tamanho um
        int[] a = {9};
        int[] b = {7};
        int[] resultado = Intercalador.intercalar(a, b);
        int[] esperado = {9, 7};
        assertArrayEquals(esperado, resultado);
    }
}