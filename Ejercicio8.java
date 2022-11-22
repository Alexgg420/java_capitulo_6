import java.util.Scanner;
public class Ejercicio8{
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
                res = (int)(Math.random() * 6) + 1;
                switch (res) {
                    case 1:
                    case 2:
                    case 3:
                    System.out.print(" 1     |");
                    break;

                    case 4:
                    case 5:
                    System.out.print("   X   |");
                    break;

                    case 6:
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