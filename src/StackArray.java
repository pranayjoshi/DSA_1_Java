public class StackArray {

    private String[] s;

    private int N=0;

    public void definyingStack(int capacity){
        s = new String[capacity];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public void Push(String item){
        s[N++] = item;
    }

    public String Pop(){
        if (isEmpty()){
            System.out.println("underflow");
            return null;
        } else {
            String item = s[--N];
            s[N] = null;
            return item;
        }
    }
}
