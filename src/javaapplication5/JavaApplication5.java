package javaapplication5;
import java.util.Scanner;


public class JavaApplication5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del vendedor: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el sueldo mensual: ");
        double sueldoMensual = scanner.nextDouble();

        System.out.print("Ingrese la venta 1: ");
        double venta1 = scanner.nextDouble();

        System.out.print("Ingrese la venta 2: ");
        double venta2 = scanner.nextDouble();

        System.out.print("Ingrese la venta 3: ");
        double venta3 = scanner.nextDouble();

        double comision = (venta1 + venta2 + venta3) * 0.10;
        double pagoTotal = sueldoMensual + comision;

        System.out.println("Resultados:");
        System.out.println("Nombre del vendedor: " + nombre);
        System.out.println("La comisión de la venta es: " + comision);
        System.out.println("El sueldo neto del vendedor es: " + pagoTotal);
    }
    
}
