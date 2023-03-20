import java.util.*;

class StackNode {
    int value;
    StackNode next;

    StackNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class Stack {
    private StackNode head;

    Stack() {
        this.head = null;
    }

    void push(int value) {
        StackNode newNode = new StackNode(value);
        newNode.next = head;
        head = newNode;
    }

    int pop() {
        if (head == null) {
            throw new RuntimeException("Stack is empty");
        }
        int value = head.value;
        head = head.next;
        return value;
    }
}

public class Week4Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack stack = new Stack();

        for(int i = 0; i < n; i++) {
            String operation = scanner.next();
            if (operation.equals("PU")) {
                int value = scanner.nextInt();
                stack.push(value);
            } else if (operation.equals("PO")) {
                int value = stack.pop();
                System.out.println(value);
            }
        }
    }
}