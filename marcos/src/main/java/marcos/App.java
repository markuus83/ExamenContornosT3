/**
 * Declaramos el paquete en el que se va a alojar el proyecto
 */
package marcos;

/**
 * Clase principal que contiene el método main para ejecutar la aplicación.
 */
public class App {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Marcos", 1000.0);

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        cuenta.depositar(500.0);
        System.out.println("Saldo después del depósito: " + cuenta.getSaldo());

        cuenta.retirar(200.0);
        System.out.println("Saldo después del retiro: " + cuenta.getSaldo());
    }
}
