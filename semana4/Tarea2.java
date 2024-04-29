package semana4;
import java.util.Scanner;
/**
 *
 * @author Miguel Huamani Yadhira Aisha 
 */
public class Tarea2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de soles a cambiar: ");
        float soles = Float.parseFloat(teclado.next());
        
        System.out.println("Seleccione la moneda a la que desea cambiar:");
        System.out.println("1. dolar");
        System.out.println("2. euro");
        System.out.println("3. marco");
        System.out.println("4. yen");
        System.out.print("Ingrese su opcion: ");
        float opcion = Float.parseFloat(teclado.next());
        
        float resultado = 0;
        
        if (opcion == 1.0f) { 
            resultado = soles / 3.30f;
            System.out.println("El equivalente en dolares es: " + resultado);
        } else if (opcion == 2.0f) { 
            resultado = soles / 3.57f;
            System.out.println("El equivalente en euros es: " + resultado);
        } else if (opcion == 3.0f) { 
            resultado = soles / 1.83f;
            System.out.println("El equivalente en marcos es: " + resultado);
        } else if (opcion == 4.0f) { 
            resultado = soles / 0.03f;
            System.out.println("El equivalente en yenes es: " + resultado);
        } else {
            System.out.println("Opción no válida.");
        }
    }
}
