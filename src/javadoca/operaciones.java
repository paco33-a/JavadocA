
package javadoca;

/**
 *
 * @author claramolinosaraiz
 * Esta clase representa operaciones matemáticas avanzadas.
 */
public class operaciones {

    /**
     * 
     * @param a
     * @param b
     * @return nos devuelve el resultado de la division 
     */
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return a % b;
    }

 /**
  * 
  * @param a
  * @return nos devolvera las medidas del cuadrado 
  */
    public int calcularCuadrado(int a) {
        return a * a;
    }
/**
 * 
 * @param a
 * @return nos devolvera el resutado de la raiz cuadrada
 */
    public double calcularRaizCuadrada(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(a);
    }
}

