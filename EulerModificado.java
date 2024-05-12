public class EulerModificado {
    public EulerModificado() {
    }

    //Funcao
    private double funcao(double x, double y) {
        return x + y;
    }

    // Implementando o método de Euler Modificado
    public double resolverEulerModificado(double x0, double y0, double h, double xf) {
        double x = x0;
        double y = y0;
        
        while (x < xf) {
            double k1 = funcao(x, y);
            double k2 = funcao(x + h, y + h * k1);
            
            y += (h / 2.0) * (k1 + k2);
            x += h;
        }
        
        return y;
    }
}
