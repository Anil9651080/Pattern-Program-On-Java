import java.util.Scanner;

public class Pattern11 {
    public static void prinstar(int a)
    {
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(j<=i){
                System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("+++++++++++ New Pattern +++++++++");
        int n=a;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j>=6-i){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("+++++++++++ New Pattern +++++++++");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j>=6-i){
                System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("+++++++++++ New Pattern +++++++++");
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("+++++++++++ New Pattern +++++++++");
        for(int i=1;i<=a;i++){
            for(int j=1;j<=9;j++){
                if(j>=6-i && j<=4+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("+++++++++++ New Pattern +++++++++");
        for(int i=1;i<=a;i++){
            for(int j=1;j<=9;j++){
                if(j>=6-i && j<=4+i ){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter any number");
        int a = sc.nextInt();
        prinstar(a);
    }
    }
    
}
