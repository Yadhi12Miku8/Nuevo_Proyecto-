package semana4;
import java.util.Scanner;
/**
 *
 * @author Miguel Huamani Yadhira Aisha 
 */
public class Tarea1 {
    public static void main(String[] args) {
        float num1, num2, num3;
        num1 = leerNumero();
        num2 = leerNumero();
        num3 = leerNumero();
        
        float mayor = hallarMayor(num1, num2, num3);
        float menor = hallarMenor(num1, num2, num3);
        float intermedio = hallarIntermedio(num1, num2, num3, mayor, menor);
        
        imprimir(mayor, menor, intermedio);
    }

    static float leerNumero() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        return Float.parseFloat(teclado.next());
    }

    static float hallarMayor(float num1, float num2, float num3) {
        float mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        return mayor;
    }

    static float hallarMenor(float num1, float num2, float num3) {
        float menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        return menor;
    }

    static float hallarIntermedio(float num1, float num2, float num3, float mayor, float menor) {
        float intermedio = num1;
        if (num2 > menor && num2 < mayor) {
            intermedio = num2;
        }
        if (num3 > menor && num3 < mayor) {
            intermedio = num3;
        }
        return intermedio;
    }

    static void imprimir(float mayor, float menor, float intermedio) {
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero intermedio es: " + intermedio);
    }
}
