import java.util.Scanner;
public class Ejercicio30{
    public static void main(String[] ars){
        Scanner sc = new Scanner(System.in);
        System.out.print("Altura de la pecera: ");
        int h = sc.nextInt();
        if (h < 4){
            System.out.println("La altura mínima es 4");
        }
        else {
            System.out.print("Anchura de la pecera: ");
            int w = sc.nextInt();
            if (w < 4){
                System.out.println("La anchura mínima es 4");
            }
            else {
                // borde superior
                for (int i = 0; i < w; i++){
                    System.out.print("* ");
                }
                System.out.println();
                // parte central
                // variables de posición para los tres peces (x, y)
                int n1 = (int)(Math.random() * (h - 2) + 1);
                int n2 = (int)(Math.random() * (h - 2) + 1);
                int n3 = (int)(Math.random() * (h - 2) + 1);
                int n11 = (int)(Math.random() * (w - 2) + 1);
                int n22 = (int)(Math.random() * (w - 2) + 1);
                int n33 = (int)(Math.random() * (w - 2) + 1);
                // evitar que los peces se encuentren en la misma posición
                if (n1 == n2 && n11 == n22){
                    do {
                        n2 = (int)(Math.random() * (h - 2) + 1);
                        n22 = (int)(Math.random() * (w - 2) + 1);
                    } while (n1 == n2 && n11 == n22);
                }
                if ((n3 == n1 && n33 == n11) || (n3 == n2 && n33 == n22)){
                    do {
                        n3 = (int)(Math.random() * (h - 2) + 1);
                        n33 = (int)(Math.random() * (w - 2) + 1);
                    } while ((n3 == n1 && n33 == n11) || (n3 == n2 && n33 == n22));
                }
                // altura de la parte central
                for (int i = 1; i < (h - 1); i++){
                    System.out.print("* ");
                    // interior con peces
                        for (int j = 1; j < (w - 1); j++){
                            if (i == n1 && j == n11){
                                System.out.print("& ");
                            }
                            else if (i == n2 && j == n22){
                                System.out.print("$ ");
                            }
                            else if (i == n3 && j == n33){
                                System.out.print("@ ");
                            }
                            else {
                                System.out.print("  ");
                            }
                        }
                    System.out.println("*");
                }
                // borde inferior
                for (int i = 0; i < w; i++){
                    System.out.print("* ");
                }
            }
        }
        sc.close();
    }
}