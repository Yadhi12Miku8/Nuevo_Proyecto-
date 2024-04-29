package semana4;
import java.util.Scanner;
/**
 *
 * @author Miguel Huamani Yadhira Aisha 
 */
public class Practica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float precio = obtenerPrecio(scanner);
        float cantidad = obtenerCantidad(scanner);

        float importeCompra = calcularImporteCompra(precio, cantidad);
        float priDescuento = calcularPriDescuento(importeCompra);
        float segDescuento = calcularSegDescuento(importeCompra, priDescuento);
        float descuentoTotal = calcularDescuentoTotal(priDescuento, segDescuento);
        float importePagar = calcularImportePagar(importeCompra, descuentoTotal);

        mostrarResultados(importeCompra, priDescuento, segDescuento, descuentoTotal, importePagar);

        scanner.close();
    }

    public static float obtenerPrecio(Scanner scanner) {
        System.out.print("Ingrese el precio de la camisa: ");
        return Float.parseFloat(scanner.nextLine());
    }

    public static float obtenerCantidad(Scanner scanner) {
        System.out.print("Cantidad de camisas: ");
        return Float.parseFloat(scanner.nextLine());
    }

    public static float calcularImporteCompra(float precio, float cantidad) {
        return precio * cantidad;
    }

    public static float calcularPriDescuento(float importeCompra) {
        return 0.07f * importeCompra;
    }

    public static float calcularSegDescuento(float importeCompra, float priDescuento) {
        return 0.07f *  priDescuento ;
    }

    public static float calcularDescuentoTotal(float priDescuento, float segDescuento) {
        return priDescuento + segDescuento;
    }

    public static float calcularImportePagar(float importeCompra, float descuentoTotal) {
        return importeCompra - descuentoTotal;
    }

    public static void mostrarResultados(float importeCompra, float priDescuento, float segDescuento,
                                         float descuentoTotal, float importePagar) {
        
        System.out.println("Importe de la compra: $" + importeCompra);
        System.out.println("Importe del 1° descuento: $" + priDescuento);
        System.out.println("Importe del 2° descuento: $" + segDescuento);
        System.out.println("Importe del descuento total: $" + descuentoTotal);
        System.out.println("Importe a pagar: $" + importePagar);
    }
}

