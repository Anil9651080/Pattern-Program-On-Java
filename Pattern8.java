import java.util.Scanner;

public class Pattern8 {
    public static void printStars(int a) {
        for (int i = a; i >= -a; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("&");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("++++++++ New Pattern ++++++++");
        for(int i =a;i>=-a;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k =a;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter any number");
            int a = sc.nextInt();
            printStars(a);
        }

    }
}
