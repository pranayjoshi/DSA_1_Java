public class BinarySearch {
    public static void main(String[] args){
        int[] N = {1,2,3,4,5,6,7,8};
        int key = 7;
        System.out.println(BinarySearchs(N, key));
    }

    public static int BinarySearchs(int[] N, int key){
        int low = 0;
        int high = N.length - 1;
        while (low <= high) {
            int mid = low + (int)((high - low)/2);
            if (N[mid] > key){
                high -= 1;
            } else if (N[mid] < key) {
                low += 1;
            } else {
                return mid;
            }

        }
        
        return -1;
    }

}
