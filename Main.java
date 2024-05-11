import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        double x0 = 0; // Valor inicial de x
        double y0 = 1; // Valor inicial de y
        double h = 0.1; // Tamanho do passo
        double xf = 1; // Valor final de x
        Euler euler = new Euler(x0, y0, h, xf);
        
        double resultado = euler.resolverEuler(x0, y0, h, xf);

        System.out.println("Resultado usando o método de Euler: " + resultado);
    }
}

/*BufferedReader reader = new BufferedReader(new FileReader("Codigo2"));
colocar dps
*/