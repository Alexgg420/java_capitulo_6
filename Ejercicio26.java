import java.util.Scanner;
public class Ejercicio26{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura: ");
        int h = sc.nextInt();
        System.out.print("Introduzca la anchura: ");
        int w = sc.nextInt();
        int cont = 1;
        int rh = (int)(Math.random() * h) + 1;
        System.out.println(rh);
        int rw;
        for (int i = 1; i <= h; i++){
            if (rh == 1 || rh == h){
                if (rh == 1){
                    rw = (int)(Math.random() * w) + 1;
                    for (int j = 1; j <= w; j++){
                        if (cont == rw){
                            System.out.print(" ");
                        }
                        else {
                            System.out.print("*");
                        }
                        cont++;
                    }
                }
                if (rh == h){
                    rw = (int)(Math.random() * w) + 1;
                    for (int j = 1; j <= w; j++){
                        if (cont == rw){
                            System.out.print(" ");
                        }
                        else {
                            System.out.print("*");
                        }
                        cont++;
                    }
                }
            }
            else {
                if (i == rh){
                    rw = (int)(Math.random() * 2) + 1;
                    if (rw == 1){
                        for (int j = 1; j <= w; j++){
                            if (j == 1){
                                System.out.print(" ");
                            }
                            else {
                                System.out.print("*");
                            }
                        }
                    }
                    if (rw == 2){
                        for (int j = 1; j < w; j++){
                            System.out.print("*");
                        }
                    }
                }
                else {
                    for (int j = 1; j <= w; j++){
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}