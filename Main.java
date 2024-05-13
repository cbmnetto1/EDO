public class Main {
    public static void main(String[] args) throws Exception {
        //condicoes iniciais
        double x0 = 0;
        double y0 = 1;
        double h = 0.025; //passo

        //valor que quer se aproximar
        double x = 0.1;
        
        //Resolve a equação de duas formas diferentes
        Euler(x0,y0,h,x);
        RungeKutta(x0,y0,h,x);
    }

    static double funcao(double x, double y) {
        return (x + y + x * y);
    }

    static void Euler(double x0, double y, double h, double x) {
        // Iterar ate onde tem a aproximacao
        while (x0 < x) {
            y = y + h * funcao(x0, y);
            x0 = x0 + h;
        }

        System.out.println("O valor de Y quando X = " + x + " é " + y);
    }

    static void RungeKutta(double x0, double y0, double h, double x) {
        //num interacoes
        int n = (int)((x - x0) / h);
        double k1, k2, k3, k4;
        double y = y0;

        for (int i = 0; i < n; i++) {
            //Achar o proximo valor de y
            k1 = h * (funcao(x0, y));
            k2 = h * (funcao(x0 + 0.5 * h, y + 0.5 * k1));
            k3 = h * (funcao(x0 + 0.5 * h, y + 0.5 * k2));
            k4 = h * (funcao(x0 + h, y + k3));
 
            //Atualiza y
            y = y + (1.0 / 6.0) * (k1 + 2 * k2 + 2 * k3 + k4);
             
            //Atualiza x
            x0 = x0 + h;
        }

        System.out.println("O valor de Y quando X = " + x + " é " + y);
    }
}