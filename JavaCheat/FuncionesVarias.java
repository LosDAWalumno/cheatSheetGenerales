public class FuncionesVarias {
    // ------------------------------
    // 1. Calcular la distancia entre dos coordenadas
    // ------------------------------

    public static Double calcularDistanciaXY(double x1, double y1, double x2, double y2) {
        // Fórmula: Raíz cuadrada de (x2 - x1)^2 + (y2 - y1)^2
        double distanciaX = Math.pow(x2 - x1, 2);
        double distanciaY = Math.pow(y2 - y1, 2);
        return Math.sqrt(distanciaX + distanciaY);
    }

    // ------------------------------
    // 2. Es este número múltiplo de este otro?
    // ------------------------------

    /**
     * Función que dice si el segundo número es múltiplo del primer número.
     *
     * @param n1 Primer número
     * @param n2 Segundo número
     * @return Un booleano indicando si es múltiplo o no
     */
    public static boolean calcularEsMultiplo(int n1, int n2) {
        return n1 % n2 == 0;
    }

    // ------------------------------
    // 3. Múltiplos de 5
    // ------------------------------

    public static void imprimirMultiplosCinco() {
        for (int num = 500; num >= 100; num--) {
            if (num % 5 == 0) {
                System.out.println(num);
            }
        }
    }

    // ------------------------------
    // 4. Calculadora
    // ------------------------------

    public static double calculadora(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 0;
        }
    }

    // ------------------------------
    // 5. Cuál es el número mayor de los 2
    // ------------------------------

    public static int mayor(int num1, int num2) {
        return Math.max(num1, num2);
    }

    // ------------------------------
    // 6. Sumar 3 números
    // ------------------------------

    public static double suma(double a, double b, double c) {
        return a + b + c;
    }

    // ------------------------------
    // 7. Calcular la potencia de un número dados su base y exponente
    // ------------------------------

    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    // ------------------------------
    // 8. Genera un número aleatorio en un rango determinado de mínimo y máximo
    // ------------------------------

    public static int generarNumeroAleatorio(int min, int max) throws Exception {
        if (min > max) {
            throw new Exception("El valor mínimo no puede ser mayor que el máximo");
        }
        return (int) (Math.random() * (max - min + 1) + min);
    }

    // ------------------------------
    // 9. De un número, suma los dígitos que lo forman
    // ------------------------------

    public static int sumaDigitos(int numero) {
        int resultado = 0;
        while (numero > 0) {
            resultado += numero % 10;
            numero /= 10;
        }
        return resultado;
    }

    // ------------------------------
    // 10. Devuelve si el número pasado como parámetro es primo o no
    // ------------------------------

    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // ------------------------------
    // 11. Devuelve la longitud de la circunferencia cuyo radio es el número
    // ------------------------------

    public static double longitudCircunferencia(int radio) {
        return 2 * Math.PI * radio;
    }

    // ------------------------------
    // 12. Devuelve el número de dígitos
    // ------------------------------

    public static int calcularNumeroDigitos(int n) {
        int resultado = 0;
        while (n > 0) {
            n /= 10;
            resultado++;
        }
        return resultado;
    }

    // ------------------------------
    // 13. Convierte en palotes
    // ------------------------------

    public static void convierteEnPalotes(int n) {
        int numeroDigitos = calcularNumeroDigitos(n);
        for (int i = numeroDigitos - 1; i >= 0; i--) {
            int digito = (int) (n / Math.pow(10, i));
            n -= digito * Math.pow(10, i);
            if (i != 0) {
                System.out.print("-");
            } else {
                if (digito == 0) {
                    System.out.print("-");
                }
            }
        }
    }

    // ------------------------------
    // 14. De una cantidad de dinero, se devolverá la cantidad de billetes de cada tipo
    // ------------------------------

    public static void billetes(int cant) {
        int b200, b100, b50, b20, b10, b5, sobra, resto;
        
        b200 = cant / 200;
        resto = cant % 200;
        // Continuar con los demás billetes...
    }
    
    // ------------------------------
    // 15. Invertir orden de un numero (123 --> 321)
    // ------------------------------
    public static int invertirNumero(int numero) {
        int inverso = 0;
        while (numero > 0) {
            int digito = numero % 10;
            inverso = inverso * 10 + digito;
            numero = numero / 10;
        }
        return inverso;
    }
    // ------------------------------
    // 16. Invertir Cadena de carácteres (123abc -->cba321)
    // ------------------------------
    public static String invertirCadena(String cadena) {
        String inversa = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            inversa += cadena.charAt(i);
        }
        return inversa;
    }
}
