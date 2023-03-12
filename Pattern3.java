import java.util.Scanner;

public class Pattern3 {
    public static void printstar(int a){
        for(int i=1;i<=a;i++){
            for(int j=a-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("++++++new pattern ++++++");
        for(int i=1;i<=a;i++){
            for(int j=a-1;j>=i;j--){
                System.out.print("@");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("++++++new pattern ++++++");
        for(int i=1;i<=a;i++){
            for(int j=a-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("++++++new pattern ++++++");
        for(int i=1;i<=a;i++){
            for(int j=a-1;j>=i;j--){
                System.out.print("@");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter any number");
           int a = sc.nextInt();
           printstar(a);
    } 
    }
    
}
