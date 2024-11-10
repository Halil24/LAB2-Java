import java.util.Scanner;

public class AverageArray {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("The average for double is: "+ average(new double[] {2.3, 5.4, 6.3, 8.2, 9.4}));
        System.out.println("The average for int is: "+ average(new int [] {1, 2, 3, 4, 5}));

    }
    public static double average(double[] array) {
        if (array.length == 0) return -1;
        double sum = 0;

        for (double e: array) {
            sum+=e;


        }
        return sum/array.length;
    }

    public static int average(int[] array) {
        if (array.length == 0) return -1;
        int sum = 0;
        for (int e: array) {
            sum+=e;
        }
        return sum/array.length;
    }
}



