public class StringBuffers {
        public class StringBufferExample {

                public static void main(String[] args) {
                // Ejemplo básico
        System.out.println("Concatenar al final");        
                StringBuffer stringBuffer = new StringBuffer("Hola"); 
                stringBuffer.append(" Mundo"); // Concatenar al final
                System.out.println("Después de append: " + stringBuffer);

        System.out.println("Insertar en una posición específica");
                stringBuffer.insert(5, " hermoso"); // Insertar en una posición específica
                System.out.println("Después de insert: " + stringBuffer);

        System.out.println("Eliminar caracteres en un rango");
                stringBuffer.delete(11, 16); // Eliminar caracteres en un rango
                System.out.println("Después de delete: " + stringBuffer);

                System.out.println("Eliminar un caracter de una posición específica");
                stringBuffer.deleteCharAt(11); // Eliminar caracter en una posicion
                System.out.println("Después de delete: " + stringBuffer);

        System.out.println("Revertir la cadena");
                stringBuffer.reverse(); // Revertir la cadena
                System.out.println("Después de reverse: " + stringBuffer);

        System.out.println("Convertir StringBuffer a String");
                String result = stringBuffer.toString(); // Convertir StringBuffer a String
                System.out.println("Convertido a String: " + result);

        System.out.println("Obtener la longitud");
                // Métodos adicionales
                System.out.println("Longitud actual: " + stringBuffer.length()); // Obtener la longitud

                System.out.println("Establecer un carácter en una posición específica");
                stringBuffer.setCharAt(1, 'e'); // Establecer un carácter en una posición específica (reemplazar)
                System.out.println("Después de setCharAt: " + stringBuffer);

        System.out.println("Reemplazar en un rango");
                stringBuffer.replace(1, 3, "i"); // Reemplazar en un rango
                System.out.println("Después de replace: " + stringBuffer);

        System.out.println("Obtener la capacidad");
                System.out.println("Capacidad actual: " + stringBuffer.capacity()); // Obtener la capacidad

        System.out.println("Asegurar una capacidad mínima");
                stringBuffer.ensureCapacity(20); // Asegurar una capacidad mínima
                System.out.println("Después de ensureCapacity: " + stringBuffer);

        System.out.println("Eliminar todos los caracteres");
                                                                        // Eliminar todos los caracteres
                stringBuffer.delete(0, stringBuffer.length());
                System.out.println("Después de delete todo: " + stringBuffer);

        System.out.println("Añadir más texto");
                stringBuffer.append("¡Java es divertido!"); // Añadir más texto
                System.out.println("Después de nuevo append: " + stringBuffer);

        System.out.println("Trabajar con subcadenas");
                // Trabajar con subcadenas
                stringBuffer = new StringBuffer("Java es poderoso");
                String subcadena = stringBuffer.substring(5, 10); // Obtener una subcadena
                System.out.println("Subcadena: " + subcadena);

        System.out.println("Borrar una porción de la cadena");
                stringBuffer.delete(5, 10); // Borrar una porción de la cadena
                System.out.println("Después de delete en rango: " + stringBuffer);

        System.out.println("Convertir StringBuffer a int");
                // Conversión de tipos
                stringBuffer = new StringBuffer("123");
                int numero = Integer.parseInt(stringBuffer.toString()); // Convertir StringBuffer a int
                System.out.println("Número convertido: " + numero);

        System.out.println("Convertir int a StringBuffer");
                stringBuffer = new StringBuffer(Integer.toString(numero)); // Convertir int a StringBuffer
                System.out.println("StringBuffer después de convertir número: " + stringBuffer);
        System.out.println("Comparación de StringBuffer");
                                                                                // Comparación de StringBuffer
                StringBuffer buffer1 = new StringBuffer("Hola");
                StringBuffer buffer2 = new StringBuffer("Hola");
        
                if (buffer1.toString().equals(buffer2.toString())) {
                        System.out.println("Los StringBuffer son iguales.");
                } else {
                        System.out.println("Los StringBuffer son diferentes.");
                }
        System.out.println("Iteración a través de StringBuffer");
                                                                                // Iteración a través de StringBuffer
                stringBuffer = new StringBuffer("Iteración");
        
                for (int i = 0; i < stringBuffer.length(); i++) {
                        char caracter = stringBuffer.charAt(i);
                        System.out.println("Carácter en posición " + i + ": " + caracter);
                }
                }
        }
        
        
        } 
