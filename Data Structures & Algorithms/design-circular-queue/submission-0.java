class MyCircularQueue {
    int[] arr;
    int f;
    int r;
    int s;
    public MyCircularQueue(int k) {
        arr = new int[k];
        f = 0;
        r = 0;
        s = 0;
    }

    public boolean enQueue(int value) {
        if (isFull())
            return false;
        arr[r] = value;

        r = (r + 1) % arr.length;

        s++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty())
            return false;
        f = (f + 1) % arr.length;
        s--;
        return true;
    }

    public int Front() {
        if (isEmpty())
            return -1;
        return arr[f];
    }

    public int Rear() {
        if (isEmpty())
            return -1;
        return arr[(r - 1 + arr.length) % arr.length];
    }

    public boolean isEmpty() {
        return s == 0;
    }

    public boolean isFull() {
        return s==arr.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */