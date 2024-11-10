import java.util.Scanner;

public class geometry2circles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r1 = input.nextInt();
        int r2 = input.nextInt();
        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int y1 = input.nextInt();
        int y2 = input.nextInt();

testTwoCircles(r1, x1, y1, r2, x2, y2);
    }
    public static void testTwoCircles(int r1, int x1, int y1, int r2, int x2, int y2) {
        double distance=0;
        double distanceSum=Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
    distance=Math.sqrt(distanceSum);
       double diffR=r1-r2;
        double sumR=r1+r2;
        if (diffR<0){
            diffR=diffR*(-1);
        }
        if (diffR>=distance){
            System.out.println("Circle 2 is inside circle 1");
        }else if (sumR>=distance){
            System.out.println("Circle 2 overlaps circle 1");
        }else{
            System.out.println("Circles neither overlap nor are inside each other");
        }
    }
}


