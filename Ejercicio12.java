import java.util.Scanner;
public class Ejercicio12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < (10000); i++){
            System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
        }
        sc.close();
    }
}