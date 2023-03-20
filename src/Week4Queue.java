import java.util.*;

class QueueNode {
    int value;
    QueueNode next;

    QueueNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class Queue {
    QueueNode head;
    QueueNode tail;

    Queue() {
        this.head = null;
        this.tail = null;
    }

    void enqueue(int value) {
        QueueNode newNode = new QueueNode(value);
        if(tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if(head == null) {
            head = newNode;
        }
    }

    int dequeue() {
        if(head == null) {
            throw new RuntimeException("Queue is empty");
        }
        int value = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        return value;
    }
}

public class Week4Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue queue = new Queue();

        for(int i = 0; i < n; i++) {
            String operation = scanner.next();
            if(operation.equals("E")) {
                int value = scanner.nextInt();
                queue.enqueue(value);
            } else if(operation.equals("D")) {
                int value = queue.dequeue();
                System.out.println(value);
            }
        }
    }
}