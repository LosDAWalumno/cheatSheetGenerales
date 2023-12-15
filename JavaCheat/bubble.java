public class bubble {

    public static void main(String[] args) {
        // Arreglo de ejemplo
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Arreglo original:");
        printArray(array);

        // Llamada al método de ordenación de burbuja
        bubbleSort(array);

        System.out.println("\nArreglo ordenado:");
        printArray(array);
    }

    // Método para imprimir un arreglo
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    // Método para realizar la ordenación de burbuja
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compara elementos adyacentes y los intercambia si están en el orden incorrecto
                if (arr[j] > arr[j + 1]) {
                    // Intercambio de elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
}
