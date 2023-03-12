import java.util.Scanner;

public class Pattern9 {
    public static void printStars(int a) {
        int py=a;
        int px=a;
        for(int i=1;i<=a;i++){
            for(int j=1;j<a*2;j++){
                if(j==px|| j==py){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            px--;
            py++;
            System.out.println();
        }
        System.out.println("++++++++ New Pattern ++++++++");
        py =a;
        px=a;
        for(int i=1;i<=a;i++){
            for(int j=1;j<a*2;j++){
                if(j==px|| j==py || i==a/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            px--;
            py++;
            System.out.println();
        }
        System.out.println("++++++++ New Pattern ++++++++");
         py=a;
         px=a;
        for(int i=1;i<=a;i++){
            for(int j=1;j<a*2;j++){
                if(j==px|| j==py){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            px--;
            py++;
            System.out.println();
        }
         py=1;
         px=a*2-1;
        for(int i=1;i<=a;i++){
            for(int j=1;j<a*2;j++){
                if(j==px|| j==py){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            px--;
            py++;
            System.out.println();
        }
        System.out.println("++++++++ New Pattern ++++++++");
        py=a;
         px=a;
        for(int i=1;i<=a;i++){
            for(int j=1;j<a*2;j++){
                if(j==px|| j==py||i==a/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            px--;
            py++;
            System.out.println();
        }
         py=1;
         px=a*2-1;
        for(int i=1;i<=a;i++){
            for(int j=1;j<a*2;j++){
                if(j==px|| j==py||i==a/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            px--;
            py++;
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
