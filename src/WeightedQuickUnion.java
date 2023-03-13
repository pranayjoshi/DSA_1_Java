public class WeightedQuickUnion {

    private int[] id;

    private int[] sz;

    public WeightedQuickUnion(int N) {
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i <= N; i++){
            id[i] = i;
        }
    }

    private int root(int i) {
        while (id[i] != i) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q){
        return ( id[p]== id[q]);
    }

    public void union(int p, int q){
        int i = root(p);
        int j = root(q);

        if (i==j) {
            return;
        }
        else if (sz[i] > sz[j]){
            id[i] = j;
            sz[j] += sz[i];
        } else{
            id[j] = i;
            sz[i] += sz[j];
        } 
    }
}
