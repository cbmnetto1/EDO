public class Main {
    public static void main(String[] args) throws Exception {
        double resultado;

        double x0 = 0; // condicao inicial
        int n = 0; //numero de iterações
        double tf = 0; //tempo final
        

        //Resolve a equação de três formas diferentes
        Euler(x0,n,tf);
        EulerModificado(x0,n,tf);
        RungeKupta(x0,n,tf);
    }

    public static void Euler(double x0, int n, double tf) {
        double h = (tf-0)/n; //inclinacao
        double[] t = new double[n+1];
        double[] x = new double[n+1];

        t[0] = 0;
        x[0] = x0;

        for (int i = 0; i < n; i++) {
            double f = x[i];
            t[i + 1] = t[i] + h;
            x[i + 1] = x[i] + h * f;
        }

        System.out.println("Pontos (t(i), x(i)):");

        for (int i = 0; i <= n; i++) {
            System.out.println("(" + t[i] + ", " + x[i] + ")");
        }
    }
}