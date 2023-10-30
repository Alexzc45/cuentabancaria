package cuentabancaria;
import java.util.Scanner;
public class CuentaDeAhorros extends CuentaBancaria {
    Scanner z=new Scanner(System.in);
    private double tasaInteres;

    public CuentaDeAhorros(int numeroCuenta, double saldo,double tasaInteres) {
        super(numeroCuenta, saldo);
        this.tasaInteres = tasaInteres;
    }
    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    public double getTasaInteres() {
        return tasaInteres;
    }
    @Override
    public void depositar(double cantidad) {
        System.out.println("Ingrese la cantidad a depositar");
        cantidad=z.nextDouble();
        saldo += cantidad;
        System.out.println("Depósito de ( " + cantidad + " ) su saldo actual es de: " + saldo);
    }
    @Override
    public void retirar(double cantidad) {
        System.out.println("Ingrese la cantid a retirar");
        cantidad = z.nextDouble();
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro de ( " + cantidad + " ) su saldo actual es de: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    @Override
    public void datos(){
        System.out.println("Su saldo actual es de: "+this.saldo);
    }
}
