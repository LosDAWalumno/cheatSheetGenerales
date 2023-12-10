public class StringBuffers {
    public class StringBufferExample {

        public static void main(String[] args) {
            // Ejemplo básico
            StringBuffer stringBuffer = new StringBuffer("Hola");
            stringBuffer.append(" Mundo"); // Concatenar al final
            System.out.println("Después de append: " + stringBuffer);
    
            stringBuffer.insert(5, " hermoso"); // Insertar en una posición específica
            System.out.println("Después de insert: " + stringBuffer);
    
            stringBuffer.delete(11, 16); // Eliminar caracteres en un rango
            System.out.println("Después de delete: " + stringBuffer);
    
            stringBuffer.reverse(); // Revertir la cadena
            System.out.println("Después de reverse: " + stringBuffer);
    
            String result = stringBuffer.toString(); // Convertir StringBuffer a String
            System.out.println("Convertido a String: " + result);
    
            // Métodos adicionales
            System.out.println("Longitud actual: " + stringBuffer.length()); // Obtener la longitud
            stringBuffer.setCharAt(1, 'e'); // Establecer un carácter en una posición específica
            System.out.println("Después de setCharAt: " + stringBuffer);
    
            stringBuffer.replace(1, 3, "i"); // Reemplazar en un rango
            System.out.println("Después de replace: " + stringBuffer);
    
            System.out.println("Capacidad actual: " + stringBuffer.capacity()); // Obtener la capacidad
    
            stringBuffer.ensureCapacity(20); // Asegurar una capacidad mínima
            System.out.println("Después de ensureCapacity: " + stringBuffer);
    
            // Eliminar todos los caracteres
            stringBuffer.delete(0, stringBuffer.length());
            System.out.println("Después de delete todo: " + stringBuffer);
    
            stringBuffer.append("¡Java es divertido!"); // Añadir más texto
            System.out.println("Después de nuevo append: " + stringBuffer);
    
            // Trabajar con subcadenas
            stringBuffer = new StringBuffer("Java es poderoso");
            String subcadena = stringBuffer.substring(5, 10); // Obtener una subcadena
            System.out.println("Subcadena: " + subcadena);
    
            stringBuffer.delete(5, 10); // Borrar una porción de la cadena
            System.out.println("Después de delete en rango: " + stringBuffer);
    
            // Conversión de tipos
            stringBuffer = new StringBuffer("123");
            int numero = Integer.parseInt(stringBuffer.toString()); // Convertir StringBuffer a int
            System.out.println("Número convertido: " + numero);
    
            stringBuffer = new StringBuffer(Integer.toString(numero)); // Convertir int a StringBuffer
            System.out.println("StringBuffer después de convertir número: " + stringBuffer);
    
            // Comparación de StringBuffer
            StringBuffer buffer1 = new StringBuffer("Hola");
            StringBuffer buffer2 = new StringBuffer("Hola");
    
            if (buffer1.toString().equals(buffer2.toString())) {
                System.out.println("Los StringBuffer son iguales.");
            } else {
                System.out.println("Los StringBuffer son diferentes.");
            }
    
            // Iteración a través de StringBuffer
            stringBuffer = new StringBuffer("Iteración");
    
            for (int i = 0; i < stringBuffer.length(); i++) {
                char caracter = stringBuffer.charAt(i);
                System.out.println("Carácter en posición " + i + ": " + caracter);
            }
        }
    }
    
    
}
