import java.util.*;

public class Array {
    public static void main(String[] args) {
        System.out.println("Array Java");

        int[] arr1 = {1,2,3,4,5};
        System.out.println("arr1 : "+Arrays.toString(arr1));

        List<Boolean> arr2 = new ArrayList<Boolean>();
        arr2.add(true);
        arr2.add(false);
        arr2.remove(0);

        System.out.println("arr2 : "+arr2);
    }
}