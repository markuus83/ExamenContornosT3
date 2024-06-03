package marcos;

/**
 * Clase principal de la aplicación
 */
public class App {
    public static void main(String[] args) {
        // Crear una nueva cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria("Marcos", 1000.00);
        
        // Añadir 100 al saldo
        cuenta.depositar(100.00);
        
        // Imprimir el saldo por terminal
        System.out.println("Saldo después de añadir 100: " + cuenta.getSaldo());
    }
}
