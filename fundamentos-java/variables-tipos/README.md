¡Hola! 👋 Soy Miguel y estoy comenzando mi viaje en el desarrollo de software. Este repositorio documenta mis primeros pasos, enfocados en la comprensión de los pilares de cualquier lenguaje: las Variables y los Tipos de Datos en Java.

---

## 🎯 🚀 Objetivo de la Semana
Esta etapa inicial se centra en entender la sintaxis de Java y cómo el lenguaje maneja la información dentro de la memoria. Mi objetivo era pasar de la teoría (¿qué es una variable?) a la aplicación práctica (¿cómo la declaro e inicializo?).

## 💡 Temario y Conocimientos Adquiridos

He profundizado en la naturaleza estáticamente tipada de Java, diferenciando entre tipos de datos fundamentales y estructuras de referencia.

### 🧱 Variables y Tipos Primitivos
Comprendí que una variable es esencialmente una "etiqueta" en la memoria que almacena un valor de un tipo específico.

*   **Tipos Primitivos (Bloques de Construcción):**
    *   **Enteros:** `byte`, `short`, `int`, `long` (diferenciando el uso de L en `long`).
    *   **Decimales:** `float` y `double` (usando `double` como el estándar para cálculos).
    *   **Caracteres:** `char` (para símbolos y letras individuales).
    *   **Lógicos:** `boolean` (para estados `true` o `false`).

### 🗺️ Tipos de Referencia (Estructuras Complejas)
Aprendí que no todos los datos son primitivos; algunos representan objetos en la memoria (Heap).

*   **`String`:** Manejo de secuencias de caracteres (texto).
*   **`Arrays`:** Colecciones dinámicas del mismo tipo (`int[]`, `String[]`).
*   **Clases Personalizadas:** Entendiendo la lógica de que una variable de referencia apunta a un objeto definido.

---

## 🛠️ Práctica y Aplicación (Ejemplos del Código)

He verificado los conceptos teóricos implementándolos en el código. A continuación, muestro ejemplos clave de mi aprendizaje:

```java
public class ProgramBasico {

    public static void main(String[] args) {
        // 1. Declaración y Inicialización
        String nombre = "Miguel"; // Tipo de Referencia
        int anioActual = 2026;      // Tipo Primitivo (Integer)

        // 2. Uso de Tipos Decimale y Booleano
        double distancia = 100.5;
        boolean estaActivo = true;

        // 3. Uso de Arreglos (Arrays)
        int[] puntajes = {90, 85, 70};
        System.out.println("Primer puntaje: " + puntajes[0]);
    }
}
