package cheatSheetGenerales;
import java.util.Arrays;
public class funcionesArrays {
    ////////////Eliminar un elemento de un array///////////////////////////////
    public static int[] eliminarElemento(int array[], int posicion){
        if(posicion<0 || posicion>=array.length) {
            return array; //Si la posición no fuera válida, devolver el array
        }
        //Crear un nuevo array con menor tamaño
        int[] arraymod = new int[array.length-1];
        //copiar los elementos antes de la posicion especificada
        for (int i = 0; i < posicion; i++) {
            arraymod[i] = array[i];
        }
        for (int i = posicion+1; i < array.length; i++) {
            arraymod[i-1] = array[i];
        }
        return arraymod;
    }
}
