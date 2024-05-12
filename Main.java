public class Main {
    public static void main(String[] args) throws Exception {
        double resultado;

        double x0 = 0; // Valor inicial de x
        double y0 = 1; // Valor inicial de y
        double h = 10; // Tamanho do passo
        double xf = 1; // Valor final de x

        //Resolve a equação de três formas diferentes
        Euler euler = new Euler();
        resultado = euler.resolverEuler(x0, y0, h, xf);
        System.out.println("Resultado usando o método de Euler: " + resultado);

        EulerModificado eulerModificado = new EulerModificado();
        resultado = eulerModificado.resolverEulerModificado(x0, y0, h, xf);
        System.out.println("Resultado usando o método de Euler Modificado: " + resultado);

        RungeKupta rungeKupta = new RungeKupta();
        resultado = rungeKupta.resolverRungeKupta(x0, y0, h, xf);
        System.out.println("Resultado usando o método de Runge-Kupta: " + resultado);
    }
}