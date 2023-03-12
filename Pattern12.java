
public class Pattern12 {

    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j >= 5 - i && j <= 3 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("+++++++++++ Pattern Program +++++++++++");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j >= i && j <= 8 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("+++++++++++ Pattern Program +++++++++++");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j <= 8 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("+++++++++++ Pattern Program +++++++++++");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 8; j++) {
                if (j >= 5 - i && j <= 9 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("+++++++++++ Pattern Program +++++++++++");

        int p = 5;
        int x = p;

        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <2 * p; j++) {
                if (j == x || j == p + i - 1) {
                    System.out.print("*");
                } else if (j >= x && j <= p + i - 1 && i == p / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            x--;
        }
        
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}