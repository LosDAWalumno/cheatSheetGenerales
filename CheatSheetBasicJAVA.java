
public class CHEAT_SHEET_JAVA {
// -------------------
// 1. ESTRUCTURA BÁSICA
// -------------------

// Declaración de clase
public class MiClase {

    // Método principal
    public static void main(String[] args) {
        // Código a ejecutar
    }

}

// -------------------
// 2. VARIABLES Y TIPOS DE DATOS
// -------------------

// Declaración de variables
int entero = 10;
double decimal = 3.14;
char caracter = 'A';
boolean esVerdadero = true;
String cadena = "Hola, Mundo!";

// -------------------
// 3. ESTRUCTURAS DE CONTROL
// -------------------

// If-else
if (condicion) {
    // Código si la condición es verdadera
} else {
    // Código si la condición es falsa
}

// Bucle for
for (int i = 0; i < 5; i++) {
    // Código a ejecutar en cada iteración
}

// Bucle while
while (condicion) {
    // Código a ejecutar mientras la condición sea verdadera
}

// -------------------
// 4. ARREGLOS
// -------------------

// Declaración de un arreglo de enteros
int[] numeros = new int[5];

// Inicialización de un arreglo
int[] valores = {1, 2, 3, 4, 5};

// Acceso a elementos de un arreglo
int primerElemento = valores[0];

// -------------------
// 5. FUNCIONES
// -------------------

// Declaración de función
int sumar(int a, int b) {
    return a + b;
}

// Llamada a función
int resultado = sumar(3, 4);

// -------------------
// 6. CLASES Y OBJETOS
// -------------------

// Declaración de clase
public class Persona {
    // Atributos
    String nombre;
    int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método
    void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}

// Creación de objeto
Persona persona1 = new Persona("Juan", 25);

// Llamada a método
persona1.saludar();

}
