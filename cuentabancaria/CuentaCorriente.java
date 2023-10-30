package cuentabancaria;
import java.util.Scanner;
public class CuentaCorriente extends CuentaBancaria{
    Scanner sc = new Scanner(System.in);
    private double limiteDescubierto;

    public CuentaCorriente(int NumeroDeCuenta, double Saldo, double limiteDescubierto ) {
        super(NumeroDeCuenta, Saldo);
        this.limiteDescubierto = limiteDescubierto;
    }
    public void setLimiteDescubierto(double limiteDescubierto) {
        this.limiteDescubierto = limiteDescubierto;
    }
    public double getLimiteDescubierto() {
        return limiteDescubierto;
    }
    @Override
    public void depositar(double cantidad) {
        System.out.println("ingrese la cantidad a depositar");
        cantidad = sc.nextDouble();
        saldo += cantidad;
        System.out.println("Depósito de ( " + cantidad + " ) su saldo actual es de: " + saldo);
    }
    @Override
    public void retirar(double cantidad) {
        System.out.println("ingrese la cantidad a retirar");
        cantidad = sc.nextDouble();
        if (saldo + limiteDescubierto >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro de ( " + cantidad + " ) su saldo aldo actual es de: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }  
    }
    @Override
    public void datos(){
        System.out.println("su saldo actual es de: "+this.saldo);
    }
}
      

