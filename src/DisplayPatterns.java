import java.util.Scanner;

public class DisplayPatterns {

    public static void main(String[]args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=input.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.printf("%d",k);
            }
           System.out.println("");
        }

    }
}


