package cuentabancaria;
public abstract class CuentaBancaria {
    
    protected int numeroCuenta;
    protected double saldo;

    public CuentaBancaria(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public abstract void depositar(double cantidad);
    public abstract void retirar(double cantidad);
    public abstract void datos();
}
