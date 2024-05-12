public class EulerModificado {
    private double x0;
    private double y0;
    private double h;
    private double xf;
    
    public EulerModificado(double x0, double y0, double h, double xf) {
        this.x0 = x0;
        this.y0 = y0;
        this.h = h;
        this.xf = xf;
    }

    // Ser alterado para solucionar qualquer equação
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
