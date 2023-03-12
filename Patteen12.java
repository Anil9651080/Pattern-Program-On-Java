import java.util.Scanner;

public class Patteen12 {
    public static void prinstar(int n){
       for(int i =1;i>=1;i--){
        for(int j=1;j<=n-1;j++){
            System.out.print(" ");
        }
        System.out.println();
       }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter any number");
            int n = sc.nextInt();
            prinstar(n);
        }
        
    }
}
