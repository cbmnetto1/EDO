import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        double resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor inicial de X: ");
        double x0 = sc.nextDouble(); // Valor inicial de x

        System.out.println("Valor inicial de Y: ");
        double y0 = sc.nextDouble(); // Valor inicial de y

        System.out.println("Tamanho do passo: ");
        double h = sc.nextDouble(); // Tamanho do passo

        System.out.println("Valor final de X: ");
        double xf = sc.nextDouble(); // Valor final de x

        //Resolve a equação de três formas diferentes
        Euler euler = new Euler(x0, y0, h, xf);
        resultado = euler.resolverEuler(x0, y0, h, xf);
        System.out.println("Resultado usando o método de Euler: " + resultado);

        EulerModificado eulerModificado = new EulerModificado(x0, y0, h, xf);
        resultado = eulerModificado.resolverEulerModificado(x0, y0, h, xf);
        System.out.println("Resultado usando o método de Euler Modificado: " + resultado);

        RungeKupta rungeKupta = new RungeKupta(x0, y0, h, xf);
        resultado = rungeKupta.resolverRungeKupta(x0, y0, h, xf);
        System.out.println("Resultado usando o método de Runge-Kupta: " + resultado);
    }
}

/*BufferedReader reader = new BufferedReader(new FileReader("Codigo2"));
colocar dps
*/