

public class Pattern2 {
    public static void prinstar(int a)
    {
        char ch = 'A';
        for(int i=1;i<=a;i++){
            for(int j=a;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Print Number");
        for(int i=1;i<=a;i++){
            for(int j=a;j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i=1;i<=a;i++){
            for(int j=a;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=1;i<=a;i++){
            for(int j=a;j>=i;j--){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        char c='A';
        for(int i=1;i<=a;i++){
            for(int j=a;j>=i;j--){
                System.out.print(c);
            }
            System.out.println();
            c++;
        }
        
    }
    public static void main(String[] args) {
        int  a= 5;
        prinstar(a);
        
    }
    
}
