public class Intercalador {

    public static int[] intercalar(int[] a, int[] b) {
        int tamanhoA = a.length;
        int tamanhoB = b.length;
        int tamanhoC = tamanhoA + tamanhoB;
        int[] c = new int[tamanhoC];

        int i = 0, j = 0, k = 0;

        while (i < tamanhoA && j < tamanhoB) {
            c[k++] = a[i++];
            c[k++] = b[j++];
        }

        while (i < tamanhoA) {
            c[k++] = a[i++];
        }

        while (j < tamanhoB) {
            c[k++] = b[j++];
        }

        return c;
    }
}