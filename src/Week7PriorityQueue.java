import java.util.*;

public class Week7PriorityQueue {
    private List<Integer> heap;

    public Week7PriorityQueue() {
        heap = new ArrayList<>();
    }

    public void insert(int val) {
        heap.add(val);
        heapifyUp(heap.size() - 1);
    }

    public int extractMax() {
        if (heap.size() == 0) {
            throw new NoSuchElementException();
        }
        int maxVal = heap.get(0);
        int lastVal = heap.remove(heap.size() - 1);
        if (heap.size() > 0) {
            heap.set(0, lastVal);
            heapifyDown(0);
        }
        return maxVal;
    }

    public List<Integer> getHeap() {
        return heap;
    }

    public void heapifyUp(int i) {
        int parent = (i - 1) / 2;
        if(parent >= 0 && heap.get(parent) < heap.get(i)) {
            swap(parent, i);
            heapifyUp(parent);
        }
    }

    private void heapifyDown(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < heap.size() && heap.get(left) > heap.get(largest)) {
            largest = left;
        }
        if (right < heap.size() && heap.get(right) > heap.get(largest)) {
            largest = right;
        }
        if (largest != i) {
            swap(i, largest);
            heapifyDown(largest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Week7PriorityQueue maxHeap = new Week7PriorityQueue();

        for (int i = 0; i < n; i++) {
            String operation = scanner.next();
            if(operation.equals("I")) {
                int val = scanner.nextInt();
                maxHeap.insert(val);
            } else if(operation.equals("E")) {
                System.out.println(maxHeap.extractMax());
            } else if(operation.equals("P")) {
                List<Integer> heap = maxHeap.getHeap();
                for (int j = 0; j < heap.size(); j++) {
                    System.out.println(heap.get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}