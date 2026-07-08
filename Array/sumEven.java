package Array;
public class sumEven{
    
    public static int sumEven(int [] arr){
        // Write a function public static int sumEven(int[] arr) to find the sum of even numbers in an array.
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        } return sum;
    }
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println(sumEven(arr));
    }
}