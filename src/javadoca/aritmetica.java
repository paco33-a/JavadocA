
package javadoca;

/**
 *
 * @author claramolinosaraiz
 * Esta clase representa operaciones aritméticas básicas.
 */
public class aritmetica {

/**
 * 
 * @param a
 * @param b
 * @return 
 */
    public int sumar(int a, int b) {
        return a + b;
    }

/**
 * 
 * @param a
 * @param b
 * @return 
 */
    public int restar(int a, int b) {
        return a - b;
    }
/**
 * 
 * @param a
 * @param b
 * @return 
 */
    public int multiplicar(int a, int b) {
        return a * b;
    }
/**
 * 
 * @param a
 * @param b
 * @return 
 */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}

