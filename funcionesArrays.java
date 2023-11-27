import java.util.Scanner;
import java.util.Arrays;

public class funcionesArrays {
    public static void main(String[] args) {
        // Declarar un array
        int[] arr = {1, 2, 3, 4, 5};
    
        // Declarar una matriz (2D array)
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    
        // Acceso a un elemento en posición específica
        int elemento = arr[2]; // Obtiene el valor en la posición 2 del array
    
        // Modificar un elemento en posición específica
        arr[2] = 10; // Cambia el valor en la posición 2 del array a 10
    
        // Obtener la longitud (tamaño) de un array
        int longitud = arr.length; // Obtiene la longitud del array
    
        // Agregar un elemento al final del array
        int nuevoElemento = 6;
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = nuevoElemento;
    
        // Eliminar el último elemento del array
        arr = Arrays.copyOfRange(arr, 0, arr.length - 1);
    
        // Encontrar el índice de un elemento en el array
        int indice = Arrays.binarySearch(arr, 4); // Busca el índice del valor 4 en el array
    
        // Ordenar el array en orden ascendente
        Arrays.sort(arr);
    
        // Filtrar elementos en el array
        int[] arrFiltrado = Arrays.stream(arr).filter(e -> e > 3).toArray();
    
        // Mapear/Transformar elementos en el array
        int[] arrTransformado = Arrays.stream(arr).map(e -> e * 2).toArray();
    
        // Crear una copia de un array
        int[] copiaArr = Arrays.copyOf(arr, arr.length);
    
        // Crear una copia de una matriz
        int[][] copiaMatriz = Arrays.stream(matriz).map(int[]::clone).toArray(int[][]::new);

        // Visualizar los elementos del array unidimensional
        int arrayUnidimensional[] = new int[1];       //______________________________________
        System.out.println("Array Unidimensional: " + Arrays.toString(arrayUnidimensional));

        // Visualizar los elementos del array bidimensional
        int arrayBidimensional[][] = new int[2][2]; //________________________________________
        System.out.println("Array Bidimensional: " + Arrays.deepToString(arrayBidimensional));
    }
    

    // Eliminar un elemento de un array
    public static int[] eliminarElemento(int array[], int posicion) {
        if (posicion < 0 || posicion >= array.length) {
            return array; // Si la posición no es válida, devuelve el array sin cambios
        }

        // Crear un nuevo array con un tamaño menor
        int[] arrayModificado = new int[array.length - 1];

        // Copiar los elementos antes de la posición especificada
        for (int i = 0; i < posicion; i++) {
            arrayModificado[i] = array[i];
        }

        // Copiar los elementos después de la posición especificada
        for (int i = posicion + 1; i < array.length; i++) {
            arrayModificado[i - 1] = array[i];
        }

        return arrayModificado;
    }

    // Pedir por teclado los elementos de un array en forma de numeral ordinal
    public static void pedirNumerosPorTeclado() {
        try (Scanner sc = new Scanner(System.in)) {
            String posicion[] = {"primero", "segundo", "tercer", "cuarto", "quinto", "sexto", "septimo", "octavo", "noveno", "decimo"};
            int num[] = new int[10];

            for (int i = 0; i < num.length; i++) {
                System.out.println("Dame el " + posicion[i] + " numero");
                num[i] = Integer.parseInt(sc.nextLine());
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    // Verifica si el número ya está presente en las posiciones anteriores del array
    public static boolean contieneRepetido(int[] array, int indice) {
        for (int i = 0; i < indice; i++) {
            if (array[i] == array[indice]) {
                return true;
            }
        }
        return false;
    }

}

    

