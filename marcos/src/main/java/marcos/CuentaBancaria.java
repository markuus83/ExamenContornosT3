package marcos;


/**
 * Establecemos la clase CuentaBancaria con sus atributos: titular y saldo
 */
public class CuentaBancaria {

    private String titular; // titular de la cuenta bancaria
    private double saldo; // saldo de la cuenta bancaria

    /**
     * Metodo constructor de la clase CuentaBancaria
     * 
     * @param titular de la cuenta bancaria
     * @param saldoInicial de la cuenta bancaria
     */
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    /**
     * Metodo que devuelve el nombre del titular de la cuenta bancaria
     * 
     * @return titular de la cuenta bancaria
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Metodo que devuelve el saldo de la cuenta bancaria
     * 
     * @return saldo de la cuenta bancaria
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo que establece la cantidad adecuada a DEPOSITAR en la cuenta bancaria
     * 
     * @param cantidad a depositar en la cuenta bancaria
     * @throws IllegalArgumentException cuando la cantidad es menor que 0
     */
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            throw new IllegalArgumentException("La cantidad a depositar debe ser mayor que cero.");
        }
    }

    /**
     * Metodo que establece la cantidad adecuada a RETIRAR en la cuenta bancaria
     * 
     * @param cantidad a retirar en la cuenta bancaria
     * @throws IllegalArgumentException cuando la cantidad a retirar es mayor que el saldo de la cuenta o menor que 0
     */
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            throw new IllegalArgumentException("No se puede retirar la cantidad especificada.");
        }
    }
}