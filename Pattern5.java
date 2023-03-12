import java.util.Scanner;

public class Pattern5 {
    public static void printStars(int n)
    {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==3 || j==3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("++++++++++ New Pattern ++++++++++");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==3 || j==3){
                    System.out.print("#");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        System.out.println("++++++++++ New Pattern ++++++++++");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("++++++++++ New Pattern ++++++++++");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==3 || j==3 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("++++++++++ New Pattern ++++++++++");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=n;j>=n;j--){
                if(i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }


    }
 
    // Driver Function
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter any number ");
            int n = sc.nextInt();
            printStars(n);
        }
    }
    
}
