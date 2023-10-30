package cuentabancaria;
import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
    
        Scanner d = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Ingrese su numero de cuenta");
        int nc = d.nextInt();
        System.out.println("BIENVENIDO A SU CUENTA CORRIENTE");
    
        CuentaCorriente cuentaCorriente = new CuentaCorriente(nc, 1000, 200);
        cuentaCorriente.datos();
        cuentaCorriente.depositar(1000);
        cuentaCorriente.retirar(1000);
        System.out.println("------------------------------");        
        d.nextLine();
        System.out.println("Ingrese su numero de cuenta");
        int a = d.nextInt();
        System.out.println("BIENVENIO A SU CUENTA DE AHORROS");
        CuentaDeAhorros cuentaAhorros = new CuentaDeAhorros(a, 100, 5);      
        cuentaAhorros.datos();
        cuentaAhorros.depositar(100);
        cuentaAhorros.retirar(100);
        System.out.println("------------------------------");
    
    } 
}
