package JavaTest;
import java.util.Arrays;

public class SortArray {


    public static void main(String[] args) {

        int[] a = {12,45,2,5,7};

        Arrays.sort(a);

        for(int i : a) {
            System.out.print(i + " ");
        }
    }
}