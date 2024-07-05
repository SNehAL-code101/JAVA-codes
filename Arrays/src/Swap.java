import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
       int[] arr = {1,2,4,6,8};
       swap(arr, 0, 4);
        System.out.println("Swapping array is: " + Arrays.toString(arr));


    }

    static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}