

public class Pattern10 {
    public static void prinstar(int a)
    {
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(i==j||i+j==a+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("++++++++ New Pattern ++++++++");
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(i==j){
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
        int  a= 10;
        prinstar(a);
        
    }
    
}
