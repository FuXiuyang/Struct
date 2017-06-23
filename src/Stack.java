/**
 * Created by fuxiuyang on 17-6-21.
 */
public class Stack {
    private Node first = null;
    private int size = 0;

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void Push(int data){
        Node node = new Node();
        node.data = data;
        node.next = first;
        first = node;
        size ++;
    }

    public int Pop(){
        Node node = first;
        first = first.next;
        return node.data;
    }

}
