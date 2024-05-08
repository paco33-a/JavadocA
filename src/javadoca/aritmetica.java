
package javadoca;

/**
 *
 * @author claramolinosaraiz
 * Esta clase representa operaciones aritméticas básicas.
 */
public class aritmetica {

/**
 * 
 * @param a primer valor
 * @param b segundo valor 
 * @return la suma de ambos valores 
 */
    public int sumar(int a, int b) {
        return a + b;
    }

/**
 * 
 * @param a primer valor
 * @param b segundo valor
 * @return la Resta de ambos valores
 */
    public int restar(int a, int b) {
        return a - b;
    }
/**
 * 
 * @param a primer valor
 * @param b segundo valor
 * @return la multiplicacion de ambos valores
 */
    public int multiplicar(int a, int b) {
        return a * b;
    }
/**
 * 
 * @param a primer valor
 * @param b segundo valor
 * @return la division de los valores 
 */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}

