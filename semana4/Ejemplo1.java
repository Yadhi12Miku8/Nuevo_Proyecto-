
package semana4;
import java.util.Scanner;
public class Ejemplo1 {
    public static void main(String[] args) {
        float num;
        num = leerNumero ();
        valorAbsoluto(num);
    }
    static float leerNumero(){
        Scanner teclado =new Scanner (System.in);
        float num;
        System.out.print("Ingrese un numero :");
        num =  Float.parseFloat(teclado.next());
        return num;
    }
    static void valorAbsoluto(float num){
        if (num < 0){
            num = num *-1;
        }
        System.out.println("El valor absoluto es : "+num);
    }
}
