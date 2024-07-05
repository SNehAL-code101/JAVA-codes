public class _1LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 7, 56, 45, 12, 8, 67};
        linearSearch(arr);
    }

    static void linearSearch(int[] arr){
//        int start = 0;
//        int end = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            int pointer = 0;
            if(arr[i]== 45){

                System.out.println("Number found at index: " + i);
                break;
            }else {
                pointer++;
               System.out.println("number not present in the array");
            }
            System.out.println("number not present in the array");
        }
    }
}
