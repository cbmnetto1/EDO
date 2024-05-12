public class Euler {
    public Euler() {
    }

    //Funcao
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
