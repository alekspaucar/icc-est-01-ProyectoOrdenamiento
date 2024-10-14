import java.util.Arrays;
public class MetodosOrdenamiento {

    public int[] burbujaOrdenamiento(int[] array , boolean cambio){
        int[] arregloOrdenado = Arrays.copyOf(array, array.length); 
        System.out.println("Iniciando el ordenamiento por Burbuja...");
        for (int i = 0; i < arregloOrdenado.length; i++) {
            boolean intercambio = false; 
            System.out.println("Iteración " + (i + 1) + ":");
            for (int j = i + 1; j < arregloOrdenado.length; j++) {
                System.out.println("\tComparando " + arregloOrdenado[i] + " con " + arregloOrdenado[j]);
                if (cambio) { 
                    if (arregloOrdenado[i] > arregloOrdenado[j]) {
                        int aux = arregloOrdenado[i];
                        arregloOrdenado[i] = arregloOrdenado[j];
                        arregloOrdenado[j] = aux;
                        intercambio = true;
                        System.out.println("\t\tIntercambio realizado: " + Arrays.toString(arregloOrdenado));
                    }
                } else {
                    if (arregloOrdenado[i] < arregloOrdenado[j]) {
                        int aux = arregloOrdenado[i];
                        arregloOrdenado[i] = arregloOrdenado[j];
                        arregloOrdenado[j] = aux;
                        intercambio = true;
                        System.out.println("\t\tIntercambio realizado: " + Arrays.toString(arregloOrdenado));
                    }
                }
            }
            if (!intercambio) {
                System.out.println("No hubo intercambios en esta iteración, el arreglo está ordenado.");
                break;
            }
            System.out.println("Estado del arreglo después de la iteración " + (i + 1) + ": " + Arrays.toString(arregloOrdenado));
        }
        System.out.println("Ordenamiento completo: " + Arrays.toString(arregloOrdenado));
        return arregloOrdenado;
    }
    public int[] seleccionOrdenamiento(int[] array, boolean cambio) {
        int[] arregloOrdenado = Arrays.copyOf(array, array.length);

        if (cambio == true) {  
            for (int i = 0; i < arregloOrdenado.length - 1; i++) {
                int indice = i;
                System.out.println("Iteración " + i + ":");
                for (int j = i + 1; j < arregloOrdenado.length; j++) {
                    System.out.println("\tComparando " + arregloOrdenado[j] + " con " + arregloOrdenado[indice]);
                    if (arregloOrdenado[j] < arregloOrdenado[indice]) {
                        indice = j;
                        System.out.println("\t\tNuevo mínimo encontrado en índice " + indice);
                    }
                }
                int temp = arregloOrdenado[indice];
                arregloOrdenado[indice] = arregloOrdenado[i];
                arregloOrdenado[i] = temp;
                System.out.println("\tArreglo después del intercambio: " + Arrays.toString(arregloOrdenado));
            }
        } else { 
            for (int i = 0; i < arregloOrdenado.length - 1; i++) {
                int indice = i;
                System.out.println("Iteración " + i + ":");
    
                for (int j = i + 1; j < arregloOrdenado.length; j++) {
                    System.out.println("\tComparando " + arregloOrdenado[j] + " con " + arregloOrdenado[indice]);
                    if (arregloOrdenado[j] > arregloOrdenado[indice]) {
                        indice = j;
                        System.out.println("\t\tNuevo máximo encontrado en índice " + indice);
                    }
                }
                int temp = arregloOrdenado[indice];
                arregloOrdenado[indice] = arregloOrdenado[i];
                arregloOrdenado[i] = temp;
    
                System.out.println("\tArreglo después del intercambio: " + Arrays.toString(arregloOrdenado));
            }
        }
    
        return arregloOrdenado;
    }
    public int[] insercionOrdenamiento(int[] array, boolean cambio) {
            int[] arregloOrdenado = Arrays.copyOf(array, array.length);
            if (cambio == true){
                for (int j = 1; j < arregloOrdenado.length; j++) {
                    System.out.println("REPASO DE NUMERO " + j);
                    int key = arregloOrdenado[j];
                    int i = j - 1;
                    System.out.println("\ti=" + i + " j=" + j + " [i]=" + array[i] + " [j]=" + array[j]);
                    while (i >= 0 && arregloOrdenado[i] > key) {
                        System.out.println("\t\tComparamos " + key + " con " + array[j]);
                        arregloOrdenado[i + 1] = arregloOrdenado[i];
                        i--;
                        System.out.println("\t\t--------" + Arrays.toString(array));
                    }
                    System.out.println("\t--------" + Arrays.toString(array));
                    arregloOrdenado[i + 1] = key;
                }
                return arregloOrdenado;
            
            } else {
                for (int j = 1; j < arregloOrdenado.length; j++) {
                    int key = arregloOrdenado[j];
                    int i = j - 1;
                    while (i >= 0 && arregloOrdenado[i] <  key) {
                        arregloOrdenado[i + 1] = arregloOrdenado[i];
        
                        i--;
                    }
                    arregloOrdenado[i + 1] = key;
                }
                return arregloOrdenado;
        }
    }
    public int[] burbujaComplejaOrdenamiento(int[] array, boolean ascendente) {
        int[] arregloOrdenado = Arrays.copyOf(array, array.length);
        int n = arregloOrdenado.length;
        boolean intercambio;
        System.out.println("Iniciando el ordenamiento por Burbuja Compleja...");
        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            System.out.println("Iteración " + (i + 1) + ":");
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.println("\tComparando " + arregloOrdenado[j] + " con " + arregloOrdenado[j + 1]);
                if (ascendente ? (arregloOrdenado[j] > arregloOrdenado[j + 1]) : (arregloOrdenado[j] < arregloOrdenado[j + 1])) {
                    int temp = arregloOrdenado[j];
                    arregloOrdenado[j] = arregloOrdenado[j + 1];
                    arregloOrdenado[j + 1] = temp;
                    intercambio = true;
                    System.out.println("\t\tIntercambio realizado: " + Arrays.toString(arregloOrdenado));
                }
            }
            if (!intercambio) {
                System.out.println("No hubo intercambios, el arreglo está ordenado.");
                break;
            }
            System.out.println("Estado del arreglo después de la iteración " + (i + 1) + ": " + Arrays.toString(arregloOrdenado));
        }
        System.out.println("Ordenamiento completo: " + Arrays.toString(arregloOrdenado));
        return arregloOrdenado;
    }
    

}