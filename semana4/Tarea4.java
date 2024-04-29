package semana4;
import java.util.Scanner;
/**
 *
 * @author Miguel Huamani Yadhira Aisha 
 */
public class Tarea4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de horas trabajadas: ");
        float horasTraba = Float.parseFloat(teclado.next());
        
        float salarioPorHora = 10.0f; 
        
        float salarioTotal = 0.0f;
        
        if (horasTraba <= 40.0f) { 
            salarioTotal = horasTraba * salarioPorHora;
        } else { 
            float horasNorm= 40.0f;
            float horasEx= horasTraba - horasNorm;
            
            if (horasEx <= 8.0f) { 
                salarioTotal = (horasNorm * salarioPorHora) + (horasEx * salarioPorHora * 2);
            } else { 
                float horasExtrasDobl = 8.0f;
                float horasExtrasTri= horasEx - horasExtrasDobl;
                
                salarioTotal = (horasNorm * salarioPorHora) + (horasExtrasDobl* salarioPorHora * 2) + (horasExtrasTri* salarioPorHora * 3);
            }
        }
        
        System.out.println("El salario total es: S/. " + salarioTotal);
    }
}
