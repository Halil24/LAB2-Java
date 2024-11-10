public class variableNrOfArgs {
    public static void main(String[] args) {
        System.out.println("maximum is "+max(2,3,4,5,6,7));
        System.out.println("maximum is "+max(2,3,4,5,6,7,8,9));
        System.out.println("minimum is "+min(2,3,4,5,6,7));
        System.out.println("minimum is "+min(2,3,4,5,6,7,8,9));
    }

    public static int min(int...n) {
        if(n.length==0) return -1;

        int min=Integer.MAX_VALUE;

        for(int e:n) {
            min=Math.min(min,e);

        }
        return min;
    }

    public static int max(int...n) {
        if(n.length==0) return -1;

        int max=Integer.MIN_VALUE;

        for(int e:n) {
            max=Math.max(max,e);

        }
        return max;
    }
}
