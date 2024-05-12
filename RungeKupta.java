public class RungeKupta {
    public RungeKupta() {
    }

    //Funcao
    private double funcao(double x, double y) {
        return x + y;
    }

    // Implementando o método de Runge-Kutta de quarta ordem
    public double resolverRungeKupta(double x0, double y0, double h, double xf) {
        double x = x0;
        double y = y0;

        while (x < xf) {
            double k1 = h * funcao(x, y);
            double k2 = h * funcao(x + h / 2.0, y + k1 / 2.0);
            double k3 = h * funcao(x + h / 2.0, y + k2 / 2.0);
            double k4 = h * funcao(x + h, y + k3);

            y += (k1 + 2.0 * k2 + 2.0 * k3 + k4) / 6.0;
            x += h;
        }
        return y;
    }
}
