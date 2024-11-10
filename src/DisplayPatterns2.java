import java.util.Scanner;

public class DisplayPatterns2 {

    public static void main(String[]args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=input.nextInt();
int length=0;
        for (int i = 1; i <=n ; i++) {

            for (int j = n; j>i; j--) {
                length=String.valueOf(j).length();
                System.out.print(" ".repeat(length)+" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}

