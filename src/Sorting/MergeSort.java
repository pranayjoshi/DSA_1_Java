package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,3,6,8,9};
        int[] a = MergeSort(arr1, 0, 4, 8);
        System.out.println(Arrays.toString(a));
    }

    public static int[] MergeSort(int[] arr1, int beg, int mid, int end) {
        

        int n1 = mid - beg + 1;    
        int n2 = end - mid;    
          
        int[] LeftArray = new int[n1];
        int[] RightArray = new int[n2]; //temporary arrays  
          
        /* copy data to temp arrays */  
        for (int i = 0; i < n1; i++){
            LeftArray[i] = arr1[beg + i];
        }

        for (int j = 0; j < n2; j++){    
            RightArray[j] = arr1[mid + 1 + j];
        }

        int i,j,k;

        i=0;
        j=0;
        k=0;

        while(i < n1 && j < n2){
            if (LeftArray[i] < RightArray[j]){
                arr1[k] = LeftArray[i];
                i++;
            }

            else {
                arr1[k] = RightArray[j];
                j++;
            }

            k++;

        }
        return arr1;


    }
}
