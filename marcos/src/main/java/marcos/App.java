package marcos;

/**
 * Clase principal de la aplicación
 */
public class App {
    public static void main(String[] args) {
        // Crear una nueva cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria("Marcos", 1000.00);
        
        // Mostrar el saldo inicial
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: " + cuenta.getSaldo());
        
        // Realizar un depósito
        cuenta.depositar(500.00);
        System.out.println("Saldo después del depósito: " + cuenta.getSaldo());
        
        // Realizar un retiro
        cuenta.retirar(200.00);
        System.out.println("Saldo después del retiro: " + cuenta.getSaldo());
        
        // Intentar retirar una cantidad mayor al saldo
        try {
            cuenta.retirar(1500.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
