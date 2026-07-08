package Array;
public class findMax {
    public static int findMax(int [] arr){
        // Write a function public static int findMax(int[] arr) to find the maximum value of an array.
        int max = Integer.MIN_VALUE; 
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        } return max;
    }
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println(findMax(arr));
    }
}
