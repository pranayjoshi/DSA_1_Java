public class Queue {
    private Node first = null;
    private Node last = null;

    private class Node {
        String item;
        Node next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void Push(String item){
        Node prev = last;
        last = new Node();
        last.item = item;
        first.next = prev;
        if (isEmpty()){
            first = last;
        }
        else {
            prev.next = last;
        }

    }

    public String Pop(){
        if (isEmpty()){
            last = null;
            System.out.println("underflow");
            return null;
        } else {
            String item = first.item;
            first = first.next;
            return item;
        }
    }
}
