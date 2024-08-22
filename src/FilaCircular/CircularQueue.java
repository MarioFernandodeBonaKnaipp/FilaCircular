package FilaCircular;

public class CircularQueue<T> {
    private int top = -1;
    private int base = 0;
    private T[] data;

    public CircularQueue(int size) {
        data = (T[]) new Object[size];
    }

    public void add(T item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add more items.");
            return;
        }
        top = move(top);
        data[top] = item;
    }

    public T remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to remove.");
            return null;
        }
        T item = data[base];
        data[base] = null;
        base = move(base);
        return item;
    }

    public void clear() {
        top = -1;
        base = 0;
        data = (T[]) new Object[data.length];
    }

    public boolean isFull() {
        return move(top) == base && data[base] != null;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private int move(int position) {
        return (position + 1) % data.length;
    }

    public void display() {
        System.out.print("Queue: ");
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                System.out.print(data[i] + " ");
            }
        }
        System.out.println();
    }
}
