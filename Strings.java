public class Strings {
    public static void main(String[] args) {
        // Declarar una cadena
        String cadena = "Hola Mundo";

        // Longitud de la cadena
        int longitud = cadena.length();
        System.out.println("Longitud de la cadena: " + longitud);

        // Obtener un carácter en una posición específica
        char caracter = cadena.charAt(0);
        System.out.println("Carácter en la posición 0: " + caracter);

        // Obtener una subcadena
        String subcadena = cadena.substring(0, 4);
        System.out.println("Subcadena desde 0 hasta 3: " + subcadena);

        // Transformar a mayúsculas y minúsculas
        String mayusculas = cadena.toUpperCase();
        String minusculas = cadena.toLowerCase();
        System.out.println("Mayúsculas: " + mayusculas);
        System.out.println("Minúsculas: " + minusculas);

        // Verificar igualdad de cadenas
        String otraCadena = "Hola Mundo";
        boolean sonIguales = cadena.equals(otraCadena);
        System.out.println("¿Cadenas iguales? " + sonIguales);

        // Verificar igualdad sin distinguir mayúsculas y minúsculas
        boolean sonIgualesIgnoreCase = cadena.equalsIgnoreCase(otraCadena);
        System.out.println("¿Cadenas iguales (ignorando caso)? " + sonIgualesIgnoreCase);

        // Verificar si la cadena comienza o termina con un prefijo/sufijo
        boolean comienzaCon = cadena.startsWith("Hola");
        boolean terminaCon = cadena.endsWith("Mundo");
        System.out.println("¿Cadena comienza con 'Hola'? " + comienzaCon);
        System.out.println("¿Cadena termina con 'Mundo'? " + terminaCon);

        // Verificar si la cadena contiene una secuencia
        boolean contiene = cadena.contains("la");
        System.out.println("¿Cadena contiene 'la'? " + contiene);

        // Buscar la primera ocurrencia de un carácter o cadena
        int indice = cadena.indexOf("M");
        System.out.println("Índice de la primera 'M': " + indice);

        // Reemplazar ocurrencias de caracteres o cadenas
        String nuevaCadena = cadena.replace("Mundo", "Gente");
        System.out.println("Cadena con reemplazo: " + nuevaCadena);

        // Unir varias cadenas con un separador
        String cadenaUnida = String.join("-", "Hola", "Mundo");
        System.out.println("Cadena unida: " + cadenaUnida);

        // Eliminar espacios en blanco al inicio y al final de la cadena
        String cadenaSinEspacios = cadena.trim();
        System.out.println("Cadena sin espacios: " + cadenaSinEspacios);

        // Repetir la cadena n veces
        String cadenaRepetida = cadena.repeat(3);
        System.out.println("Cadena repetida 3 veces: " + cadenaRepetida);

        // Verificar si la cadena está vacía o contiene solo espacios en blanco
        boolean esVacia = cadena.isBlank();
        System.out.println("¿Cadena está vacía o contiene solo espacios en blanco? " + esVacia);

        // Verificar si la cadena está vacía
        boolean esVaciaLength = cadena.isEmpty();
        System.out.println("¿Cadena está vacía? " + esVaciaLength);
        
    }
        
}
