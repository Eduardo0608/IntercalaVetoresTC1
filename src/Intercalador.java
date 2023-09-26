import java.util.ArrayList;
import java.util.List;

public class Intercalador {

    public static int[] intercalar(int[] a, int[] b) {
        validarEntrada(a, b);
        List<Integer> resultado = new ArrayList<>();
        int tamanhoA = a.length;
        int tamanhoB = b.length;
        int i = 0, j = 0;

        while (i < tamanhoA && j < tamanhoB) {
            resultado.add(a[i++]);
            resultado.add(b[j++]);
        }

        while (i < tamanhoA) {
            resultado.add(a[i++]);
        }

        while (j < tamanhoB) {
            resultado.add(b[j++]);
        }

        return resultado.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void validarEntrada(int[] a, int[] b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Os vetores de entrada não podem ser nulos.");
        }
    }
}