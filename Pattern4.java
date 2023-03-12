import java.util.Scanner;

public class Pattern4 {
    public static void printStars(int n)
    {
        for(int i = n;i>=1;i--){
            for(int j =n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("++++++++++ New Pattern ++++++++++");
        for(int i = n;i>=1;i--){
            for(int j =n-1;j>=i;j--){
                System.out.print("#");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("++++++++++ New Pattern ++++++++++");

        for(int i = n;i>=1;i--){
            for(int j =n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("++++++++++ New Pattern ++++++++++");
        for(int i = n;i>=1;i--){
            for(int j =n-1;j>=i;j--){
                System.out.print("#");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print("#");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter any number ");
            int n = sc.nextInt();
            printStars(n);
        }
    }
    
}
