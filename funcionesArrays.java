import java.util.Arrays;
import java.util.Scanner;
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

    /////////Pedir por teclado los elementos de un array en forma de numeral ordinal (No es una función como tal, solo lo coloqué así para mejor visualización)/////////
    public static void Numeracion(String numeral[]) {
        Scanner sc = new Scanner(System.in);
        String posicion[]={"primero", "segundo", "tercer", "cuarto", "quinto","sexto", "septimo", "octavo", "noveno", "decimo"};//////
        int num[] = new int[10];
        for (int i = 0; i < num.length; i++) {/////
            System.out.println("Dame el "+posicion[i]+" numero");
            num[i]=Integer.parseInt(sc.nextLine());
        }
    }
}
