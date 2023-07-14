import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int [] arr =  {6, 17, 92, 32, 58, 22, 84, 66, 36, 33} ;
        int i = Arrays.binarySearch(arr, 33);
        Arrays.sort(arr);
        //System.out.println("sort:" + arr.toString());
        System.out.println("sort2:" + Arrays.toString(arr));
        int j = Arrays.binarySearch(arr, 33);
        System.out.println("i" + i +",j:"+ j);


    }
}

