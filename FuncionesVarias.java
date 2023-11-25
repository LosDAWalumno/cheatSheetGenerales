package cheatSheetGenerales;
import java.util.Scanner;

public class FuncionesVarias {
/////////////////////Calcular la distancia entre dos coordenadas////////////////////////////////////
    public static Double calcularDistanciaXY; {
        //3. Calcular la distancia -> Raíz cuadrada de (x2-x1)2 + (y2-y1)2
        double x1=0,y1=0,x2=0,y2=0;
        double distanciaX = Math.pow(x2-x1, 2);
        double distanciaY = Math.pow(y2-y1, 2);
        double distancia = Math.sqrt(  distanciaX + distanciaY );
    }
    /**
     * Función que dice si el segundo número es múltiplo del primer número
     * @param n1
     * @param n2
     * @return un booleano indicando si es múltiplo o no
     */
    ////////////////Es este número múltiplo de este otro?/////////////////////////////
    public static boolean calcularEsMultiplo(int n1, int n2) {////////////////////////////////////////////////////////////////////////////
        if (n1 % n2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    ////////////////Multiplos de 5///////////////////////////////
    public static int MultiplosCinco; {
        Scanner sc = new Scanner(System.in);
        
        //Todos los múltiplos de 5, entre el 500 y el 100
        for(int num = 500; num >= 100; num--) {
            //Es múltiplo
            if (num % 5 == 0) {
                System.out.println(num);
            }
        }

        int num = 500;
        while (num >= 100) {
            if (num % 5 == 0) {
                System.out.println(num);
            }
            num--;
        }
    }
    /////////////////Calculadora//////////////////
    public static double calculadora(double a, double b, String operator) {
        if (operator.equals("+")) {
            return a+b;
        } else if (operator.equals("-")) {
            return a-b;
        } else if (operator.equals("*")) {
            return a*b;
        } else if (operator.equals("/")) {
            return a/b;
        } else
            return 0;
        }
    /**
     * Devuelve el número mayor de los dos argumentos
     * @param num1
     * @param num2
     * @return Un int con el mayor de los dos números
     */
    ////////////////cual es el número mayor de los 2///////////////
    public static int mayor(int num1, int num2) {

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    //////////////////sumar 3 números////////////////////
    public static double suma(double a, double b, double c) {
        double resultado;
        resultado = a + b + c;
        return resultado;
    }
    ///////////Calcular la potencia de un número dados su base y exponente//////////////////////
    public static double potencia(double base, int exponente) {

        double resultado=1; 
        for(int i=0; i < exponente; i++) {
            resultado = resultado * base;  //resultado *= base
        }

        return resultado;
    }
    ///////Genera un número aleatorio en un rango determinado de mínimo y máximo/////////////////////
    public static int generarNumero(int min, int max) throws Exception {
        //genera numeros aleatorios dando el minimo y maximo 
        //Si min > max, lanzamos Exception "min debe ser menor que max"
        if (min > max) {
            throw new Exception("El valor mínimo no puede ser mayor que el máximo");
        }

        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }
    /**
     * Suma los dígitos de un número
     * @param numero
     * @return
     */
    ////////////////de un número, suma los dígitos que forman este (ejemplo: 134 sería 8)
    public static int sumaDigitos(int numero) {
        int resultado = 0;
        int resto=1;

        while(resto > 0) {
            resto = numero % 10;
            resultado = resultado + resto;
            numero = numero / 10;
        }

        return resultado;
    }

    ///////////Devuelve si el número pasado como parámetro es primo o no///////////////////////////
    public static boolean esPrimo(int numero) {
        boolean esPrimo=true;

        for(int i=2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        return esPrimo;
    }
    ///////////////Devuelve la longitud de la circunferencia cuyo radio es número////////////////
    public static double longitudCircunferencia(int numero) {
        double longitud=0;

        longitud = Math.PI * numero * 2;

        return longitud;
    }

    /////////Return number of digits of an integer//////////
    public static int calcularNumeroDigitos(int n) {
        int resultado = 0;

        while(n > 0) {
            n = n / 10;
            resultado++;
        }

        return resultado;
    }
    public static void convierteEnPalotes(int n) {
        int resto=1;
        int numeroDigitos=0;
        int digito;

        numeroDigitos = calcularNumeroDigitos(n);
        
        for(int i=numeroDigitos-1; i>=0; i--) {
            digito = (int) ( n / Math.pow(10, i) );
            n = (int) (n - (digito * Math.pow(10, i)));

            //System.out.println(n + " - " + digito);
            if  (i!=0) {                
                System.out.print("-");
            } else {
                if (digito == 0) {
                    System.out.print("-");
                }
            }
                
        }
    }
    /////////de una cantidad de dinero, se devolverá la cantidad de billetes de cada tipo///////// 
    public static void billetes(int cant) {
        int b200, b100, b50, b20, b10, b5, sobra, resto;
        
        b200 = cant / 200;
        resto = cant % 200;
        //y continua con los demas
    }
}
