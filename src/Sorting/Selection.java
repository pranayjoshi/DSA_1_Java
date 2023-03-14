package Sorting;

public class Selection{
    
    public static void sort(Comparable[] a){
        int N = a.length;
        for (int i = 0; i<=N;i++){
            int min = i;
            for (int j = i+1; j<=N; j++){
                if (less(a[j], a[min])){
                    min = j;
                }
            }
        }
    }

    public static boolean less(Comparable x, Comparable y){
        return x.compareTo(y) < 0;
    }

    public static Comparable[] exch(Comparable[] a, int i, int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
}
