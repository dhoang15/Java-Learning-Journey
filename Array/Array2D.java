package Array;
// Write a function to add two matrices of the same size.
// • Write a function to multiply two matrices.
// • Write a function to print a matrix to screen in matrix format.
// • Write a main function and run all the above functions
public class Array2D {
    public static void main(String[] args){
        int[][] arr1 = {{1,2,3},{2,4,5}};
        int[][] arr2 = {{2,3,4},{3,4,5}};
        for(int i = 0; i<arr1.length;i++){
            for(int j = 0; j<arr1[i].length;j++){
                System.out.print(arr1[i][j] + arr2[i][j] + " "); 
                System.out.print(arr1[i][j] * arr2[i][j] + " "); 
            }
            System.err.println();
        }       
    }
    }
