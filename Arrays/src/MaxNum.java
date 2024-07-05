public class MaxNum {
    public static void main(String[] args) {
        int[] arr = {1, 56, 78, 3333, 897};
        System.out.println("Max value in array is: " + maxNumber((arr)));
        System.out.println("Max value from specified range array is: " + maxRange(arr, 0, 3));
    }

    static int maxNumber(int[] array) {
        int maxVal = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i]> maxVal ){
                maxVal = array[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] array, int start, int end) {
        int maxVal = array[0];
        for(int i = start; i < end; i++) {
            if(array[i]> maxVal ){
                maxVal = array[i];
            }
        }
        return maxVal;
    }

}