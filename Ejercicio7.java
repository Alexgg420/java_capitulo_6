import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int res;
        int col = 3;
        for (int i = 1; i < 15; i++){
            System.out.printf("%4d. |",i);
            if (i == 15){
                col = 1;
            }
            for (int j = 1; j <= col; j++){
                res = (int)(Math.random() * 3) + 1;
                switch (res) {
                    case 1:
                    System.out.print(" 1     |");
                    break;

                    case 2:
                    System.out.print("   X   |");
                    break;

                    case 3:
                    System.out.print("     2 |");
                    break;

                    default:
                }
            }
            System.out.println();
        }
        sc.close();
    }
}