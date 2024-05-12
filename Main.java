public class Main {
    public static void main(String[] args) throws Exception {
        double resultado;

        //condicoes iniciais
        double x0 = 0;
        double y0 = 1;
        double h = 0.025; //passo

        //valor que quer se aproximar
        double x = 0.1;
        

        //Resolve a equação de três formas diferentes
        Euler(x0,y0,h,x);
        //EulerModificado(x0,n,tf);
        //RungeKupta(x0,n,tf);
    }

    // dy/dx=(x + y + xy)
    static double funcao(double x, double y) {
        return (x + y + x * y);
    }

    static void Euler(double x0, double y, double h, double x) {
        double temp;

        // Iterar ate onde tem a aproximacao
        while (x0 < x) {
            temp = y;
            y = y + h * funcao(x0, y);
            x0 = x0 + h;
        }
 
        // Printing approximation
        System.out.println("Solução aproximada quando X = " + x + " é " + y);
    }
}