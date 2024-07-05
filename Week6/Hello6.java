package Week6;

import java.util.ArrayList;
import java.util.Collections;

public class Hello6 {
    public static void main(String[] args) {
        // 1. Write code that creates an ArrayList that can hold string objects. Add the names of three cars to the ArrayList, and then display the contents of the ArrayList.
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Bugatti");
        cars.add("Ferrari");
        for(String x: cars){
            System.out.println(x);
        }
        // 2. WAP to sort the integer elements of array of size 10 in ascending and descending order using ArrayList.
        int[] nums = new int[10];
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int x: nums){
            arrList.add(x);
        }
        Collections.sort(arrList);
        System.out.println(arrList);

        Collections.sort(arrList, Collections.reverseOrder());
        System.out.println("Dec: "+arrList);
    }
     // 1. Write a Java program to calculate the average value of array element.
        public int findAvg(int arr[]) {
           int sum = 0;
            int count = 1;
            for (int x: arr) {
                sum+=x; 
                count++;           
            }
            int avg = sum/count; 
            return avg;
        }
        
    // 2. Write a Java program to test if an array contains a specific value.
    public boolean contains(int[] arr,int val) {
        for(int x: arr) {
            if(x==val) {
                return true;
            }
        }
        return false;
    }
    //3. Write a Java program to find the maximum and minimum value of an array.
    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int x: arr) {
            if(x>max) {
                max=x;
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for(int x: arr) {
            if(x<min) {
                min=x;
            }
        }
        return min;
    }

    // 4. Write a Java program to revers the element of a one-dimensional array.
    public static int[] reverse(int[] arr) {
        int minIndex = 0;
        int maxIndex = arr.length-1;
        while(minIndex!=maxIndex)  {
            int temp = arr[minIndex];
            arr[minIndex] = arr[maxIndex];
            arr[maxIndex] = temp;
            minIndex++;
            maxIndex--;
        }
        return arr;
    }

    // 1. Write a java program to Add two 2x3 matrices
    public static int[][] addTwoDimMatrix(int[][] arr1, int[][] arr2, int row, int column) {
        int[][] addArr = new int[row][column];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++) {
                addArr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return addArr;
    }

    // 2. Write a java program to print transpose 2X2 matrices
    public static int[][] transposeOFMatrix(int[][] arr, int row, int column) {
        int[][] tp = new int[column][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++) {
                tp[j][i] = arr[i][j];
            }
        }
        return tp;
    }
    // 3. Write a java program to print mirror 2X2 matrices
    public static int[][] mirrorOfTwoByTwoMatrix(int[][] arr){
        int[][] mirArr = new int[2][2];
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++) {
                if(i==j && i==0){
                    mirArr[i][j] = arr[1][1];
                } else if (i==j && j==1) {
                    mirArr[i][j] = arr[0][0];
                } else {
                    mirArr[i][j] = arr[j][i];
                }
            }
        }
        return mirArr;
    }
    // 4. Write a java program to Multiply two 2x3 matrices
    //error
    
    

}