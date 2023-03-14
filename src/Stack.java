public class Stack {

    private Node first = null;

    private class Node {
        String item;
        Node next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void Push(String item){
        Node prev = first;
        first = new Node();
        first.item = item;
        first.next = prev;
    }

    public String Pop(){
        if (isEmpty()){
            System.out.println("underflow");
            return null;
        } else {
            String item = first.item;
            first = first.next;
            return item;
        }
    }
}
