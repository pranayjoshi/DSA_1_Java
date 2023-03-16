package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,3,6,8,9};
        sort(arr1, 0, arr1.length-1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void sort(int arr1[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;
  
            // Sort first and second halves
            sort(arr1, l, m);
            sort(arr1, m + 1, r);
  
            // Merge the sorted halves
            MergeSort(arr1, l, m, r);
        }
    }

    public static void MergeSort(int[] arr1, int beg, int mid, int end) {
        

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
        k=beg;

        while(i < n1 && j < n2){
            if (LeftArray[i] <= RightArray[j]){
                arr1[k] = LeftArray[i];
                i++;
            }

            else {
                arr1[k] = RightArray[j];
                j++;
            }

            k++;

        }

        while (i < n1) {
            arr1[k] = LeftArray[i];
            i++;
            k++;
        }
  
        while (j < n2) {
            arr1[k] = RightArray[j];
            j++;
            k++;
        }


    }
}
