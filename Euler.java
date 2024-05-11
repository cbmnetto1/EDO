public class Euler {
    private double x0;
    private double y0;
    private double h;
    private double xf;

    public Euler(double x0, double y0, double h, double xf) {
        this.x0 = x0;
        this.y0 = y0;
        this.h = h;
        this.xf = xf;
    }

    // Ser alterado para solucionar qualquer equação
    private double funcao(double x, double y) {
        return x + y;
    }

    // Implementando o método de Euler
    public double resolverEuler(double x0, double y0, double h, double xf) {
        double x = x0;
        double y = y0;
        
        while (x < xf) {
            y += h * funcao(x, y);
            x += h;
        }
        
        return y;
    }
}
