/*
 * Todo en Funciones
 * Isaac Haro, Daniel Arcos, Martin Guerra, Mateo Lincango y Rubens Alarcon*
 */
package ecuación.cuadráticav2;

import java.util.Scanner;

/*
 * Todo en el Main
 * Isaac Haro, Daniel Arcos, Martin Guerra, Mateo Lincango y Rubens Alarcon*
 */
public class EcuaciónCuadráticav2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while(true){
            int a,b,c;
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese su Ecuación Cuadrática ax^2+bx+c");
            System.out.println("Ingrese a");
            a=sc.nextInt();
            System.out.println("Ingrese b");
            b=sc.nextInt();
            System.out.println("Ingrese c");
            c=sc.nextInt();
            System.out.println("X1= " +x1(Raiz(a,b,c),a,b));
            System.out.println("X2= " +x2(Raiz(a,b,c),a,b));
            if(Math.pow(b, 2)-(4*a*c)<0){
                System.out.println("Su raíz es imaginaria, FIN DEL PROGRAMA, compile nuevamente para hacer");
                break;
            }
        }
    }
    private static double Raiz(int a, int b, int c) {
        double raiz1;
        raiz1=Math.sqrt(Math.pow(b, 2)-(4*a*c));
        return raiz1;
    }
    private static double x1(double raiz1,int a, int b) {
        double x1;
        x1=((-b+raiz1)/(2*a));
        return x1;
    }
    private static double x2(double raiz1,int a, int b) {
        double x2;
        x2=((-b-raiz1)/(2*a));
        return x2;
    }
    
    
}
