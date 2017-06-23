/**
 * Created by fuxiuyang on 17-6-21.
 */
public class Queue {

    private Node head = null;

    private Node last = new Node();

    private int size = 0;

    public void enqueue(int data){
        Node node = new Node();
        node.data = data;
        last.next = node;
        last = node;
        if (size == 0){
            head = node;
        }
        size ++;
    }

    public int dequeue(){
        if (size > 0){
            Node node = head;
            head = head.next;
            size --;
            return node.data;
        }
        return -1;
    }
}
