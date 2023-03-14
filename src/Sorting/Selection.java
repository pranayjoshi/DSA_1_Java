package Sorting;

public class Selection{
    private static Comparable[] a = {1,3,2,7,9,6,5,3};
    public static void main(String[] args){
        sort();
        System.out.println(a.toString());
    }
    public static void sort(){
        int N = a.length;
        for (int i = 0; i<N;i++){
            int min = i;
            for (int j = i+1; j<N; j++){
                if (less(a[j], a[min])){
                    min = j;
                }
            }
            exch(i, min);
        }
    }

    public static boolean less(Comparable x, Comparable y){
        return x.compareTo(y) < 0;
    }

    public static Comparable[] exch(int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
    
}
