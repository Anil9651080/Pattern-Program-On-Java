
public class Pattern7
{
    // Function to demonstrate printing pattern
    public static void printStars(int n)
    {
        for(int i = n;i>=1;i--){
            for(int j =n-1;j>=i;j--){
                System.out.print("#");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print("#");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
 
    // Driver Function
    public static void main(String args[])
    {
        int n = 5;
        printStars(n);
    }
}