import java.util.ArrayList;
import java.util.List;

public class Intercalador {

    public static int[] intercalar(int[] a, int[] b) {
        // Verifica se os vetores de entrada não são nulos
        validarEntrada(a, b);

        // Lista dinâmica para armazenar o resultado da intercalação
        List<Integer> resultado = new ArrayList<>();

        // Obtém os tamanhos dos vetores de entrada
        int tamanhoA = a.length;
        int tamanhoB = b.length;

        // Índices para percorrer os vetores A e B
        int i = 0, j = 0;

        // Intercala os elementos dos vetores A e B
        while (i < tamanhoA && j < tamanhoB) {
            resultado.add(a[i++]);
            resultado.add(b[j++]);
        }

        // Adiciona os elementos restantes do vetor A, se houver
        while (i < tamanhoA) {
            resultado.add(a[i++]);
        }

        // Adiciona os elementos restantes do vetor B, se houver
        while (j < tamanhoB) {
            resultado.add(b[j++]);
        }

        // Converte a lista para um array de inteiros e retorna
        return resultado.stream().mapToInt(Integer::intValue).toArray();
    }

    // Método para validar se os vetores de entrada não são nulos
    private static void validarEntrada(int[] a, int[] b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Os vetores de entrada não podem ser nulos.");
        }
    }
}