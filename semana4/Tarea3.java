package semana4;
import java.util.Scanner;
/**
 *
 * @author Miguel Huamani Yadhira Aisha 
 */
public class Tarea3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Seleccione el tipo de auto");
        System.out.println("1. Pequeño");
        System.out.println("2. Mediano");
        System.out.println("3. Grande");
        System.out.print("Ingrese su opcion: ");
        float tipoAuto = Float.parseFloat(teclado.next());
        
        System.out.print("Ingrese la cantidad de kilometros recorridos por dia: ");
        float kmRecorridos = Float.parseFloat(teclado.next());
        
        float tarifaBase = 0;
        float costoPorKm = 0;
        
        if (tipoAuto == 1.0f) { 
            tarifaBase = 15.00f;
            costoPorKm = 0.20f;
        } else if (tipoAuto == 2.0f) { 
            tarifaBase = 20.00f;
            costoPorKm = 0.30f;
        } else if (tipoAuto == 3.0f) { 
            tarifaBase = 30.00f;
            costoPorKm = 0.40f;
        } else {
            System.out.println("Opcion de auto no valida.");
            return;
        }
        
        float costoTotal = tarifaBase + (kmRecorridos * costoPorKm);
        
        if (kmRecorridos > 10.0f) {
            costoTotal *= 1.025f; 
        }
        
        System.out.println("El costo total del alquiler es: S/. " + costoTotal);
    }
}
