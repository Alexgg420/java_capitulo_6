import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 20; i++){
            System.out.printf("%d ", (int)(Math.random() * 11));
        }
        sc.close();
    }
}