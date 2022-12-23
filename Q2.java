import java.util.Arrays;

public class Q2 {

    public static void main(String[] args) {
        int[]s={1,2,3,4,5,6};
        int[] copy={2,3,3,5,4,5};
        System.arraycopy(s,0,copy,0,s.length);
        System.out.println("Array: "+ Arrays.toString(s));
        System.out.print("copy: ");
        for(int i:copy)

            System.out.print(i+"  ");

}
    }