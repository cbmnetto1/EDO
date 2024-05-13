public class Main {
    public static void main(String[] args) throws Exception {
        //condicoes iniciais
        double x0 = 0;
        double y0 = 1;
        double h = 0.2; //passo

        //valor que quer se aproximar
        double x = 2;
        
        //Resolve a equação de três formas diferentes
        Euler(x0,y0,h,x);
        EulerModificado(x0,y0,h,x);
        RungeKutta(x0,y0,h,x);
    }

    static double funcao(double x, double y) {
        return ((x - y)/2);
    }

    static void Euler(double x0, double y, double h, double x) {
        // Iterar ate onde tem a aproximacao
        while (x0 < x) {
            y = y + h * funcao(x0, y);
            x0 = x0 + h;
        }

        System.out.println("Usando o método de Euler: " + y);
    }

    static void EulerModificado(double x0, double y, double h, double x) {
        while (x0 < x) {
            double inclinacao1 = funcao(x, y); // Inclinação no ponto atual
            double inclinacao2 = funcao(x0 + h, y + inclinacao1 * h); // Inclinação no próximo ponto

            y = y + (h/2) * (inclinacao1+inclinacao2);
            x0 = x0 + h;
        }
        System.out.println("Usando o método de Euler Modificado: " + y);
    }

    static void RungeKutta(double x0, double y, double h, double x) {
        //num interacoes
        int n = (int)((x - x0) / h);
        
        /*k1 é a inclinação no ponto atual (x0, y).
        k2 é a inclinação no ponto médio (x0 + 0.5 * h, y + 0.5 * k1).
        k3 é a inclinação no ponto médio do próximo intervalo (x0 + 0.5 * h, y + 0.5 * k2).
        k4 é a inclinação no próximo ponto (x0 + h, y + k3) */
        double k1, k2, k3, k4;

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

        System.out.println("Usando o método de Runge-Kutta: " + y);
    }
}